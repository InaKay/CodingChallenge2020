package src;

public class Coordinate {
	double degreeOfLatitude;
	double degreeOfLongitude;
	
	public Coordinate(double degreeOfLatitude, double degreeOfLongitude) {
		this.degreeOfLatitude = degreeOfLatitude;
		this.degreeOfLongitude = degreeOfLongitude;
	}
	
	public double getDegreeOfLatitude() {
		return degreeOfLatitude;
	}
	public void setDegreeOfLatitude(double degreeOfLatitude) {
		this.degreeOfLatitude = degreeOfLatitude;
	}
	public double getDegreeOfLongitude() {
		return degreeOfLongitude;
	}
	public void setDegreeOfLongitude(double degreeOfLongitude) {
		this.degreeOfLongitude = degreeOfLongitude;
	}
}
