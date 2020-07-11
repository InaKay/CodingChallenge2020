package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class NearestNeighbour {
	
	public Route findShortestRoute(ArrayList<Location> locations) {
		ArrayList<Location> shortestRouteLocations = new ArrayList<Location>(locations.size());
		Route route = new Route(locations);
		
		printSeparator();
		printAllLocations(locations);
		printTotalDistance(route);
		printSeparator();
		
		Location location = locations.get(0); // start at the headquarter
		updateRoute(shortestRouteLocations, locations, location);
		
		while(locations.size() >= 1) {
			location = getNextLocation(locations, location);
			printRouteInformations(shortestRouteLocations, location);
			updateRoute(shortestRouteLocations, locations, location);
		}
		
		route = new Route(shortestRouteLocations);
		
		printSeparator();
		printShortestRouteInformations(route);
		printTotalDistance(route);
		printSeparator();
		
		return route;
	}
	
	public void updateRoute(ArrayList<Location> shortestRouteLocations, ArrayList<Location> locations, Location location) {
		shortestRouteLocations.add(location);
		locations.remove(location);
	}
	
	public Location getNextLocation(ArrayList<Location> locations, Location location) {
		Location locationMinDistance = locations.get(0);
	    
	    for(int i=1; i < locations.size(); i++) {
	    	if(locations.get(i).calculateDistance(location) < locationMinDistance.calculateDistance(location)) {
	    		locationMinDistance = locations.get(i);
	    	}
	    }
	    
	    return locationMinDistance;
	}
	
	public void printSeparator() {
		System.out.println("---------------");
	}
	
	public void printAllLocations(ArrayList<Location> locations) {
		System.out.println("Location names: " + Arrays.toString(locations.toArray()));
	}
	
	public void printTotalDistance(Route route) {
		System.out.println("Total distance: " + route.calculateTotalDistance());
	}
	
	public void printRouteInformations(ArrayList<Location> visitedRoutes, Location nextLocation) {
		System.out.println("Visted Locations: " + Arrays.toString(visitedRoutes.toArray()));
		System.out.println("Next Location: " + nextLocation.getName() + "\n");
	}
	
	public void printShortestRouteInformations(Route shortestRoute) {
		System.out.println("Shortest route: " + shortestRoute);
	}
}
