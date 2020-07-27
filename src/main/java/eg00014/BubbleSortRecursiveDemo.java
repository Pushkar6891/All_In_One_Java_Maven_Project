package eg00014;

import java.util.Arrays;

public class BubbleSortRecursiveDemo {

	public static void main(String[] args) {

		BubbleSortRecursiveDemo obj = new BubbleSortRecursiveDemo();
		int[] arr = { 29, 10, 14, 37, 13 };
		int n = arr.length;
		System.out.println(Arrays.toString(arr));
		// int[] result = obj.bubbleSort(arr);
		// int[] result = obj.bubbleSortImproved(arr);
		int[] result = obj.bubbleSortRecursive(arr, n);
		System.out.println(Arrays.toString(result));

	}

	// Complexity : n^2
	public int[] bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	// Complexity :
	// If array is sorted do not enter
	// Remove i elements - i
	public int[] bubbleSortImproved(int[] arr) {
		int n = arr.length;
		boolean sortedFlag = false;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					sortedFlag = true;
				}
			}

			if (sortedFlag == false) {
				break;
			}
		}
		return arr;
	}

	public int[] bubbleSortRecursive(int[] arr, int n) {
		if (n == 1) {
			return arr;
		}

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;

			}
		}

		return bubbleSortRecursive(arr, n - 1);
	}

}
