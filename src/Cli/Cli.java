package Cli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Creator.AnimalsAssembler;
import Creator.StaffAssembler;
import PerformingTask.StaffPerformance;
import Queue.Queue;
import Queue.QueueManaging;
import Queue.QueueMenu;
import Search.SearchAnimals;
import Search.SearchStaff;

public class Cli {
	// all objects that program based on, are initialized here

	StaffAssembler Staff = new StaffAssembler();
	AnimalsAssembler Animals = new AnimalsAssembler();
	SearchAnimals searchAnimal = new SearchAnimals(Animals.getAllAnimals());
	SearchStaff searchStaff = new SearchStaff(Staff.getAllStaff());
	QueueManaging queueManager = new QueueManaging(Animals.getAllAnimals(), Staff.getVetsList());
	StaffPerformance activities = new StaffPerformance(Staff.getReceptionistList(), Staff.getSysadminsList());

	Menu menu = new Menu();

	BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

	public Cli() {
		mainMenu();

	}

	/**
	 * The method reads users input to convert it in "option" variable
	 * @return
	 */
	public int readInput() {
		int option = -1;
		try {
			option = Integer.parseInt(r.readLine());

		} catch (IOException | NumberFormatException e) {

			System.out.println("That's not a valid option, choose one of the presented numbers");

		}
		return option;
	}

	/**
	 * Main menu of the program
	 * 
	 */
	public void mainMenu() {
		int option = -1;
		System.out.println("Welcom to our Clinic!");
		do {
			do {
				System.out.println("Main menu:");
				menu.displayMenu();
				option = readInput();

			} while (!validOption(option));
			switch (option) {

			case 1:
				staffMenu();
				break;
			case 2:
				animalsMenu();
				break;
			case 3:
				queueMenu();
				break;
			}
		} while (option != 0);

	}

	/**
	 * Sub menu of main menu
	 * displays information about Staff
	 */
	public void staffMenu() {
		int option = -1;
		do {
			do {
				System.out.println("Staff details:");
				menu.displayStaffMenu();
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
				activities.showAllActivities();
				break;
			case 8:

				searchStaff.userRequest();

				break;
			}
		} while (option != 0);

	}

	/**
	 * 	
	 * Sub menu of main menu
	 * displays information about Animals
	 */
	 
	public void animalsMenu() {
		int option = -1;

		do {
			do {
				System.out.println("Animals details:");
				menu.displayAnimalsMenu();
				option = readInput();

			} while (!validOption(option));
			switch (option) {
			case 1:
				Animals.showAllAnimList();
				break;
			case 2:
				Animals.showCatsList();
				break;
			case 3:
				Animals.showDogsList();
				break;
			case 4:
				Animals.showTigersList();
				break;
			case 5:
				searchAnimal.userRequest();

				break;

			}
		} while (option != 0);
	}

	/**
	 * Displays queue menu
	 */
	public void queueMenu() {
		int option = -1;
		do {
			do {
				System.out.println("Queue details:");
				queueManager.displayQueuesMenu();
				option = readInput();

			} while (!validOptionQueue(option));

			switch (option) {
			case 1:
				queueManager.animalsInQueue();
				break;
			case 2:
				queueSubMenu();
				break;
			}
		} while (option != 0);

	}

	/**
	 * sub menu of queue menu
	 */
	public void queueSubMenu() {
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

	/**
	 * provades user with several options to 
	 * control queues for each veterinarian
	 * @param queue
	 */
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