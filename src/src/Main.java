package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		CSVReader csvReader = new CSVReader("./assets/msg_standorte_deutschland.csv", ",");
		System.out.println("CSV file read successfully");
		ArrayList<Location> locations = csvReader.readCSV();
		NearestNeighbour nearestNeighbour = new NearestNeighbour();
		nearestNeighbour.findShortestRoute(locations);
	}
}
