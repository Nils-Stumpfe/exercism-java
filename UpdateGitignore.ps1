# Definiere den Ordnerpfad und den Pfad zur .gitignore-Datei
$ordnerX = "C:\Users\Danniel\Exercism\java"
$gitignorePfad = Join-Path -Path $ordnerX -ChildPath ".gitignore"

# Marker, die den automatisch generierten Bereich kennzeichnen
$beginMarker = "# BEGIN AUTO-GENERATED"
$endMarker   = "# END AUTO-GENERATED"

# Prüfe, ob die .gitignore-Datei existiert
if (-not (Test-Path $gitignorePfad)) {
    Write-Host "Die .gitignore-Datei existiert nicht im Ordner $ordnerX." -ForegroundColor Red
    exit 1
}

# Ermittle alle Unterordner im Zielordner
$unterordner = Get-ChildItem -Path $ordnerX -Directory | Select-Object -ExpandProperty Name

if (-not $unterordner -or $unterordner.Count -eq 0) {
    Write-Host "Es wurden keine Unterordner gefunden." -ForegroundColor Yellow
    exit 0
}

# Erzeuge neue Einträge, wobei jedem Unterordnername ein "!" vorangestellt wird
$autoEntries = $unterordner | ForEach-Object { "!" + $_ }

# Lese den Inhalt der .gitignore-Datei in ein Array ein
$lines = Get-Content $gitignorePfad

# Suche nach den Marker-Zeilen im Inhalt
$startIndex = [Array]::IndexOf($lines, $beginMarker)
$endIndex   = [Array]::IndexOf($lines, $endMarker)

if ($startIndex -ge 0 -and $endIndex -ge 0 -and $startIndex -lt $endIndex) {
    Write-Host "Bereits vorhandene Marker gefunden. Aktualisiere den Abschnitt zwischen '$beginMarker' und '$endMarker'." -ForegroundColor Cyan

    # Teile den vorhandenen Inhalt in den Bereich vor und nach dem Markerbereich
    $before = $lines[0..$startIndex]
    $after  = $lines[$endIndex..($lines.Count - 1)]

    # Setze den neuen Inhalt zusammen: Vorheriger Inhalt, dann die neuen Einträge, dann der restliche Inhalt
    $newContent = $before + $autoEntries + $after
}
else {
    Write-Host "Keine Marker gefunden. Füge die Marker und die Einträge am Ende der Datei hinzu." -ForegroundColor Yellow

    # Falls die Datei nicht leer ist und nicht mit einer leeren Zeile endet, füge eine leere Zeile hinzu
    if ($lines.Count -gt 0 -and $lines[-1] -ne "") {
         $lines += ""
    }
    # Erzeuge den neuen Block: Marker, die neuen Einträge und den abschließenden Marker
    $newBlock = @(
        $beginMarker
    ) + $autoEntries + @(
        $endMarker
    )
    # Füge den neuen Block an den bestehenden Inhalt an
    $newContent = $lines + $newBlock
}

# Schreibe den neuen Inhalt in die .gitignore-Datei (UTF8-Codierung)
$newContent | Set-Content -Path $gitignorePfad -Encoding UTF8

# Ausgabe der aktualisierten Einträge
Write-Host "`nDie folgenden Einträge wurden in die .gitignore-Datei geschrieben:" -ForegroundColor Green
$autoEntries | ForEach-Object { Write-Host "- $_" }

Write-Host "`nAktualisierung abgeschlossen." -ForegroundColor Green
