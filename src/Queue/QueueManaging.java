package Queue;

import java.util.ArrayList;
import java.util.Random;

import Animals.Animal;
import Staff.Medical.Vet;

public class QueueManaging {

	private ArrayList<Animal> allAnimals;
	private ArrayList<Vet> vets;

	private int capacity = 5;
	Random r = new Random();
	private QueueMenu menu = new QueueMenu();
	int option;

	public QueueManaging(ArrayList<Animal> allAnimals, ArrayList<Vet> vets) {

		this.allAnimals = allAnimals;
		this.vets = vets;
		giveQueue();
	}

	/**
	 * This method creates a queue of 5 each time its called Also it fills up the
	 * ArrayList "animalsInQueue" with animals that have been put in queue we don't
	 * want "Random" method accidently picks up the same animal, so we remove that
	 * animal from "allAnimals" list strait away
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

	public void giveQueue() {
		for (Vet v : vets) {

			v.setQueue(defaultQueue());
		}

	}

	public void animalsInQueue() {

		for (Vet v : vets) {

			System.out.println("\r\n" + "==================================" + "\r\n" + v.getPosition() + ": "
					+ v.getName() + "\r\n" + "\r\n");

			v.getQueue().show();
		}
	}

	public void displayQueuesMenu() {
		menu.displayQueueMenu();
	}

	public void displayQueues() {
		menu.displayQueue(vets);
	}

	public void displayOperations() {

		menu.displayOperations();
	}

	public Queue specificlQueue(int option) {
		Queue queue = null;
		this.option = option - 1;
		queue = vets.get(this.option).getQueue();

		return queue;

	}

	/**
	 * This method process the first animal in a queue "option" parameter has been
	 * defined into specificQueue method therefore we don't have to pass in again
	 * 
	 * @param queue
	 */
	public void cureAnimal(Queue queue) {

		vets.get(option).getQueue().deQueue();

		System.out.println(vets.get(option).getName() + "\r\n" + "===========================" + "\r\n");
		queue.show();

	}

	/**
	 * This methods adds animals in a queue
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
