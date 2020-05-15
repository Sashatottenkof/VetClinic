package Cli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Creator.AnimalsAssembler;
import Creator.StaffAssembler;
import Queue.Queue;
import Queue.QueueManaging;
import Queue.QueueMenu;
import Search.SearchAnimals;
import Search.SearchStaff;

public class Cli {

	StaffAssembler Staff = new StaffAssembler();
	AnimalsAssembler Animals = new AnimalsAssembler();
	SearchAnimals searchAnimal = new SearchAnimals(Animals.getAllAnimals());
	SearchStaff searchStaff = new SearchStaff(Staff.getAllStaff());
	QueueManaging queueManager = new QueueManaging(Animals.getAllAnimals(), Staff.getVetsList());

	Menu menu = new Menu();

	BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

	public Cli() {
		execute();

	}

	public int readInput() {
		int option = -1;
		try {
			option = Integer.parseInt(r.readLine());

		} catch (IOException | NumberFormatException e) {

			System.out.println("That's not a valid option, choose one of the presented numbers");

		}
		return option;
	}

	public void execute() {
		int option = -1;
		do {
			do {
				menu.displayMenue();
				option = readInput();

			} while (!validOption(option));
			switch (option) {
			case 1:
				Staff.showAllStaff();
				break;
			case 2:
				Staff.showSysadmins();
				break;
			case 3:
				Staff.showReceptionists();
				break;
			case 4:
				Staff.showVets();
				break;
			case 5:
				Staff.showNurses();
				break;
			case 6:
				Staff.showTrainees();
				break;
			case 7:
				Staff.showSysadmins();
				break;
			case 8:
				try {
					searchStaff.userRequest();
				} catch (IOException e) {

					e.printStackTrace();
				}
				break;
			case 9:
				Animals.showAllAnimList();
				break;
			case 10:
				Animals.showCatsList();
				break;
			case 11:
				Animals.showDogsList();
				break;
			case 12:
				Animals.showTigersList();
				break;
			case 13:
				try {
					searchAnimal.userRequest();
				} catch (IOException e) {

					e.printStackTrace();
				}
				break;
			case 14:
				SubMenu();
			}

		} while (option != 0);
	}

	public void SubMenu() {
		int option = -1;
		do {
			do {
				queueManager.displayQueuesMenu();
				option = readInput();

			} while (!validOptionQueue(option));

			switch (option) {
			case 1:
				queueManager.animalsInQueue();
				break;
			case 2:
				queueMenu();
				break;
			}
		} while (option != 0);

	}

	public void queueMenu() {
		int option = -1;

		do {
			do {
				queueManager.displayQueues();
				option = readInput();

			} while (!validOptionQueue(option));
			if (option > 0) {
				queueManager.specificlQueue(option).show();
				// we pass the option to the method to get back a required queue
				optionsMenu(queueManager.specificlQueue(option));
			}

		} while (option != 0);

	}

	public void optionsMenu(Queue queue) {
		int option = -1;

		do {
			do {
				queueManager.displayOperations();
				option = readInput();

			} while (!validOptionQueue(option));
			switch (option) {
			case 1:
				queueManager.cureAnimal(queue);

				break;
			case 2:
				queueManager.takeAnimal(queue);

				break;
			}

		} while (option != 0);

	}

	public boolean validOption(int option) {
		return option >= 0 && option <= 14;
	}

	public boolean validOptionQueue(int option) {
		return option >= 0 && option <= 5;
	}
}