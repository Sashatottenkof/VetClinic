package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;

import Animals.Animal;
import Cli.Cli;

public class SearchAnimals {


	ArrayList<Animal> allAnimals;

	public SearchAnimals(ArrayList<Animal> allAnimals) {

		this.allAnimals = allAnimals;

	}

	public void userRequest() throws IOException {
		String Name = null;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please type in a name of an animal: ");
		
		try {
			Name = r.readLine();
			
		} catch (IOException e) {

			e.getMessage();
		}
		
		if (Name.matches(".*\\d.*")) {
				
				throw new IOException("You have to use only charachters");
			}
		

		

		searching(Name);
	}

	public void searching(String Name) {

		boolean found = false;
		int i = 0;

		for (i = 0; i < allAnimals.size(); i++) {
			if (allAnimals.get(i).getName().equalsIgnoreCase(Name)) {
				found = true;
				System.out.println(" Search results: " + allAnimals.get(i).toString());

			}

		}
		if (found == false) {
			System.out.println("No results, such animal doesn't exist.");
		}
	}
}
