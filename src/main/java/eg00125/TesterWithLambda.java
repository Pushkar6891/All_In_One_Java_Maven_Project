package eg00125;

public class TesterWithLambda {

	public static void main(String[] args) {

		// Runnable myRunnableImpl = new MyRunnableImpl();
		// Thread myThread = new Thread(myRunnableImpl);
		// myThread.start();

		Runnable myRunnableImpl = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread " + i);
			}
		};

		Thread myThread = new Thread(myRunnableImpl);
		myThread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread " + i);
		}
	}
}
