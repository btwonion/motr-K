# Switch-ToBranch-WithSSH.ps1
# This script switches the working directory to match a specified remote branch,
# updating origin to use SSH and discarding any local changes.


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

<#
.SYNOPSIS
  Switch your local working tree to match a remote branch, discarding any local edits.
.DESCRIPTION
  Prompts for GitHub user & branch, rewrites `origin` to use SSH,
  stashes any local changes (and untracked files), then hard-resets and cleans
  to match the remote branch exactly.
#>

# Prompt for GitHub username and branch name
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
