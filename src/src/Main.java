package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		boolean firstRun = true;

		CSVReader csvReader = new CSVReader("./assets/msg_standorte_deutschland.csv", ",");
		System.out.println("CSV erfolgreich eingelesen");
		ArrayList<Location> locations = csvReader.readCSV();
		
		while (true) {
			if (firstRun) {
				System.out.println(
						"Wollen Sie einen weiteren Standort eingeben? (j = Ja / n = Nein / q = Programm beenden)");
				input = scanner.next();
				if (input.equals("j")) {
					Location location = new Location();
					location = location.createNewLocation(scanner);
					locations.add(location);
					firstRun = false;
				} else if (input.equals("q")) {
					break;
				} else if (!(input.equals("n"))) {
					System.out.println("Die Eingabe war ungültig");
					continue;
				}
			}

			System.out.println(
					"Ab welchen Standort wollen Sie starten? (z = msg-Zentrale / Standortnamen / q = Programm beenden)");
			input = scanner.next();
			if (input.equals("q")) {
				break;
			}
			
			boolean findLocationName = false;
			int startLocationIndex = 0;
			int index = 0;
			if (!(input.equals("z"))) {
				for (Location loaction : locations) {
					if (input.equals(loaction.getName())) {
						startLocationIndex = index;
						findLocationName = true;
					}
					index++;
				}
			} else {
				findLocationName = true;
			}

			if (!findLocationName) {
				System.out.println("Der Standort " + input + " wurde nicht gefunden. "
						+ "Das Programm startet bei der msg-Zentrale");
			}

			NearestNeighbour nearestNeighbour = new NearestNeighbour();
			ArrayList<Location> routeLocations = (ArrayList<Location>) locations.clone();
			nearestNeighbour.findShortestRoute(routeLocations, startLocationIndex);
		}

		System.out.println("Programm wurde beendet");
		scanner.close();
	}
}
