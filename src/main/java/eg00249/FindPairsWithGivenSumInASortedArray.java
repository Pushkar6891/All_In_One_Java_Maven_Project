package eg00249;

import java.util.Arrays;

public class FindPairsWithGivenSumInASortedArray {

	public static void main(String[] args) {
		FindPairsWithGivenSumInASortedArray obj = new FindPairsWithGivenSumInASortedArray();
		// sorted array
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		// int sum = 9;
		int targetSum = 8;
		// pairs {2,7}, {3,6}, {4,5}
		obj.findPair(arr, targetSum);
		System.out.println();
	//	System.out.println(Arrays.toString(obj.findIndexesOfPairUsingPairBruteForce(arr, targetSum)));
		obj.findPairUsingPairBruteForce(arr, targetSum);
	}

	// Complexity : O(n^2)
	public void findPairUsingPairBruteForce(int[] arr, int targetSum) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int delta = targetSum - arr[i];
				if (arr[j] == delta) {
					//return new int[] { i, j };
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
	}
	
	
	public void findPair(int[] arr, int targetSum) {
		int low = 0;
		int high = arr.length - 1;
		while (low < high) {
			// for (int i = 0; i < arr.length/2; i++) {
			if (arr[low] + arr[high] > targetSum) {
				high--;
			} else if (arr[low] + arr[high] < targetSum) {
				low++;
			} else if (arr[low] + arr[high] == targetSum) {
				System.out.println(arr[low] + " " + arr[high]);
				low++;
				high--;
			}
			// }
		}
	}



}
