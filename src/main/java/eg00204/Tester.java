package eg00204;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tester {

	public static void main(String[] args) {

		ExecutorService executorService = null;
		MyThread myThread = new MyThread();
		try {
			executorService = Executors.newFixedThreadPool(2);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (executorService != null) {
				executorService.shutdown();
			}
		}

	}

}
