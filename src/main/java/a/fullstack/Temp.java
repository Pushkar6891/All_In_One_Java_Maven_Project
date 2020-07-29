package a.fullstack;

public class Temp {

	private int x = 10;
	protected int y = 10;

	protected Temp() {
		this(5);
	}

	private Temp(int x) {
		this(x, 15);
	}

	protected Temp(int x, int y) {
		System.out.println(x * y);
	}

	public static void main(String[] args) {

		new Temp();
	}
}
