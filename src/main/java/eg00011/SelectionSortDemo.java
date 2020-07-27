package eg00011;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {

		SelectionSortDemo obj = new SelectionSortDemo();
		int[] arr1 = { 29, 10, 14, 37, 13 };
		int[] arr2 = { 29, 10, -14, 37, -13 };

		System.out.println("Original Array :");
		System.out.println(Arrays.toString(arr1));
		int[] result1 = obj.selectionSort1(arr1);
		System.out.println("Sorted Array :");
		System.out.println(Arrays.toString(result1));

		System.out.println("Original Array :");
		System.out.println(Arrays.toString(arr2));
		int[] result2 = obj.selectionSort2(arr2);
		System.out.println("Sorted Array :");
		System.out.println(Arrays.toString(result2));
	}

	// Complexity : n^2
	public int[] selectionSort1(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int smallestIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[smallestIndex]) {
					smallestIndex = j;
				}
			}
			int smallestElement = arr[smallestIndex];
			arr[smallestIndex] = arr[i];
			arr[i] = smallestElement;
		}

		return arr;
	}

	public int[] selectionSort2(int[] arr) {
		int n = arr.length;
		int min = 0;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		return arr;
	}

}
