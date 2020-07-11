package src;

import java.util.ArrayList;
import java.util.Arrays;

public class Route {
	ArrayList<Location> locations = new ArrayList<Location>();

	public Route(ArrayList<Location> locations) {
		this.locations.addAll(locations);
	}
	
	public String toString() {
		return Arrays.toString(this.locations.toArray());
	}

	public int calculateTotalDistance() {
		int numberLocations = this.locations.size();
		int index = 0;
		double returnValue = 0;
		for(Location location : this.locations) {
			if (index < numberLocations - 1) {
				returnValue += location.calculateDistance(this.locations.get(index + 1)); 
			}
			index++;
		}
		// and add the last index distance with the first index
		returnValue += this.locations.get(numberLocations - 1).calculateDistance(this.locations.get(0));
		
		return (int)returnValue;
	}

}
