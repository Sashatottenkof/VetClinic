package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;

import Animals.Animal;
import Excepcions.Exceptions;

public class SearchAnimals {

	ArrayList<Animal> allAnimals;
	BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

	public SearchAnimals(ArrayList<Animal> allAnimals) {

		this.allAnimals = allAnimals;

	}

	public void userRequest() {
		String Name = null;

		do {

			do {
				System.out.println("Please type in a name of an animal:" + "\r\n" + "(Press 0 to come back)");
				try {
					Name = r.readLine();
			
					if (Name.matches(".*\\d.*") && !Name.matches("0")) {
						throw new Exceptions.OnlyCharacters();
					}

				} catch (IOException | Exceptions.OnlyCharacters e) {
					System.out.println(e.getMessage());

				}

			} while (!validName(Name));

			// if user insert "0" we return to previous menu
			if (Name.matches("0")) {
				break;
			}

			searching(Name);

		} while (!Name.matches("0"));
	}

	public boolean validName(String Name) {
		return (!Name.matches(".*\\d.*") || Name.matches("0"));
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
