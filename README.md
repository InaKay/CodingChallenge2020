# Coding Challenge 2020 - get in it - .msg

Dieses Programm ermittelt effizent den kürzesten Weg zu jedem Standort der die Firma .msg führt.
Unterwegs darf dazu jeder Standort nur einmal aufgesucht werden.

## Wie läuft der Algorithmus ab?

Zuerst wird die passende CSV Datei mit den benötigten Standorten eingelesen.
Zusätzlich kann ein weiterer Standort hinzugefügt werden.
In Anschluss wird durch die Eingabe des Namen der Start-Standort festgelegt.
Nun wird die kürzeste Route ermittelt und die Gesamtentfernung ermittelt.

## Wie starte ich das Programm?

1. Repository herunterladen
2. In Linux Terminal bzw. Windows Konsole (cmd) zum Ordner, wo das Repository abgelegt wurde, springen
3. Befehl java -jar CodingChallenge2020.jar ausführen

## Welcher Algorithmus wurde für die kürzeste Route verwendet?

Für die Ermittlung der kürzesten Route wurde das Nächster-Nachbar-Heuristik (engl: Nearest-Neighbor-Heuristik) verwendet. Es zeichnet sich gerade durch seine Einfachheit in der Implementation und durch seine simple Komplexität aus. 

