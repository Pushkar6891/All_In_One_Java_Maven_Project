package eg00125;

public class TesterWithoutLambda {

	public static void main(String[] args) {

		MyRunnableImpl myRunnableImpl = new MyRunnableImpl();
		Thread myThread = new Thread(myRunnableImpl);
		myThread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread " + i);
		}
	}
}
