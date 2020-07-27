package eg00152;

import java.util.Arrays;
import java.util.stream.Stream;

public class Traverse2DintArrayDemo {

	public static void main(String[] args) {

		Traverse2DintArrayDemo obj = new Traverse2DintArrayDemo();
		int[][] arr = { { 10, 20 }, { 40, 50, 60 } };
		System.out.println("Size : " + arr.length);
		System.out.println("1. Using for Loop");
		obj.traverse2DintArrayUsingforLoop(arr);
		System.out.println("\n2. Using while Loop");
		obj.traverse2DintArrayUsingwhileLoop(arr);
		System.out.println("\n3. Using do while Loop");
		obj.traverse2DintArrayUsingdowhileLoop(arr);
		System.out.println("\n4. Using enhanced for Loop");
		obj.traverse2DintArrayUsingenhancedforLoop(arr);
		System.out.println("\n5. Using Java 8 Streams");
		obj.traverse2DintArrayUsingJava8Streams(arr);
		System.out.println("\n6. Using Java 8 deepToString");
		obj.traverse2DintArrayUsingJava8Streams(arr);
	}

	public void traverse2DintArrayUsingforLoop(int[][] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void traverse2DintArrayUsingwhileLoop(int[][] arr) {
		int n = arr.length;
		int i = 0;
		while (i < n) {
			int j = 0;
			while (j < arr[i].length) {
				System.out.print(arr[i][j] + " ");
				j++;
			}
			i++;
			System.out.println();
		}
	}

	public void traverse2DintArrayUsingdowhileLoop(int[][] arr) {
		int n = arr.length;
		int i = 0;
		do {
			int j = 0;
			do {
				System.out.print(arr[i][j] + " ");
				j++;
			} while (j < arr[i].length);
			i++;
			System.out.println();
		} while (i < n);
	}

	public void traverse2DintArrayUsingenhancedforLoop(int[][] arr) {
		for (int[] row : arr) {
			for (int j : row) {
				if (j == 0)
					System.out.print(row[j] + " ");
				else
					System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public void traverse2DintArrayUsingJava8Streams(int[][] arr) {
		Stream.of(arr).map(Arrays::toString).forEach(System.out::println);
	}

	public void traverse2DintArrayUsingJava8deepToString(int[][] arr) {
		System.out.println(Arrays.deepToString(arr));
	}

}
