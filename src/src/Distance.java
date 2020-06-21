package src;

public class Distance {
	Point point1;
	Point point2;
	int RADIUS = 6371;
	
	public Distance(Point point1, Point point2) {
		this.point1 = point1;
		this.point2 = point2;
	}

	/** calcaulate the distance of two points with the haversine formula 
	 ** see the formula on https://www.movable-type.co.uk/scripts/latlong.html 
	 */
	public double calculateDistanceOfTwoPointsInKm() {
		double dLat = Math.toRadians(point1.getDegreeOfLatitude() - point2.getDegreeOfLatitude());
		double dLong = Math.toRadians(point2.getDegreeOfLongitude() - point1.getDegreeOfLongitude());
        double lat1 = Math.toRadians(point1.getDegreeOfLatitude());
        double lat2 = Math.toRadians(point2.getDegreeOfLatitude());
        
        double a = Math.pow(Math.sin(dLat / 2), 2)
        		+ Math.cos(lat1) * Math.cos(lat2) 
        		* Math.pow(Math.sin(dLong / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double d = this.RADIUS * c;
        
        return Math.round(d * 100.0) / 100.0;
	}

}
