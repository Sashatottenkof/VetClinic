package Queue;

import java.util.ArrayList;
import java.util.Random;

import Animals.Animal;
import Staff.Medical.Vet;

public class QueueManaging {

	private ArrayList<Animal> allAnimals;
	private ArrayList<Vet> vets;
	
	//defines a capacity of a queue
	private final int capacity = 5;
	
	Random r = new Random();
	private QueueMenu menu = new QueueMenu();
	int option;

	/**
	 * The constructor gets lists of Animals and Vets 
	 * and then assigns them to the local variables
	 * @param allAnimals
	 * @param vets
	 */
	public QueueManaging(ArrayList<Animal> allAnimals, ArrayList<Vet> vets) {

		this.allAnimals = allAnimals;
		this.vets = vets;
		giveQueue();
	}

	/**
	 * This method creates a queue of 5 each time its called by picking up
	 * random animal in "allAnimals" list
	 *  we don't  want "Random" method accidently picks up the same animal,
	 * so we remove that animal from "allAnimals" list strait away
	 * 
	 * @return
	 */
	public Queue defaultQueue() {
		Queue queue = new Queue(capacity);
		int index;

		for (int i = 0; i < capacity; i++) {

			index = r.nextInt(allAnimals.size());
			queue.enQueue(allAnimals.get(index));

			allAnimals.remove(index);

		}

		return queue;
	}

	/**
	 * That method assigns  default queue to every Vet in the Clinic
	 */
	public void giveQueue() {
		for (Vet v : vets) {

			v.setQueue(defaultQueue());
		}

	}

	/**
	 * Prints animals that are in a queue
	 */
	public void animalsInQueue() {

		for (Vet v : vets) {

			System.out.println("\r\n" + "==================================" + "\r\n" + v.getPosition() + ": "
					+ v.getName() + "\r\n" + "\r\n");

			v.getQueue().show();
		}
	}

	/**
	 * Calls "displayQueueMenu" method that prints menu related to Queues
	 */
	public void displayQueuesMenu() {
		menu.displayQueueMenu();
	}

	/**
	 * Displays all animals in all queues that by passing Array List of Vets
	 * 
	 */
	public void displayQueues() {
		menu.displayQueue(vets);
	}

	/**
	 *   Calls "displayOperations" method that prints available options for managing a queue
	 */
	public void displayOperations() {

		menu.displayOperations();
	}
	

	/**
	 * We choose which queue we want to display
	 * by assigning Parameter to Index the element in the Vets Array List
	 * @param option
	 * @return
	 */
	public Queue specificlQueue(int option) {
		Queue queue = null;
		this.option = option - 1;
		queue = vets.get(this.option).getQueue();

		return queue;

	}

	/**
	 * This method process the first animal in a queue and prints whole queue again
	 *  "option" parameter has been defined into "specificQueue" method 
	 *  therefore we don't have to pass in again
	 * 
	 * @param queue
	 */
	public void cureAnimal(Queue queue) {

		vets.get(option).getQueue().deQueue();

		System.out.println(vets.get(option).getName() + "\r\n" + "===========================" + "\r\n");
		queue.show();

	}

	/**
	 * This method adds new animal in a queue,and prints queue again
	 * 
	 * @param queue
	 */
	public void takeAnimal(Queue queue) {
		int index;
		index = r.nextInt(allAnimals.size());
		vets.get(option).getQueue().enQueue(allAnimals.get(index));
		allAnimals.remove(index);

		System.out.println(vets.get(option).getName() + "\r\n" + "===========================" + "\r\n");
		queue.show();
	}

}
