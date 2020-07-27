package eg00249;

import java.util.HashMap;
import java.util.Map;

public class FindIndexesOfPairsWithGivenSumInASortedArray {

	public static void main(String[] args) {
		FindIndexesOfPairsWithGivenSumInASortedArray obj = new FindIndexesOfPairsWithGivenSumInASortedArray();
		// sorted array
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		// int sum = 9;
		int targetSum = 8;
		// pairs {2,7}, {3,6}, {4,5}
		// obj.findPair(arr, targetSum);
		System.out.println();
		// System.out.println(Arrays.toString(obj.findIndexesOfPairUsingPairBruteForce(arr,
		// targetSum)));
		System.out.println("\n1. Using Brute Force in O(n^2)");
		obj.findIndexesOfPairUsingPairBruteForce(arr, targetSum);
		System.out.println("\n3. Using HashMap in O(n)");
		obj.findPairUsingHashMap(arr, targetSum);
	}

	// Complexity : O(n^2)
	public void findIndexesOfPairUsingPairBruteForce(int[] arr, int targetSum) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int delta = targetSum - arr[i];
				if (arr[j] == delta) {
					// return new int[] { i, j };
					System.out.println(i + " " + j);
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

	// Complexity : O(n) using HashMap
	public void findPairUsingHashMap(int[] arr, int targetSum) {
		// Key : number Value : index of Number
		Map<Integer, Integer> map = new HashMap<>();
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			map.put(arr[i], i);
		}
		for (int i = 0; i < n; i++) {
			int delta = targetSum - arr[i];
			if (map.containsKey(delta) && map.get(delta) != i) {
				// return new int[] { i, map.get(delta) };
				//if (i > map.get(delta))
					System.out.println(i + " " + map.get(delta));
			}
		}
	}

}
