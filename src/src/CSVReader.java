package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {
	String csvFile;
    String csvSplitBy;
    
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
            	location.setName(currentLine[1]);
            	location.setStreet(currentLine[2]);
            	location.setHouseNumber(currentLine[3]);
            	location.setPostCode(currentLine[4]);
            	location.setPlace(currentLine[5]);
            	location.setDegreeOfLatitude(Double.parseDouble(currentLine[6]));
            	location.setDegreeOfLongitude(Double.parseDouble(currentLine[7]));
            	locations.add(location);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return locations;
	}
}
