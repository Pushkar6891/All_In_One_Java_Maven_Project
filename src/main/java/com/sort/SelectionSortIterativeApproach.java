package com.sort;

import java.util.Arrays;

public class SelectionSortIterativeApproach {

	public static void main(String[] args) {

		SelectionSortIterativeApproach obj = new SelectionSortIterativeApproach();
		int[] arr = { -10, 9, 8, -6, 3, 7, -2, -4, 1, 2 };
		System.out.println("Original Unsorted Array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Resultant Sorted Array : ");
		System.out.println(Arrays.toString(obj.selectionSort(arr)));
	}

	public int[] selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int minElementIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minElementIndex]) {
					minElementIndex = j;
				}
			}
			int smallerNumber = arr[minElementIndex];
			arr[minElementIndex] = arr[i];
			arr[i] = smallerNumber;
		}
		return arr;
	}

}
