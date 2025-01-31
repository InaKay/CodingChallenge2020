package src;

import java.util.Scanner;

public class Location {
	public int number;
	public String name;
	public String street;
	public String houseNumber;
	public String postCode;
	public String place;
	public Coordinate coordinate;
	private int RADIUS = 6371;
	
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

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate point) {
		this.coordinate = point;
	}

	@Override
	public String toString() {
		return this.getName();
	}
	
	/**
	 * Calculate the distance in km between two locations with the haversine formula 
	 * see the formula on https://www.movable-type.co.uk/scripts/latlong.html 
	 * @return
	 */
	public double calculateDistance(Location location) {
		double degreeOfLatitude1 = this.getCoordinate().getDegreeOfLatitude();
		double degreeOfLongitude1 = this.getCoordinate().getDegreeOfLongitude();
		double degreeOfLatitude2 = location.getCoordinate().getDegreeOfLatitude();
		double degreeOfLongitude2 = location.getCoordinate().getDegreeOfLongitude();
		
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
	
	public Location createNewLocation(Scanner scanner) {
		Location location = new Location();
		String input = "";

		System.out.println("Nummer: ");
		input = scanner.next();
		double formatNumber = isNumeric(input, scanner);
		location.setNumber((int)formatNumber);
		
		System.out.println("Name: ");
		input = scanner.next();
		location.setName(input);
		System.out.println("Hausnummer: ");
		input = scanner.next();
		location.setHouseNumber(input);
		System.out.println("Postleitzahl: ");
		input = scanner.next();
		location.setPostCode(input);
		System.out.println("Ort: ");
		input = scanner.next();
		location.setPlace(input);
		
		System.out.println("Breitengrad: ");
		input = scanner.next();
		double degreeOfLatitude = isNumeric(input, scanner);
		System.out.println("Lšngengrad: ");
		input = scanner.next();
		double degreeOfLongitude = isNumeric(input, scanner);
		location.setCoordinate(new Coordinate(degreeOfLatitude, degreeOfLongitude));
		
		return location;
	}
	
	private double isNumeric(String str, Scanner scanner) {
		double result = 0.0;
		
		try {
			result = Double.parseDouble(str);
		} catch (NumberFormatException e) {
			System.out.println("Die Eingabe ist keine Zahl");
			System.out.println("Bitte wiederholen Sie die Eingabe");
			str = scanner.next();
			isNumeric(str, scanner);
		}
		return result;
	}
}
