package eg00561;

public class Tester {

	public static void main(String[] args) {

		Queue queue = new Queue();
		queue.enQueue(5);
		queue.enQueue(2);
		queue.enQueue(7);
		queue.enQueue(3);

		queue.deQueue();// removed 5 (we are removing elements but we are just shifting front and rear
						// pointer)
		queue.deQueue();// removed 2

		queue.enQueue(9);
		queue.enQueue(1);

		queue.enQueue(19);
		queue.enQueue(15);

		System.out.println("Is Queue Full ? " + queue.isFull());
		System.out.println("Is Queue Empty ? " + queue.isEmpty());
		System.out.println("Size : " + queue.getSize());
		queue.showQueue();
	}

}
