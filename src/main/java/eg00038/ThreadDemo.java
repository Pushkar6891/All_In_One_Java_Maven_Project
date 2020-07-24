package eg00038;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Runner runner1 = new Runner();
		Runner runner2 = new Runner();
		
		runner1.setName("Thread-1");
		runner2.setName("Thread-2");
		
		runner1.start();
		runner2.start();
		
	}
}
