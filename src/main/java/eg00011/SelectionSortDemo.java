package eg00011;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {

		SelectionSortDemo obj = new SelectionSortDemo();
		int[] arr = { 29, 10, 14, 37, 13 };
		System.out.println(Arrays.toString(arr));
		int[] result = obj.selectionSort(arr);
		System.out.println(Arrays.toString(result));
	}

	// Complexity : n^2
	public int[] selectionSort(int[] arr) {
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

}
