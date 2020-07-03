package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		CSVReader csvReader = new CSVReader("./assets/msg_standorte_deutschland.csv", ",");
		ArrayList<Location> locations = csvReader.readCSV();
		
		int i = 0;
		ArrayList<Route> routes = new ArrayList<Route>();
        while (i < locations.size()) {
        	int j = i + 1;
        	Location currentLocation = locations.get(i);
        	while(j < locations.size()) {
        		Location nextLocation = locations.get(j);
        		Route route = new Route(currentLocation, nextLocation);
        		double distance = route.calculateDistanceOfTwoPoints();
        		route.setDistance(distance);
        		routes.add(route);
        		j++;
        	}
        	System.out.println();
            i++;
        }

        for(Route route : routes) {
        	if(route.getLocation1().getNumber() == 1 || route.getLocation2().getNumber() == 1) {
               	System.out.println(route.getLocation1().getNumber()+ 
    					" => "+ route.getLocation2().getNumber() + " : " +route.getDistance());
        	}
        }
	}
}
