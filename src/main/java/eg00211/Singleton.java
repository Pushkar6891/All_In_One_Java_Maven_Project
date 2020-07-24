package eg00211;

public class Singleton implements Cloneable {

	private static Singleton INSTANCE = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}

	// clone() from Object class
	@Override
	public Object clone() throws CloneNotSupportedException {
		// return super.clone();
		throw new CloneNotSupportedException("You cannot create clone of Singleton");
	}

}
