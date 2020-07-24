package eg00202;

public class Singleton {

	private static Singleton INSTANCE = null;

	static {
		try {
			if (INSTANCE == null) {
				INSTANCE = new Singleton();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Singleton() {

	}

	public static Singleton getInstance() {
		return INSTANCE;
	}
}


