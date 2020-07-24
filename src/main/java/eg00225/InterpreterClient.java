package eg00225;

public class InterpreterClient {

	private InterpreterEngine interpreterEngine;

	public InterpreterClient(InterpreterEngine interpreterEngine) {
		this.interpreterEngine = interpreterEngine;
	}

	public int interpret(String inputData) {
		Expression expression = null;

		if (inputData.contains("add")) {
			expression = new AdditionExpression(inputData);
		} else if (inputData.contains("subtract")) {
			expression = new SubtractionExpression(inputData);
		} else {
			throw new RuntimeException(inputData + " is not valid expression");
		}

		int result = expression.interpret(interpreterEngine);
		System.out.println(inputData);
		return result;
	}

}
