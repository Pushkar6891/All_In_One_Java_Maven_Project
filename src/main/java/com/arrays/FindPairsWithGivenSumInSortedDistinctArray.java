package com.arrays;

public class FindPairsWithGivenSumInSortedDistinctArray {

	public static void main(String[] args) {

		FindPairsWithGivenSumInSortedDistinctArray obj = new FindPairsWithGivenSumInSortedDistinctArray();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 7;
		obj.findPairsWithGivenSum(arr,sum);

	}

	// Complexity : O(n)
	public void findPairsWithGivenSum(int[] arr, int sum) {
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		while (low < high) {
			if (arr[low] + arr[high] > sum) {
				high--;
			} else if (arr[low] + arr[high] < sum) {
				low++;
			} else if (arr[low] + arr[high] == sum) {
				System.out.println("(" + arr[low] + "," + arr[high] + ")");
				low++;
				high--;
			}
		}
	}

}
