package eg00138;

public class SwappingWithThirdVariableDemo {

	public static void main(String[] args) {

		SwappingWithThirdVariableDemo obj = new SwappingWithThirdVariableDemo();

		System.out.println("Non Static: ");
		System.out.println("Before Swap " + "a: " + 10 + " b: " + 20);
		int[] resultNonStatic = obj.swappingWithoutThirdVariable(10, 20);
		System.out.println("After Swap " + "a: " + resultNonStatic[0] + " b: " + resultNonStatic[1]);

		System.out.println("Static: ");
		System.out.println("Before Swap " + "a: " + 50 + " b: " + 60);
		int[] resultStatic = swappingWithoutThirdVariableStatic(50, 60);
		System.out.println("After Swap " + "a: " + resultStatic[0] + " b: " + resultStatic[1]);

	}

	public int[] swappingWithoutThirdVariable(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		int[] result = new int[2];
		result[0] = a;
		result[1] = b;
		return result;
	}

	public static int[] swappingWithoutThirdVariableStatic(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		int[] result = new int[2];
		result[0] = a;
		result[1] = b;
		return result;
	}

}
