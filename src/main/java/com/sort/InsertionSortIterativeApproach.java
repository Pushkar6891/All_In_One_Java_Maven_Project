package com.sort;

import java.util.Arrays;

public class InsertionSortIterativeApproach {

	public static void main(String[] args) {

		InsertionSortIterativeApproach obj = new InsertionSortIterativeApproach();
		int[] arr = { -10, 9, 8, -6, 3, 7, -2, -4, 1, 2 };
		System.out.println("Original Unsorted Array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Resultant Sorted Array : ");
		System.out.println(Arrays.toString(obj.insertionSort(arr)));
	}

	public int[] insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		return arr;
	}

}
