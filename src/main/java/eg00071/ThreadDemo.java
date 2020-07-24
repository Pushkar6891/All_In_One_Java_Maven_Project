package eg00071;

import java.util.Scanner;

public class ThreadDemo {

	public static void main(String[] args) {

		Processor processor = new Processor();
		Thread thread1 = new Thread(processor, "My Processor Thread");
		thread1.start();

		System.out.println("Press enter to stop...");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		processor.shutdown();

	}

}
