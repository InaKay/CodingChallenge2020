package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {
	public String csvFile;
    public String csvSplitBy;
    
	public CSVReader(String csvFile, String csvSplitBy) {
		this.csvFile = csvFile;
		this.csvSplitBy = csvSplitBy;
	}
	
	public ArrayList<Location> readCSV() {
		String line = "";
		String[] currentLine = null;
		int iteration = 0;
		ArrayList<Location> locations = new ArrayList<Location>();
		
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
            	if(iteration == 0) { // skip first line
                    iteration++;  
                    continue;
                }
            	currentLine = line.split(csvSplitBy);
            	Location location = new Location();
            	location.setNumber(Integer.parseInt(currentLine[0]));
            	location.setName(new String(currentLine[1].getBytes("ISO-8859-1"), "UTF-8")); //encode the umlauts
            	location.setStreet(currentLine[2]);
            	location.setHouseNumber(currentLine[3]);
            	location.setPostCode(currentLine[4]);
            	location.setPlace(currentLine[5]);
            	Coordinate point = new Coordinate(Double.parseDouble(currentLine[6]), Double.parseDouble(currentLine[7]));
            	location.setCoordinate(point);
            	locations.add(location);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return locations;
	}
}
