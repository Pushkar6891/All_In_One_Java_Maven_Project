package eg00038;

public class Runner extends Thread {

	public Runner() {

	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread Name " + Thread.currentThread().getName() + " " + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
