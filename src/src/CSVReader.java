package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
	String csvFile;
    String line;
    String csvSplitBy;
    
	public CSVReader(String csvFile, String line, String csvSplitBy) {
		this.csvFile = csvFile;
		this.line = line;
		this.csvSplitBy = csvSplitBy;
	}
	
	public void readCSV() {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

               //use comma as separator
               String[]country = line.split(csvSplitBy);

               System.out.println("Country[code= " + country[4]+ " , name=" + country[5]+ "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
