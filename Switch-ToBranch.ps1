
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
