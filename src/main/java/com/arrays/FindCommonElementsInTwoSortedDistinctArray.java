package com.arrays;

public class FindCommonElementsInTwoSortedDistinctArray {

	public static void main(String[] args) {

		FindCommonElementsInTwoSortedDistinctArray obj = new FindCommonElementsInTwoSortedDistinctArray();
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr2 = { 2, 4, 6, 8, 10, 12 };
		obj.findCommonElementsInTwoSortedDistinctArray(arr1, arr2);
	}

	// Complexity : O(n^2)
	public void findCommonElementsInTwoSortedDistinctArray(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
				}
			}
		}
	}
}
