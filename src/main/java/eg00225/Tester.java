package eg00225;

public class Tester {

	public static void main(String[] args) {

		InterpreterEngine interpreterEngine = new InterpreterEngine();
		InterpreterClient interpreterClient = new InterpreterClient(interpreterEngine);

		System.out.println("Addition of both numbers is : " + interpreterClient.interpret("add 200 and 75"));
		System.out.println("=============================================");
		System.out.println("Subtraction of numbers is : " + interpreterClient.interpret("subtract 30 and 100"));

	}

}