package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class NearestNeighbour {

	public Route findShortestRoute(ArrayList<Location> locations, int startLocationIndex) {
		ArrayList<Location> shortestRouteLocations = new ArrayList<Location>(locations.size());
		Route route = new Route(locations);
		Location startLocation = new Location();
		
		printSeparator();
		printAllLocations(locations);
		printTotalDistance(route);
		printSeparator();
		
		Location location = locations.get(startLocationIndex); // default start at the headquarter
		startLocation = location;
		updateRoute(shortestRouteLocations, locations, location);
		
		while(locations.size() >= 1) {
			location = getNextLocation(locations, location);
			printRouteInformations(shortestRouteLocations, location);
			updateRoute(shortestRouteLocations, locations, location);
		}
		printRouteInformations(shortestRouteLocations, startLocation);
		shortestRouteLocations.add(startLocation);
		
		route = new Route(shortestRouteLocations);
		
		printSeparator();
		printShortestRouteInformations(route);
		printTotalDistance(route);
		printSeparator();
		
		return route;
	}
	
	private void updateRoute(ArrayList<Location> shortestRouteLocations, ArrayList<Location> locations, Location location) {
		shortestRouteLocations.add(location);
		locations.remove(location);
	}
	
	private Location getNextLocation(ArrayList<Location> locations, Location location) {
		Location locationMinDistance = locations.get(0);
	    
	    for(int i = 1; i < locations.size(); i++) {
	    	if(locations.get(i).calculateDistance(location) < locationMinDistance.calculateDistance(location)) {
	    		locationMinDistance = locations.get(i);
	    	}
	    }
	    
	    return locationMinDistance;
	}
	
	private void printSeparator() {
		System.out.println("---------------");
	}
	
	private void printAllLocations(ArrayList<Location> locations) {
		System.out.println("Standortnamen: " + Arrays.toString(locations.toArray()));
	}
	
	private void printTotalDistance(Route route) {
		System.out.println("Gesamtentfernung: " + route.calculateTotalDistance());
	}
	
	private void printRouteInformations(ArrayList<Location> visitedRoutes, Location nextLocation) {
		System.out.println("Besuchte Standorte: " + Arrays.toString(visitedRoutes.toArray()));
		System.out.println("Nächster Standort: " + nextLocation.getName() + "\n");
	}
	
	private void printShortestRouteInformations(Route shortestRoute) {
		System.out.println("kürzeste Route: " + shortestRoute);
	}
}
