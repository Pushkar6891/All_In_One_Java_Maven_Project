package eg00017;

import java.util.Arrays;

public class SortZerosOnesTwos {

	public static void main(String[] args) {

		SortZerosOnesTwos obj = new SortZerosOnesTwos();
		int[] arr1 = { 0, 1, 1, 0, 1, 2, 0, 1, 2 };
		System.out.println("Original Array:");
		System.out.println(Arrays.toString(arr1));
		int[] result1 = obj.countZeroesOnesTwos(arr1);
		System.out.println("Sorted Array: ");
		System.out.println(Arrays.toString(result1));

		int[] arr2 = { 0, 1, 1, 0, 1, 2, 0, 1, 2 };
		System.out.println("Original Array:");
		System.out.println(Arrays.toString(arr2));
		int[] result2 = obj.singleTraversalCountZeroesOnesTwos(arr2);
		System.out.println("Sorted Array: ");
		System.out.println(Arrays.toString(result2));
	}

	// Complexity : O(n)
	public int[] countZeroesOnesTwos(int[] arr) {
		int n = arr.length;
		int zeroCount = 0;
		int oneCount = 0;
		int twoCount = 0;
		for (int i = 0; i < n; i++) {
			int num = arr[i];
			if (num == 0) {
				zeroCount++;
			} else if (num == 1) {
				oneCount++;
			}
			if (num == 2) {
				twoCount++;
			}
		}

		int[] result = new int[n];

		int k = 0;
		for (int i = 0; i < zeroCount; i++) {
			result[k++] = 0;
		}
		for (int i = 0; i < oneCount; i++) {
			result[k++] = 1;
		}
		for (int i = 0; i < twoCount; i++) {
			result[k++] = 2;
		}

		return result;
	}

	// Time Complexity : O(n) Space Complexity : O(1)
	public int[] singleTraversalCountZeroesOnesTwos(int[] arr) {

		// 3 pointers : start, mid, high
		// initially start=mid=0 and high = arr.length-1;

		int start = 0;
		int mid = 0;
		int high = arr.length - 1;

		while (mid <= high) {
			switch (arr[mid]) {
			case 0: {
				swap(arr, start, mid);
				start++;
				mid++;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				swap(arr, mid, high);
				high--;
				break;
			}
			}
		}
		return arr;
	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
