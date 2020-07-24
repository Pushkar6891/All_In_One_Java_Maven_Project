package com.search;

import java.util.Arrays;

public class BinarySearchSortedDistinctElementsIterativeApproach {

	public static void main(String[] args) {

		BinarySearchSortedDistinctElementsIterativeApproach obj = new BinarySearchSortedDistinctElementsIterativeApproach();
		int[] arr = { 1, 3, 5, 6, 7, 8, 9 };
		int key = 7;
		int index = obj.binarySearch(arr, key);
		if (index == -1) {
			System.out.println(key + " not found in array " + Arrays.toString(arr));
		} else {
			System.out.println(key + " found in array " + Arrays.toString(arr) + " at position " + (index + 1));
		}
	}

	public int binarySearch(int[] arr, int key) {
		int index = -1;
		int low = 0;
		int high = arr.length;
		int mid = 0;
		while(low<high) {
			mid = (low+high)/2;
			if(arr[mid]<key) {
				low++;
			}else if(arr[mid]>key) {
				high--;
			}else if(arr[mid]==key) {
				index = mid;
				return index;
			}
		}

		return index;
	}

}
