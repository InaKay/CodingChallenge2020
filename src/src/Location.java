package src;

public class Location {
	int number;
	String name;
	String street;
	String houseNumber;
	String postCode;
	String place;
	Point point;
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getHouseNumber() {
		return houseNumber;
	}
	
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public String getPostCode() {
		return postCode;
	}
	
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Location [number=" + number + ", name=" + name + ", street=" + street + ", houseNumber=" + houseNumber
				+ ", postCode=" + postCode + ", place=" + place + ", degreeOfLatitude=" + point.getDegreeOfLatitude()
				+ ", degreeOfLongitude=" + point.getDegreeOfLongitude() + "]";
	}
}
