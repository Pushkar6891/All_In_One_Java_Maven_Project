package eg00222;

public class Tester {

	public static void main(String[] args) {
		// Only one time heavy object is created
		VeryExpensiveProcess veryExpensiveProcess = new VeryExpensiveProcessProxy();
		veryExpensiveProcess.process();
		veryExpensiveProcess.process();
	}

}
