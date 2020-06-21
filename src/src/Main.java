package src;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		CSVReader csvReader = new CSVReader("./assets/msg_standorte_deutschland.csv", ",");
		ArrayList<Location> locations = csvReader.readCSV();
		
		int i = 0;
        while (i < locations.size()) {
        	int j = i + 1;
        	Point currentPoint = locations.get(i).getPoint();
        	while(j < locations.size()) {
        		if (locations.get(i) != locations.get(j)) {
        			Point nextPoint = locations.get(j).getPoint();
        			Route route = new Route(currentPoint, nextPoint);
        			Double distance = route.calculateDistanceOfTwoPoints();
        			System.out.println("Number1:" + locations.get(i).getNumber()+ 
        					" Number2: "+ locations.get(j).getNumber() + " Distanz: " +distance);
        		}
        		j++;
        	}
        	System.out.println();
            i++;
        }
	}
}
