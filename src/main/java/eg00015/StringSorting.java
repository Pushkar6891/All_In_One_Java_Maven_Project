package eg00015;

import java.util.Arrays;

public class StringSorting {

	public static void main(String[] args) {

		StringSorting obj = new StringSorting();
		String arr1[] = { "India", "Pakistan", "New Zealand", "USA", "USSR", "UK", "Bermuda", "Canada", "Denmark",
				"Algeria", "Kuwait" };
		String arr2[] = { "India", "Pakistan", "New Zealand", "USA", "USSR", "UK", "Bermuda", "Canada", "Denmark",
				"Algeria", "Kuwait" };
		System.out.println("Original Array :");
		System.out.println(Arrays.toString(arr1));
		System.out.println("Bubble Sorted Array :");
		System.out.println(Arrays.toString(obj.bubbleSort(arr1)));
		System.out.println("Selection Sorted Array :");
		System.out.println(Arrays.toString(obj.selectionSort(arr2)));

	}

	// n - i - 1 is used when we want to ignore already sorted elements
	public String[] bubbleSort(String[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					// swap
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public String[] selectionSort(String[] arr) {
		int n = arr.length;
		int min = 0;
		for (int i = 0; i < n; i++) {
			min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j].compareTo(arr[min]) < 0) {
					min = j;
				}
			}
			// swap
			String temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}

}
