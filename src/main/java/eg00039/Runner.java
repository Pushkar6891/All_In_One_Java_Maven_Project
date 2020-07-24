package eg00039;

public class Runner implements Runnable {

	public Runner() {

	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread Name " + Thread.currentThread().getName() + " " +  i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
