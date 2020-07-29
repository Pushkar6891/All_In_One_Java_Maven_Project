package eg00003;

import java.util.Arrays;

// Divide and Conquer Technique or Partitioning
public class MergeSortIterativeApproach {

	public static void main(String[] args) {

		MergeSortIterativeApproach obj = new MergeSortIterativeApproach();
		int[] arr = { -10, 9, 8, -6, 3, 7, -2, -4, 1, 2 };
		int low = 0;
		int high = arr.length - 1;
		System.out.println("Original Unsorted Array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Resultant Sorted Array : ");
		obj.mergeSort(arr, low, high);
		System.out.println(Arrays.toString(arr));
	}

	public void mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			mergeSubArrays(arr, low, mid, high);
		}
	}

	public void mergeSubArrays(int[] arr, int low, int mid, int high) {
		// Find sizes of two subarrays to be merged
		int n1 = mid - low + 1;
		int n2 = high - mid;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[low + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[mid + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = low;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

}
