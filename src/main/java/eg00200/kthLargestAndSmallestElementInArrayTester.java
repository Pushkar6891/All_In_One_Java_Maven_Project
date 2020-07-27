package eg00200;

import java.util.Arrays;

public class kthLargestAndSmallestElementInArrayTester {

	public static void main(String[] args) {
		kthLargestAndSmallestElementInArrayTester obj = new kthLargestAndSmallestElementInArrayTester();
		int[] arr = { 9, 8, 2, 6, 3, 7, 1, 0, 11 };
		int k = 3;
		int n = arr.length;
		System.out.println("Original Array :");
		System.out.println(Arrays.toString(arr));
		obj.countSort(arr);
		System.out.println("Smallest :");
		System.out.println(arr[k - 1]);
		System.out.println("Largest :");
		System.out.println(arr[n - k]);

	}

	public int[] countSort(int[] arr) {
		// k is the max element in arr
		// range is from min to max
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int range = max - min + 1;
		int[] count = new int[range];
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - min]++;
		}
		for (int i = 1; i < count.length; i++) {
			count[i] = count[i] + count[i - 1];
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			result[count[arr[i] - min] - 1] = arr[i];
			count[arr[i] - min]--;
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = result[i];
		}
		return arr;
	}

}
