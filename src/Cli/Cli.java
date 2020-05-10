package Cli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Creator.AnimalsAssembler;
import Creator.StaffAssembler;

import Queue.QueueManaging;
import Search.SearchAnimals;
import Search.SearchStaff;

public class Cli {

	StaffAssembler Staff = new StaffAssembler();
	AnimalsAssembler Animals = new AnimalsAssembler();
	SearchAnimals searchAnimal = new SearchAnimals(Animals.getAllAnimals());
	SearchStaff searchStaff = new SearchStaff(Staff.getAllStaff());
	QueueManaging queue = new QueueManaging(Animals.getAllAnimals(), Staff.getVetsList());
	
	
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

			System.out.println("That's not a valid option, please type 0-9");

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

			if (option == 1) {
				Staff.showAllStaff();

			}

			else if (option == 2) {
				Staff.showSysadmins();

			} else if (option == 3) {
				Staff.showReceptionists();

			} else if (option == 4) {
				Staff.showVets();

			} else if (option == 5) {
				Staff.showNurses();
				;

			} else if (option == 6) {
				Staff.showTrainees();

			}

			else if (option == 7) {
//				Staff.showTrainees();

			} else if (option == 8) {
				try {
					searchStaff.userRequest();
				} catch (IOException e) {

					e.printStackTrace();
				}

			}
			if (option == 9) {
				Animals.showAllAnimList();

			}
			if (option == 10) {
				Animals.showCatsList();

			}
			if (option == 11) {
				Animals.showDogsList();

			}
			if (option == 12) {
				Animals.showTigersList();

			}
			if (option == 13) {
				try {
					searchAnimal.userRequest();
				} catch (IOException e) {

					e.printStackTrace();
				}

			}
			if (option == 14) {
				do {
					do {
						menu.displayQueueMenu();
						option = readInput();

					} while (!validOptionQueue(option));

					if (option == 1) {
						queue.getAnimalsInQueue();
					} else if (option == 2) {
						queue.showEachQueue();
					} else if (option == 3) {
						queue.showEachQueue();
					}

				} while (option != 5);
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