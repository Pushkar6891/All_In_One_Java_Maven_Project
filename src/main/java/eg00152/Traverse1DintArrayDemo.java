package eg00152;

import java.util.Arrays;

public class Traverse1DintArrayDemo {

	public static void main(String[] args) {

		Traverse1DintArrayDemo obj = new Traverse1DintArrayDemo();
		int[] arr = { 9, 8, 2, 6, 3, 9, 6, 4, 6, 5 };
		System.out.println("Size : " + arr.length);
		System.out.println("1. Using for Loop");
		obj.traverse1DintArrayUsingforLoop(arr);
		System.out.println("\n2. Using while Loop");
		obj.traverse1DintArrayUsingwhileLoop(arr);
		System.out.println("\n3. Using do while Loop");
		obj.traverse1DintArrayUsingdowhileLoop(arr);
		System.out.println("\n4. Using enhanced for Loop");
		obj.traverse1DintArrayUsingenhancedforLoop(arr);
		System.out.println("\n5. Using Java 8 Streams");
		obj.traverse1DintArrayUsingJava8Streams(arr);
	}

	public void traverse1DintArrayUsingforLoop(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void traverse1DintArrayUsingwhileLoop(int[] arr) {
		int n = arr.length;
		int i = 0;
		while (i < n) {
			System.out.print(arr[i] + " ");
			i++;
		}
	}

	public void traverse1DintArrayUsingdowhileLoop(int[] arr) {
		int n = arr.length;
		int i = 0;
		do {
			System.out.print(arr[i] + " ");
			i++;
		} while (i < n);
	}

	public void traverse1DintArrayUsingenhancedforLoop(int[] arr) {
		for (int value : arr)
			System.out.print(value + " ");

	}

	public void traverse1DintArrayUsingJava8Streams(int[] arr) {
		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
	}

}
