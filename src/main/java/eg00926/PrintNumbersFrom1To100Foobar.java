package eg00926;

public class PrintNumbersFrom1To100Foobar {
	public static void main(String args[]) {
		PrintNumbersFrom1To100Foobar obj = new PrintNumbersFrom1To100Foobar();
		obj.printNumbers();
	}

	public void printNumbers() {
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println("Foobar");
			} else if (i % 5 == 0) {
				System.out.println("Foo");
			} else if (i % 7 == 0) {
				System.out.println("bar");
			} else {
				System.out.println(i);
			}
		}
	}
}
