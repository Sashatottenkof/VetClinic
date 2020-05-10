package Cli;

public class Menu {
	
	String menu[] = { "List all workers", "List all Sysadmins", "List all Receptionists", "List all Veterinarians",
			"List all Nurses", "List all Trainees", "List Staff that does something", "Search for Staff",
			"List all Animals", "List all Cats", "List all Dogs", "List all Tigers", "Search for an anmal",
			"Queues to Veterinarians"

	};

	String queueMenu[] = { "Show animals in a queue", "Show each queue", "Run a queue" };

	public Menu() {
		
	}
	public void displayMenue() {

		System.out.println("Please choose one of the following options: ");
		for (int i = 0; i < menu.length; i++) {
			System.out.println("Press " + (i + 1) + " to " + menu[i]);
		}
		System.out.println("Press 0 to stop the programm.");

	}
	public void displayQueueMenu() {
		System.out.println("Please choose one of the following options: ");
		for (int i = 0; i < queueMenu.length; i++) {
			System.out.println("Press " + (i + 1) + " to " + queueMenu[i]);
		}
		System.out.println("Press 0 to come back to main menu.");

	}

}
