package ReadFromFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadAnimals {

	ArrayList<String> allAnimNames = new ArrayList<String>();

	public ArrayList<String> getAnimNamesList() throws IOException {

		try {
			BufferedReader in = new BufferedReader(new FileReader("AnimalsNames.txt"));

			while (in.ready()) {

				allAnimNames.add(in.readLine());

			}
			in.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		return allAnimNames;
	}

}
