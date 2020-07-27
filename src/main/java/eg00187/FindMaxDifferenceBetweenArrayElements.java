package eg00187;

import java.util.Arrays;

// Larger Element should come after Smaller Element
public class FindMaxDifferenceBetweenArrayElements {

	public static void main(String[] args) {

		FindMaxDifferenceBetweenArrayElements obj = new FindMaxDifferenceBetweenArrayElements();

		int[] arr1 = { 2, 5, 15, 6, 4 };
		int[] arr2 = { 7, 9, 5, 6, 13, 2 };

		System.out.println("1. Using Brute Force");
		System.out.println("Original Array :");
		System.out.println(Arrays.toString(arr1));
		System.out.println("Max Difference is :");
		System.out.println(obj.findMaxDifferenceUsingBruteForce(arr1));
		System.out.println("\n2. Using Optimization");
		System.out.println("Original Array :");
		System.out.println(Arrays.toString(arr1));
		System.out.println("Max Difference is :");
		System.out.println(obj.findMaxDifferenceUsingBruteForce(arr1));

		System.out.println("\n1. Using Brute Force");
		System.out.println("Original Array :");
		System.out.println(Arrays.toString(arr2));
		System.out.println("Max Difference is :");
		System.out.println(obj.findMaxDifferenceUsingBruteForce(arr2));
		System.out.println("\n2. Using Optimization");
		System.out.println("Original Array :");
		System.out.println(Arrays.toString(arr2));
		System.out.println("Max Difference is :");
		System.out.println(obj.findMaxDifferenceUsingBruteForce(arr2));

	}

	// Time Complexity : O(n^2)
	public int findMaxDifferenceUsingBruteForce(int[] arr) {
		int n = arr.length;
		int maxDifference = 0;
		int difference = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				difference = arr[j] - arr[i];
				if (arr[i] < arr[j]) {
					maxDifference = Math.max(maxDifference, difference);
				}
			}
		}
		return maxDifference;
	}

	// Time Complexity : O(n)
	public int findMaxDifferenceOptimized(int[] arr) {
		int n = arr.length;
		int maxDifference = arr[1] - arr[0];
		int minElement = arr[0];

		for (int i = 0; i < n; i++) {

			// if array elements difference is greater than maxDifference
			if ((arr[i] - minElement) > maxDifference) {
				maxDifference = arr[i] - minElement;
			}

			// if array element is less that minimum element
			if (arr[i] < minElement) {
				minElement = arr[i];
			}
		}
		return maxDifference;
	}

}
