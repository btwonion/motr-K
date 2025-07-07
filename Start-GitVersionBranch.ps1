# Start-GitVersionBranch-WithSSH.ps1
# This script increments the version in gradle.properties,
# creates a new Git branch for that version, commits, and pushes to GitHub over SSH.


# Ensure SSH keys are set up before proceeding
function Ensure-GitSSH {
    Write-Host "Checking for SSH key..."

    $sshDir = "$env:USERPROFILE\.ssh"
    $privateKey = Get-ChildItem -Path $sshDir -Include id_rsa, id_ed25519 -File -ErrorAction SilentlyContinue

    if (-not $privateKey) {
        Write-Host "No SSH key found. Generating a new SSH key."

        $email = Read-Host "Enter your email for SSH key"
        # Generate new SSH key
        ssh-keygen -t ed25519 -C $email -f "$sshDir\id_ed25519" -N ""

        Write-Host "SSH key generated."
    } else {
        Write-Host "SSH key already exists."
    }

    # Start ssh-agent and add private keys
    Write-Host "Starting ssh-agent and adding your key."
    # Start ssh-agent and add private keys
    Start-Process powershell -ArgumentList "-NoExit","-Command \"ssh-agent -s; ssh-add $sshDir\id_ed25519 2>$null; ssh-add $sshDir\id_rsa 2>$null\""

    $pubKeyPath = if (Test-Path "$sshDir\id_ed25519.pub") { "$sshDir\id_ed25519.pub" } else { "$sshDir\id_rsa.pub" }

    Write-Host "`nCopy the SSH public key below and add it to your GitHub account:"
    Write-Host "--------------------------------------"
    Get-Content $pubKeyPath
    Write-Host "--------------------------------------"

    Write-Host ""
    Write-Host "1. Go to your SSH keys page on GitHub:"
    Write-Host "   https://github.com/settings/keys"
    Write-Host ""
    Write-Host "2. Click 'New SSH key'."
    Write-Host "3. Paste the key you copied."
    Write-Host "4. Give it a title like 'My-PC' and save."

    Read-Host "Press Enter after you've added the SSH key to your GitHub account..."

    Write-Host "Testing SSH connection to GitHub..."
    # Verify SSH connection to GitHub
    ssh -T git@github.com
}

# Call the function before doing git work
# Ensure SSH keys are set up before proceeding
Ensure-GitSSH

function Increment-Version($version) {
    if ($version -match '^(\d+)\.(\d+)\.(\d+)$') {
        $major = [int]$matches[1]
        $minor = [int]$matches[2]
        $patch = [int]$matches[3] + 1
        return "$major.$minor.$patch"
    } else {
        Write-Host "Invalid version format. Using 1.0.0 as fallback."
        return "1.0.0"
    }
}

# Get modid from the current folder name (repo name)
$modid = Split-Path -Leaf (Get-Location)

# Path to gradle.properties
$gradlePropsPath = ".\gradle.properties"

if (-not (Test-Path $gradlePropsPath)) {
    Write-Host "ERROR: gradle.properties not found. Are you in the mod root directory?"
    exit 1
}

# Read and extract mod_version
$lines = Get-Content $gradlePropsPath
$currentVersionLine = $lines | Where-Object { $_ -match '^mod_version\s*=' }

if ($currentVersionLine -match '^mod_version\s*=\s*(.+)$') {
    $currentVersion = $matches[1].Trim()
    Write-Host "Current mod_version: $currentVersion"
} else {
    Write-Host "ERROR: mod_version not found in gradle.properties"
    exit 1
}

# Ask user if they want to increment mod_version
$answer = Read-Host "Do you want to increment the mod_version? (y/n)"
if ($answer -eq "y") {
    $newVersion = Increment-Version $currentVersion
    $lines = $lines | ForEach-Object {
        if ($_ -match '^mod_version\s*=') {
            "mod_version=$newVersion"
        } else {
            $_
        }
    }
    $lines | Set-Content $gradlePropsPath
    Write-Host "Updated mod_version to: $newVersion"
} else {
    $newVersion = $currentVersion
    Write-Host "Keeping mod_version: $newVersion"
    # Prompt for additional custom branch text
    $customText = Read-Host "Enter additional text for branch name (or leave blank for just $newVersion)"
    if ($customText -ne "") {
        $branchName = "$newVersion $customText"
    } else {
        $branchName = "$newVersion"
    }
}

$gitUser = "Wanderers-Of-The-Rift"

# Prompt for short description of the changes
$changeSummary = Read-Host "Enter a short description of the changes"

# Ensure Git is initialized and origin is set (if needed)
if (-not (Test-Path ".git")) {
    Write-Host "Initializing new Git repository..."
    git init
    git remote add origin "git@github.com:$gitUser/$modid.git"
}

# Create and checkout new branch named after mod version
if (-not $branchName) {
    $branchName = $newVersion
}
# Create and checkout new branch
git checkout -b $branchName

# Add all changes and commit with description
git add .
git commit -m "Release ${branchName}: $changeSummary"

# Push branch to GitHub
git push -u origin $branchName

# Confirmation
Write-Host ""
Write-Host "Branch '${branchName}' created and pushed to git@github.com:$gitUser/$modid.git"
Write-Host "Commit message: Release ${branchName}: $changeSummary"
