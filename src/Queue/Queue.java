package Queue;

import Animals.Animal;

public class Queue {

	private int front;
	private int rear;
	private int capacity;
	private int size;
	Animal animalQueue[];
	
	
	
	

	/**
	 * we are passing a size of the array
	 * @param capacity
	 */
	public Queue(int capacity) {
	this.capacity = capacity;
	animalQueue = new Animal[capacity];
	
	}

	public void enQueue(Animal animal) {

		if (!isFull()) {
			animalQueue[rear] = animal;
			rear = (rear + 1) % capacity;
			size++;
		}

		else

			System.out.println("The queue is full");

	}

	public void deQueue() {
		if (!isEmpty()) {
			front = (front + 1) % capacity;

			size--;

		} else
			System.out.println("The queue is empty");

	}

	public boolean isEmpty() {

		return size == 0;
	}

	public boolean isFull() {

		return size == capacity;
	}

	public void show() {

		System.out.println("Elements: ");
		for (int i = 0; i < size; i++) {
			System.out.println(animalQueue[(front + i) % capacity] + " ");
		}
	}
}
