package Cli;



public class Menu {
	

	String menu[] = { "Staff details", "Animals details", "Queues details"

	};
	String staffMenu[] = { "List all employees", "List all Sysadmins", "List all Receptionists", "List all Veterinarians",
			"List all Nurses", "List all Trainees", "List Staff that does something", "Search for Staff"
	};
	
	String animalsMenu[] = {
			"List all Animals", "List all Cats", "List all Dogs", "List all Tigers", "Search for an anmal",

	};
	

	

	public Menu() {
		
	}
	
	/**
	 * Displays main menu
	 */
	public void displayMenu() {

		System.out.println("Please choose one of the following options: ");
		for (int i = 0; i < menu.length; i++) {
			System.out.println("Press " + (i + 1) + " to " + menu[i]);
		}
		System.out.println("Press 0 to stop the programm.");

	}
	
	/**
	 * Displays menu related to staff
	 */
	public void displayStaffMenu() {
		System.out.println("Please choose one of the following options: ");
		for (int i = 0; i < staffMenu.length; i++) {
			System.out.println("Press " + (i + 1) + " to " + staffMenu[i]);
		}
		System.out.println("Press 0 to come back to main menu.");
		
	}
	/**
	 * Displays menu related to animals
	 */
	public void displayAnimalsMenu() {
		System.out.println("Please choose one of the following options: ");
		for (int i = 0; i < animalsMenu.length; i++) {
			System.out.println("Press " + (i + 1) + " to " + animalsMenu[i]);
		}
		System.out.println("Press 0 to come back to main menu.");
		
	}

	

}
