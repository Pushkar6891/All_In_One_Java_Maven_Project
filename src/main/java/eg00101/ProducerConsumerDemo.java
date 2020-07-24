package eg00101;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumerDemo {

	public static void main(String[] args) {

		Queue<Integer> sharedQueue = new LinkedList<>();
		Producer producer = new Producer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);

		Thread producerThread = new Thread(producer, "Producer-Thread");
		Thread consumerThread = new Thread(consumer, "Consumer-Thread");

		producerThread.start();
		consumerThread.start();

		try {
			producerThread.join();
			consumerThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Main Thread Ends...");

	}

}

class Producer implements Runnable {

	private Queue<Integer> sharedQueue;
	private final int MAX_SIZE = 2;

	public Producer(Queue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (sharedQueue) {
				if (sharedQueue.size() == 5) {
					try {
						System.out.println("Producer is waiting for Consumer to consumer Objects from sharedQueue");
						sharedQueue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				Random random = new Random();
				int data = random.nextInt(5);
				sharedQueue.add(data);
				System.out.println("Produced : " + data);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				sharedQueue.notify();
			}
		}
	}

}

class Consumer implements Runnable {

	private Queue<Integer> sharedQueue;
//	private final int MAX_SIZE = 2;

	public Consumer(Queue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (sharedQueue) {
				if (sharedQueue.size() == 0 || sharedQueue.isEmpty()) {
					try {
						System.out.println("Consumer is waiting for Producer to produce Objects into sharedQueue");
						sharedQueue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				Integer data = sharedQueue.poll();
				System.out.println("Consumed : " + data);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				sharedQueue.notify();
			}
		}
	}

}