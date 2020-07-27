package eg00261;

import java.util.Arrays;

public class FindMaxAndMinElementInSortedAndRotatedArray {

	public static void main(String[] args) {

		FindMaxAndMinElementInSortedAndRotatedArray obj = new FindMaxAndMinElementInSortedAndRotatedArray();
//		int[] sortedArr = { -4, -2, 0, 1, 5, 9 };
		int[] sortedArr = { -9, 0, 3, 4, 5, 6 };
//		int[] sortedArr = { -9, -4, -4, 99, 100, 109 };
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(sortedArr));
		System.out.println("1. Using Linear Searach Approach");
		System.out.println(obj.findMinElementUsingLinearSearch(sortedArr));
		System.out.println("2. Using Binary Search Approach");
		System.out.println(obj.findMinElementUsingBinarySearch(sortedArr));
	}

	// Complexity : O(n)
	public int findMinElementUsingLinearSearch(int[] arr) {
		int n = arr.length;
		int min = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	// Complexity : O(logn)
	public int findMinElementUsingBinarySearch(int[] arr) {
//		int n = arr.length;
//		if (n == 1) {
//			return arr[0];
//		}
//
//		int low = 0;
//		int high = n - 1;
//
//		if (arr[0] < arr[high]) {
//			return arr[0];
//		}
//
//		while (low <= high) {
//			int mid = (low + high) / 2;
//			if (low < mid && arr[mid] < arr[mid - 1]) {
//				return arr[mid];
//			} else if (high > mid && arr[mid + 1] < arr[mid]) {
//				return arr[mid + 1];
//			} else if (arr[high] > arr[mid]) {
//				high = mid - 1;
//			} else  {
//				low = mid + 1;
//			}
//		}
//
//		return -1;

		// If the array has only one element, arr = {1}
		if (arr.length == 1) {
			return arr[0];
		}

		int start = 0;
		int end = arr.length - 1;

		/*
		 * If the array is sorted, arr = {1, 2, 3, 4}, then the minimum element is the
		 * element present at index 0.
		 */
		if (arr[0] < arr[end]) {
			return arr[0];
		}

		while (start <= end) {
			int mid = (start + end) / 2;

			if (start < mid && arr[mid] < arr[mid - 1]) {
				return arr[mid];

			} else if (end > mid && arr[mid + 1] < arr[mid]) {
				return arr[mid + 1];

			} else if (arr[end] > arr[mid]) {
				end = mid - 1;

			} else {
				start = mid + 1;
			}
		}

		return -1;

	}

}
