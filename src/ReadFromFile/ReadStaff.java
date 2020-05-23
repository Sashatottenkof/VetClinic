package ReadFromFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadStaff {

	public ReadStaff() {

	}

	ArrayList<String> allNames = new ArrayList<String>();

	/**
	 * This method reads names from a text file and stores it into an Array list
	 * 
	 * @throws IOException
	 */
	public ArrayList<String> getNameList() throws IOException {

		try {
			BufferedReader in = new BufferedReader(new FileReader("Names.txt"));

			while (in.ready()) {
				allNames.add(in.readLine());
			}
			in.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		return allNames;

	}
}
