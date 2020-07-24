package eg00141;

import java.util.Arrays;

public class SmallestAndLargestElementInArray {

	public static void main(String[] args) {

		SmallestAndLargestElementInArray obj = new SmallestAndLargestElementInArray();
		int[] arr = { 9, 8, 2, 6, 3, -1, 10, 4, -10, -6 };
		int n = arr.length;
		System.out.println("Original : ");
		System.out.println(Arrays.toString(arr));
		int[] result = obj.findLargestAndSmallestElementInArray(arr, n);
		if (result[0] != Integer.MIN_VALUE && result[1] != Integer.MAX_VALUE) {
			System.out.println("Smallest Element : " + result[0]);
			System.out.println("Largest Element : " + result[1]);
		} else {
			System.out.println("Invalid Array : " + Arrays.toString(arr));
		}

	}

	public int[] findLargestAndSmallestElementInArray(int[] arr, int n) {
		int[] result = new int[2];
		result[0] = Integer.MIN_VALUE;
		result[1] = Integer.MAX_VALUE;
		if (n > 0) {
			int largestElement = arr[0];
			int smallestElement = arr[0];

			for (int i = 0; i < n; i++) {
				if (arr[i] > largestElement) {
					largestElement = arr[i];
				} else if (arr[i] < smallestElement) {
					smallestElement = arr[i];
				}
			}

			result[0] = smallestElement;
			result[1] = largestElement;
		}
		return result;
	}
}
