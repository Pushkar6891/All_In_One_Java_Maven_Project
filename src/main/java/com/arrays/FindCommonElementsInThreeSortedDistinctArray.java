package com.arrays;

import java.util.Arrays;

public class FindCommonElementsInThreeSortedDistinctArray {

	public static void main(String[] args) {

		FindCommonElementsInThreeSortedDistinctArray obj = new FindCommonElementsInThreeSortedDistinctArray();
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] arr2 = { 2, 4, 6, 8, 10, 12 };
		int[] arr3 = { 3, 5, 6, 8, 9, 12 };
		System.out.println("Original Array 1 : ");
		System.out.println(Arrays.toString(arr1));
		System.out.println("Original Array 2 : ");
		System.out.println(Arrays.toString(arr2));
		System.out.println("Original Array 3 : ");
		System.out.println(Arrays.toString(arr3));
		System.out.println("1.Find Common Elements In Three Sorted Distinct Array Using Three Nested For Loop : ");
		obj.findCommonElementsInThreeSortedDistinctArrayUsingThreeNestedForLoop(arr1, arr2, arr3);
		System.out.println("\n2.Find Common Elements In Three Sorted Array Using Three Index : ");
		obj.findCommonElementsInThreeSortedArrayUsingThreeIndex(arr1, arr2, arr3);
	}

	// Complexity : O(n^3)
	public void findCommonElementsInThreeSortedDistinctArrayUsingThreeNestedForLoop(int[] arr1, int[] arr2,
			int[] arr3) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				for (int k = 0; k < arr3.length; k++) {
					if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
						System.out.print(arr1[i] + " ");
					}
				}
			}
		}
	}

	public void findCommonElementsInThreeSortedArrayUsingThreeIndex(int[] arr1, int[] arr2, int[] arr3) {
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
				k++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else if (arr2[j] > arr3[k]) {
				k++;
			} else if (arr3[k] > arr1[i]) {
				i++;
			}
		}
	}
}
