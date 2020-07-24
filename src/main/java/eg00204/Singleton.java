package eg00204;

public class Singleton {

	private static Singleton INSTANCE = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (INSTANCE == null) {
			synchronized (Singleton.class) {
				if (INSTANCE == null) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					INSTANCE = new Singleton();
				}
			}
		}
		return INSTANCE;
	}
}
