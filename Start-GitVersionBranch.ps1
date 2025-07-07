# Start-GitVersionBranch.ps1
# Run from the root of a NeoForge or Forge mod project

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
