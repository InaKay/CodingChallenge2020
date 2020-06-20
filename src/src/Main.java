package src;

public class Main {

	public static void main(String[] args) {
		CSVReader csvReader = new CSVReader("./assets/msg_standorte_deutschland.csv", "", ",");
		csvReader.readCSV();
	}

}
