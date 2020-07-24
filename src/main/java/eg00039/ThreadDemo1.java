package eg00039;

public class ThreadDemo1 {

	public static void main(String[] args) {

		Runner runner1 = new Runner();
		Runner runner2 = new Runner();

		Thread t1 = new Thread(runner1, "Thread-1");
		Thread t2 = new Thread(runner2, "Thread-2");
		
		t1.start();
		t2.start();

	}
}
