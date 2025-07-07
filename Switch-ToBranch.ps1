function Ensure-GitSSH {
    Write-Host "Checking if SSH already works with GitHub..."

    # Try SSH directly
    ssh -T git@github.com 2>$null
    if ($LASTEXITCODE -eq 1 -or $LASTEXITCODE -eq 255) {
        Write-Host "SSH connection to GitHub failed or not yet authorized."

        $sshDir = "$env:USERPROFILE\.ssh"
        $privateKeys = Get-ChildItem -Path $sshDir -File | Where-Object { $_.Name -notlike '*.pub' }

        if (-not $privateKeys) {
            Write-Host "No existing SSH keys found. Generating a new SSH key."
            ssh-keygen -t ed25519 -f "$sshDir\id_ed25519" -N ""
            $privateKeys = @(Get-ChildItem -Path $sshDir -File | Where-Object { $_.Name -notlike '*.pub' })
        } else {
            Write-Host "Found existing SSH key(s):"
            $privateKeys | ForEach-Object { Write-Host " - $($_.Name)" }
        }

        Write-Host "Starting ssh-agent and adding your first private key."
        Start-Process powershell -ArgumentList "-NoExit","-Command `\"ssh-agent -s; ssh-add '$($privateKeys[0].FullName)'`\""

        $pubKeyPath = "$($privateKeys[0].FullName).pub"
        if (-not (Test-Path $pubKeyPath)) {
            $pubKeyPath = Get-ChildItem -Path $sshDir -File | Where-Object { $_.Name -like '*.pub' } | Select-Object -First 1 | ForEach-Object { $_.FullName }
        }

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

        Write-Host "Testing SSH connection again..."
        ssh -T git@github.com
    } else {
        Write-Host "SSH already set up and working with GitHub."
    }
}


# Call the function before doing git work
# Ensure SSH keys are set up before proceeding
Ensure-GitSSH

# Prompt for GitHub branch name
$githubUser = "Wanderers-Of-The-Rift"
$branchName = Read-Host "Enter the branch name"

# Determine repo name from current folder
$currentPath = Get-Location
$repoName    = Split-Path $currentPath -Leaf

# Update origin to SSH URL
Write-Host "Updating origin to ssh://github.com/$githubUser/$repoName.git..." -ForegroundColor Cyan
# Ensure remote 'origin' is set to SSH URL
git remote set-url origin "git@github.com:$githubUser/$repoName.git"

# Fetch latest from origin
Write-Host "Fetching from origin..." -ForegroundColor Cyan
git fetch --all

# Stash local changes if any
if (git status --porcelain) {
Write-Host "Stashing uncommitted changes (including untracked)..." -ForegroundColor Yellow
# Stash any local changes to avoid conflicts
git stash push -u -m "Auto-stash before switching to $branchName"
}

# Checkout or create the target branch
if (-not (git rev-parse --verify $branchName 2>$null)) {
Write-Host "Branch '$branchName' not found locally. Creating and tracking origin/$branchName..." -ForegroundColor Cyan
# Create and checkout new branch
git checkout -b $branchName "origin/$branchName"
} else {
Write-Host "Checking out existing branch '$branchName'..." -ForegroundColor Cyan
# Checkout existing branch
git checkout $branchName
}

# Hard reset to remote branch
Write-Host "Resetting to origin/$branchName (this will discard local commits)..." -ForegroundColor Cyan
# Hard reset local branch to match remote
git reset --hard "origin/$branchName"

# Clean untracked files/folders
Write-Host "Cleaning untracked files and folders..." -ForegroundColor Cyan
# Remove untracked files and directories
git clean -fd

Write-Host "Your working tree now matches origin/$branchName." -ForegroundColor Green
