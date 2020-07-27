package eg00009;

import java.util.Arrays;

public class BubbleSortIterativeDemo {

	public static void main(String[] args) {

		BubbleSortIterativeDemo obj = new BubbleSortIterativeDemo();
		int[] arr = { 29, 10, 14, 37, 13 };
		System.out.println(Arrays.toString(arr));
		// int[] result = obj.bubbleSort(arr);
		int[] result = obj.bubbleSortImproved(arr);
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

}
