package eg00102;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerDemo {

	public static void main(String[] args) {

		BlockingQueue<Integer> sharedQueue = new ArrayBlockingQueue<>(5);

		Producer producer = new Producer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);

		Thread producerThread = new Thread(producer, "Producer Thread");
		Thread consumerThread = new Thread(consumer, "Consumer Thread");

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

	private BlockingQueue<Integer> sharedQueue;

	public Producer(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			Random random = new Random();
			int data = random.nextInt(10);
			try {
				sharedQueue.put(data);
				System.out.println("Produced : " + data);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Consumer implements Runnable {

	private BlockingQueue<Integer> sharedQueue;

	public Consumer(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Integer data = sharedQueue.take();
				System.out.println("Consumed : " + data);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}