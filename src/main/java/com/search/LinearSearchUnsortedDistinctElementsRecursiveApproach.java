package com.search;

import java.util.Arrays;

public class LinearSearchUnsortedDistinctElementsRecursiveApproach {

	public static void main(String[] args) {

		LinearSearchUnsortedDistinctElementsRecursiveApproach obj = new LinearSearchUnsortedDistinctElementsRecursiveApproach();
		int[] arr = { 9, 8, 2, 6, 3, 1, 11, 12, 7, 4, 5, 0 };
		int key = 7;
		int low = 0;
		int high = arr.length;
		int index = obj.linearSearch(arr, low, high, key);
		if (index == -1) {
			System.out.println(key + " not found in array " + Arrays.toString(arr));
		} else {
			System.out.println(key + " found in array " + Arrays.toString(arr) + " at position " + (index + 1));
		}
	}

	public int linearSearch(int[] arr, int low, int high, int key) {
		if (high < low)
			return -1;
		if (arr[low] == key)
			return low;

		return linearSearch(arr, low + 1, high, key);
	}

}
