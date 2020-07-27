package eg00016;

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
		System.out.println("Selection Sorted Array :");
		System.out.println(Arrays.toString(obj.selectionSort(arr2)));

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
