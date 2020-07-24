package eg00126;

public class TesterWithAnonymousInnerClass {

	public static void main(String[] args) {

		
		Thread myThread = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread " + i);
			}

		});
		myThread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread " + i);
		}
	}
}
