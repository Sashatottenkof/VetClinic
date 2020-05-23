package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Excepcions.Exceptions;
import Staff.Staff;

public class SearchStaff {

	ArrayList<Staff> allStaff;
	BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

	public SearchStaff(ArrayList<Staff> allStaff) {

		this.allStaff = allStaff;

	}

	public void userRequest() {
		String Name = null;

		do {
			do {
				System.out.println("Please type in full name of an employee:" + "\r\n" + "(Press 0 to come back)");
				try {
					Name = r.readLine();

					// thrown an error if request has numbers

					if (Name.matches(".*\\d.*") && !Name.matches("0")) {

						throw new Exceptions.OnlyCharacters();
					}
				} catch (IOException | Exceptions.OnlyCharacters e) {

					System.out.println(e.getMessage());
				}
			} while (!ValidName(Name));

			if (Name.matches("0")) {
				break;
			}
			searching(Name);
		} while (!Name.matches("0"));
	}

	/**
	 * The request does't have to have numbers otherwise method will keep asking to
	 * enter proper name
	 * 
	 * @param Name
	 * @return
	 */
	public boolean ValidName(String Name) {
		return (!Name.matches(".*\\d.*") || Name.matches("0"));
	}

	/**
	 * method implements linear search Method searches for a full name regardless
	 * its case
	 * 
	 * @param Name
	 */
	public void searching(String Name) {

		boolean found = false;
		int i = 0;

		for (i = 0; i < allStaff.size(); i++) {
			if (allStaff.get(i).getName().equalsIgnoreCase(Name)) {
				found = true;
				System.out.println(" Search results: " + allStaff.get(i).toString());

			}

		}
		if (found == false) {
			System.out.println("No results, such employee doesn't exist.");
		}
	}

}
