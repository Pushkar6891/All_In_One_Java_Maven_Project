package eg00561;

public class Queue {

	final int MAX_QUEUE_SIZE = 5;
	int size;
	int[] queue = new int[MAX_QUEUE_SIZE];
	int front;
	int rear;

//	public void enQueue(int data) {
//		queue[rear] = data;
//		rear = (rear + 1) % queueSize;
//		size = size + 1;
//	}

//	public int deQueue() {
//		int data = queue[front];
//		front = (front + 1) % queueSize;
//		size = size - 1;
//		return data;
//	}

	public void enQueue(int data) {
		if (!isFull()) {
			queue[rear++ % MAX_QUEUE_SIZE] = data;
			size++;
		} else {
			System.out.println("Queue is Full!!");
		}
	}

	public int deQueue() {
		int data = 0;
		if (!isEmpty()) {
			data = queue[front++ % MAX_QUEUE_SIZE];
			size--;
		} else {
			System.out.println("Queue is Empty!!");
		}
		return data;
	}

	public void showQueue() {
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(front + i) % MAX_QUEUE_SIZE] + " ");
		}
		System.out.println();
		for (int n : queue) {
			System.out.print(n + " ");
		}
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		if (getSize() == 0)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (getSize() == MAX_QUEUE_SIZE)
			return true;
		else
			return false;
	}

}
