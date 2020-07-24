package eg00039;

public class ThreadDemo2 {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runner(), "Thread-1");
		Thread t2 = new Thread(new Runner(), "Thread-2");
		
		t1.start();
		t2.start();

	}
}
