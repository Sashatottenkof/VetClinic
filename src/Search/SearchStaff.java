package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


import Staff.Staff;

public class SearchStaff {

	
	ArrayList<Staff> allStaff;

	public SearchStaff(ArrayList<Staff> allStaff) {

		this.allStaff = allStaff;

	}

	public void userRequest() throws IOException {
		String Name = null;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please type in a name of employee: ");
		
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
