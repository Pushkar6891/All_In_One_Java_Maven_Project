package eg00225;

public class InterpreterEngine {

	public int addition(String inputData) {
		String[] tokens = interpret(inputData);
		int n1 = Integer.parseInt(tokens[0]);
		int n2 = Integer.parseInt(tokens[1]);
		return n1 + n2;
	}

	public int subtraction(String inputData) {
		String[] tokens = interpret(inputData);
		int n1 = Integer.parseInt(tokens[0]);
		int n2 = Integer.parseInt(tokens[1]);
		return n1 - n2;
	}

	public String[] interpret(String inputData) {
		String tempInputData = inputData.replaceAll("[^0-9]", " ");
		tempInputData = tempInputData.replaceAll("( )+", " ").trim();
		String[] inputDatatokens = tempInputData.split(" ");
		return inputDatatokens;
	}

}
