package eg00008;

import java.util.Arrays;

// Divide and Conquer Technique or Partitioning
public class QuickSortIterativeApproach {

	public static void main(String[] args) {

		QuickSortIterativeApproach obj = new QuickSortIterativeApproach();
		int[] arr = { -10, 9, 8, -6, 3, 7, -2, -4, 1, 2 };
		int low = 0;
		int high = arr.length - 1;
		System.out.println("Original Unsorted Array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Resultant Sorted Array : ");
		obj.quickSort(arr, low, high);
		System.out.println(Arrays.toString(arr));
	}

	public void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int loc = partition(arr, low, high);
			quickSort(arr, low, loc - 1);
			quickSort(arr, loc + 1, high);
		}
	}

	public int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1); // index of smaller element
		int start = low;
		int end = high;
		for (int j = start; j < end; j++) {
			// If current element is smaller than the pivot
			if (arr[j] < pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

}
