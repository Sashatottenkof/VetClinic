package Queue;

import java.util.ArrayList;

import Staff.Medical.Vet;

public class QueueMenu {

	private String queueMenu[] = { "Show all animals in a queue", "Show list of queues" };
	private ArrayList<Vet> queue;
	private String operations[] = { "Process an animal in a queue", "Take animal in a queue" };
	int option;

	public QueueMenu() {
		
	}

	public void displayQueueMenu() {
		System.out.println("Please choose one of the following options: ");
		for (int i = 0; i < queueMenu.length; i++) {
			System.out.println("Press " + (i + 1) + " to " + queueMenu[i]);
		}
		System.out.println("Press 0 to come back to main menu.");

	}

	public void displayQueue(ArrayList<Vet> vets) {

		queue = vets;

		int i = 1;
		System.out.println();
		for (Vet v : queue) {

			System.out.println("Press " + i + " to display queue for Doctor: " + v.getName());
			i++;
		}
		System.out.println("Press 0 to come back");
	}

	public void displayOperations() {
		System.out.println("Please choose one of the following options: ");
		for (int i = 0; i < operations.length; i++) {
			System.out.println("Press " + (i + 1) + " to " + operations[i]);
		}
		System.out.println("Press 0 to come back.");

	}

}
