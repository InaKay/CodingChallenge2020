package src;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		CSVReader csvReader = new CSVReader("./assets/msg_standorte_deutschland.csv", ",");
		ArrayList<Location> locations = csvReader.readCSV();
		for(Location location : locations) {
			System.out.print(location.toString());
		}
	}

}
