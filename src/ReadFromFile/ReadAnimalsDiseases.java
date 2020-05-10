package ReadFromFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadAnimalsDiseases {


		
		
		ArrayList<String> animalDiseases = new ArrayList<String>();

		public ArrayList<String> getAnimDiseasesList() throws IOException {

			try {
				BufferedReader in = new BufferedReader(new FileReader("Diseases.txt"));

				while (in.ready()) {

					animalDiseases.add(in.readLine());

				}
				in.close();
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}

			return animalDiseases;
		}
	}


