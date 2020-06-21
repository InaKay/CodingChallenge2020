package src;

public class Point {
	double degreeOfLatitude;
	double degreeOfLongitude;
	
	public Point(double degreeOfLatitude, double degreeOfLongitude) {
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
