package eg00558;

public class ArrayTester {

	public static void main(String[] args) {

		ArrayImpl a = new ArrayImpl();
		int arr[] = { 7, 8, 3, 1, 5 };

		for (int i = 0; i < arr.length; i++) {
			a.pushElementInStack(arr[i]);
		}

		System.out.print(a.minElement() + " ");

		a.popElementFromStack();
		System.out.print(a.minElement() + " ");

		a.popElementFromStack();
		System.out.print(a.minElement() + " ");

		a.popElementFromStack();
		System.out.print(a.minElement() + " ");

		a.popElementFromStack();
		System.out.println(a.minElement() + " ");

		// Using Single Stack
		for (int i = 0; i < arr.length; i++) {
			a.pushUsingSingleStack(arr[i]);
		}

		System.out.print(a.getMinElementUsingSingleStack() + " ");

		a.popUsingSingleStack();
		System.out.print(a.getMinElementUsingSingleStack() + " ");

		a.popUsingSingleStack();
		System.out.print(a.getMinElementUsingSingleStack() + " ");

		a.popUsingSingleStack();
		System.out.print(a.getMinElementUsingSingleStack() + " ");

		a.popUsingSingleStack();
		System.out.print(a.getMinElementUsingSingleStack() + " ");

	}
}