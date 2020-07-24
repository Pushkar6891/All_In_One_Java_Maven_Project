package com.search;

import java.util.Arrays;

public class BinarySearchSortedDistinctElementsRecursiveApproach {

	public static void main(String[] args) {

		BinarySearchSortedDistinctElementsRecursiveApproach obj = new BinarySearchSortedDistinctElementsRecursiveApproach();
		int[] arr = { 1, 3, 5, 6, 7, 8, 9 };
		int key = 7;
		int low = 0;
		int high = arr.length;
		int index = obj.binarySearch(arr, low, high, key);
		if (index == -1) {
			System.out.println(key + " not found in array " + Arrays.toString(arr));
		} else {
			System.out.println(key + " found in array " + Arrays.toString(arr) + " at position " + (index + 1));
		}
	}

	public int binarySearch(int[] arr, int low, int high, int key) {
		Arrays.sort(arr);
		int index = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				index = mid;
				return index;
			} else if (key > arr[mid]) {
				return binarySearch(arr, mid + 1, high, key);
			} else if (key < arr[mid]) {
				return binarySearch(arr, low, mid - 1, key);
			}
		}

		return index;
	}

}
