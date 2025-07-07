
# Auto-elevate if not already running as Administrator
if (-not ([Security.Principal.WindowsPrincipal]::new(
        [Security.Principal.WindowsIdentity]::GetCurrent()
)).IsInRole([Security.Principal.WindowsBuiltInRole]::Administrator))
{
    Write-Host "Restarting this script as Administrator..."
    Start-Process powershell "-NoProfile -ExecutionPolicy Bypass -File `"$PSCommandPath`"" -Verb RunAs
    exit
}

Write-Host "Checking if SSH is already configured with GitHub..."

$sshTest = ssh -o StrictHostKeyChecking=accept-new -T git@github.com 2>&1
if ($sshTest -match "successfully authenticated") {
    Write-Host "SSH is already set up and working with GitHub."
    exit
} else {
    Write-Host "SSH test failed. Output:"
    Write-Host $sshTest
}

$sshDir = "$env:USERPROFILE\.ssh"
$privateKeys = Get-ChildItem -Path $sshDir -File | Where-Object { $_.Name -notlike '*.pub' -and $_.Length -gt 100 }

if (-not $privateKeys) {
    Write-Host ""
    Write-Host "No private SSH keys found. Generating a new ed25519 key pair..."
    ssh-keygen -t ed25519 -f "$sshDir\id_ed25519"
    $privateKeys = @(Get-ChildItem -Path $sshDir -File | Where-Object { $_.Name -notlike '*.pub' -and $_.Length -gt 100 })
} else {
    Write-Host ""
    Write-Host "Found existing SSH key(s):"
    $privateKeys | ForEach-Object { Write-Host " - $($_.Name)" }
}

Write-Host ""
Write-Host "Starting ssh-agent service to cache your passphrase..."
Get-Service ssh-agent | Set-Service -StartupType Automatic
Start-Service ssh-agent

Write-Host ""
Write-Host "Adding your SSH key to the agent (this will prompt once if needed)..."
ssh-add $privateKeys[0].FullName

$pubKeyPath = "$($privateKeys[0].FullName).pub"
if (-not (Test-Path $pubKeyPath)) {
    $pubKeyPath = Get-ChildItem -Path $sshDir -File | Where-Object { $_.Name -like '*.pub' } | Select-Object -First 1 | ForEach-Object { $_.FullName }
}

if (-not $pubKeyPath) {
    Write-Host "No public key found. Please check your SSH key generation."
    exit
}

Write-Host ""
Write-Host "Copy the SSH public key below and add it to your GitHub account:"
Write-Host "--------------------------------------"
Get-Content $pubKeyPath
Write-Host "--------------------------------------"

# Automatically copy to clipboard
Get-Content $pubKeyPath | Set-Clipboard

Write-Host ""
Write-Host "Your SSH public key has also been copied to your clipboard."
Write-Host "Next, we'll open your default browser to GitHub so you can add it."
Read-Host "Press Enter to continue..."

Start-Process "https://github.com/settings/keys"

Read-Host "After you've added the SSH key to GitHub press Enter to exit"
