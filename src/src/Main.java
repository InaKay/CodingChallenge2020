package src;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		CSVReader csvReader = new CSVReader("./assets/msg_standorte_deutschland.csv", ",");
		ArrayList<Location> locations = csvReader.readCSV();
		
		Point point1 = locations.get(0).getPoint();
		Point point2 = locations.get(1).getPoint();
		Distance distance = new Distance(point1, point2);
		Double distanceKm = distance.calculateDistanceOfTwoPointsInKm();
		System.out.println(distanceKm);
		
		
		/*
		for(Location location : locations) {
			System.out.print(location.toString());
		}
		*/
	}

}
