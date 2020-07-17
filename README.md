# Coding Challenge 2020 - get in it - .msg

Dieses Programm ermittelt effizent den k�rzesten Weg zu jedem Standort der die Firma .msg f�hrt.
Unterwegs darf dazu jeder Standort nur einmal aufgesucht werden.

## Wie l�uft der Algorithmus ab?

Zuerst wird die passende CSV Datei mit den ben�tigten Standorten eingelesen.
Zus�tzlich kann ein weiterer Standort hinzugef�gt werden.
In Anschluss wird durch die Eingabe des Namen der Start-Standort festgelegt.
Nun wird die k�rzeste Route ermittelt und die Gesamtentfernung ermittelt.

## Wie starte ich das Programm?

1. Repository herunterladen
2. In Linux Terminal bzw. Windows Konsole (cmd) zum Ordner, wo das Repository abgelegt wurde, springen
3. Befehl java -jar CodingChallenge2020.jar ausf�hren

## Welcher Algorithmus wurde f�r die k�rzeste Route verwendet?

F�r die Ermittlung der k�rzesten Route wurde das N�chster-Nachbar-Heuristik (engl: Nearest-Neighbor-Heuristik) verwendet. Es zeichnet sich gerade durch seine Einfachheit in der Implementation und durch seine simple Komplexit�t aus. 

