package Staff.Medical;

import Queue.Queue;

public class Vet extends Medical{
	
	// each Vet has a Variable Queue
	Queue queue;

	public Vet (String name, int Id, int salaryLvl) {
		super(name, Id, salaryLvl);
		position = "Veterinarian";
	}

	public Queue getQueue() {
		return queue;
	}


	public void setQueue(Queue queue) {
		this.queue = queue;
	}

}
