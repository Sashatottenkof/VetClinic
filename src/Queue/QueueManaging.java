package Queue;

import java.util.ArrayList;
import java.util.Random;

import Animals.Animal;
import Staff.Medical.Vet;

public class QueueManaging {

	ArrayList<Animal> allAnimals;
	ArrayList<Vet> vets;
	ArrayList<Animal> animalsInQueue = new ArrayList<Animal>();
	private int capacity = 5;
	Random r = new Random();

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
	public Queue firstQueue() {
		Queue queue = new Queue(capacity);
		int index;

		for (int i = 0; i < capacity; i++) {

			index = r.nextInt(allAnimals.size());
			queue.enQueue(allAnimals.get(index));

			animalsInQueue.add(allAnimals.get(index));
			allAnimals.remove(index);

		}
//		queue.show();

		return queue;
	}

//	public void nextAnimal() {
//
//		q.enQueue(allAnimals.get(r.nextInt(allAnimals.size())));
//		q.deQueue();
//		q.show();
//	}

	public void giveQueue() {
		for (Vet v : vets) {

			v.setQueue(firstQueue());
		}

	}

	public ArrayList<Animal> getAnimalsInQueue() {
		return animalsInQueue;
	}

	public void setAnimalsInQueue(ArrayList<Animal> animalsInQueue) {
		this.animalsInQueue = animalsInQueue;
	}

	public void showEachQueue() {

		for (Vet v : vets) {

			System.out.println(v.getPosition() + "\r\n" + v.getName() + " Has these animals for checking: " + "\r\n");

			v.getQueue().show();
		}
	}

}
