package src;

public class Route {
	Location location1;
	Location location2;
	double distance;
	int RADIUS = 6371;
	
	public Route(Location location1, Location location2) {
		this.location1 = location1;
		this.location2 = location2;
	}
	
	/**
	 * calcaulate the distance in km of two points with the haversine formula 
	 * see the formula on https://www.movable-type.co.uk/scripts/latlong.html 
	 * @return
	 */
	public double calculateDistanceOfTwoPoints() {
		double degreeOfLatitude1 = location1.getPoint().getDegreeOfLatitude();
		double degreeOfLongitude1 = location1.getPoint().getDegreeOfLongitude();
		double degreeOfLatitude2 = location2.getPoint().getDegreeOfLatitude();
		double degreeOfLongitude2 = location2.getPoint().getDegreeOfLongitude();
		
		double dLat = Math.toRadians(degreeOfLatitude1 - degreeOfLatitude2);
		double dLong = Math.toRadians(degreeOfLongitude2 - degreeOfLongitude1);
        double lat1 = Math.toRadians(degreeOfLatitude1);
        double lat2 = Math.toRadians(degreeOfLatitude2);
        
        double a = Math.pow(Math.sin(dLat / 2), 2)
        		+ Math.cos(lat1) * Math.cos(lat2) 
        		* Math.pow(Math.sin(dLong / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double d = this.RADIUS * c;
        
        
        return Math.round(d * 100.0) / 100.0;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Location getLocation1() {
		return location1;
	}

	public void setLocation1(Location location1) {
		this.location1 = location1;
	}

	public Location getLocation2() {
		return location2;
	}

	public void setLocation2(Location location2) {
		this.location2 = location2;
	}
}
