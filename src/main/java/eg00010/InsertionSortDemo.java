package eg00010;

import java.util.Arrays;

public class InsertionSortDemo {

	public static void main(String[] args) {

		InsertionSortDemo obj = new InsertionSortDemo();
		int[] arr1 = { 5, 4, 10, 1, 6, 2 };
		int[] arr2 = { -5, 4, -10, 1, -6, 2 };

		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(arr1));
		int[] result1 = obj.insertionSort1(arr1);
		System.out.println("Sorted Array : ");
		System.out.println(Arrays.toString(result1));

		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(arr2));
		int[] result2 = obj.insertionSort2(arr2);
		System.out.println("Sorted Array : ");
		System.out.println(Arrays.toString(result2));

	}

	// Complexity : O(n^2)
	public int[] insertionSort1(int[] arr) {
		int n = arr.length;
		int temp = 0;
		int j = 0;
		for (int i = 1; i < n; ++i) {
			temp = arr[i];
			j = i;
			while (j > 0 && temp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
		return arr;
	}

	// Complexity : O(n^2)
	public int[] insertionSort2(int[] arr) {
		int n = arr.length;
		int key = 0;
		int j = 0;
		for (int i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

		return arr;
	}

}
