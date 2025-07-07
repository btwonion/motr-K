function Ensure-GitSSH {
    Write-Host "Checking if SSH already works with GitHub..."
    ssh -T git@github.com 2>$null
    if ($LASTEXITCODE -eq 1 -or $LASTEXITCODE -eq 255) {
        Write-Host "SSH connection failed. Trying to start ssh-agent and add key."

        $sshDir = "$env:USERPROFILE\.ssh"
        $privateKeys = Get-ChildItem -Path $sshDir -File | Where-Object {
            $_.Name -notlike '*.pub' -and $_.Length -gt 100
        }

        if (-not $privateKeys) {
            Write-Host "No private SSH keys found. Generating new one."
            ssh-keygen -t ed25519 -f "$sshDir\id_ed25519" -N ""
            $privateKeys = @(Get-ChildItem -Path $sshDir -File | Where-Object {
                $_.Name -notlike '*.pub' -and $_.Length -gt 100
            })
        }

        Write-Host "Starting ssh-agent..."
        $agentOutput = ssh-agent
        Invoke-Expression $agentOutput

        Write-Host "Adding private key to agent..."
        ssh-add $privateKeys[0].FullName

        $pubKeyPath = "$($privateKeys[0].FullName).pub"
        if (-not (Test-Path $pubKeyPath)) {
            $pubKeyPath = Get-ChildItem -Path $sshDir -File | Where-Object { $_.Name -like '*.pub' } | Select-Object -First 1 | ForEach-Object { $_.FullName }
        }

        Write-Host "`nCopy the SSH public key below and add it to GitHub:"
        Write-Host "--------------------------------------"
        Get-Content $pubKeyPath
        Write-Host "--------------------------------------"
        Write-Host "https://github.com/settings/keys"
        Read-Host "Press Enter after adding key..."

        Write-Host "Testing SSH connection again..."
        ssh -T git@github.com
    } else {
        Write-Host "SSH already works with GitHub."
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
