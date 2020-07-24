package com.search;

import java.util.Arrays;

public class LinearSearchUnsortedDistinctElementsIterativeApproach {

	public static void main(String[] args) {

		LinearSearchUnsortedDistinctElementsIterativeApproach obj = new LinearSearchUnsortedDistinctElementsIterativeApproach();
		int[] arr = { 9, 8, 2, 6, 3, 1, 11, 12, 7, 4, 5, 0 };
		int key = 7;
		int index = obj.linearSearch(arr, key);
		if (index == -1) {
			System.out.println(key + " not found in array " + Arrays.toString(arr));
		} else {
			System.out.println(key + " found in array " + Arrays.toString(arr) + " at position " + (index + 1));
		}
	}

	public int linearSearch(int[] arr, int key) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				index = i;
				return index;
			}
		}

		return index;
	}

}
