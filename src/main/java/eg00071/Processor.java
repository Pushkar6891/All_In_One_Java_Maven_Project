package eg00071;

public class Processor implements Runnable{

	public volatile boolean running = true;
	
	@Override
	public void run() {

		while(running) {
			System.out.println("Thread is running....");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
		running = false;
	}

}
