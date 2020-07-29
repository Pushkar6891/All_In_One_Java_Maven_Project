package com.sort;

import java.util.Arrays;

public class BubbleSortImprovedIterativeApproach {

	public static void main(String[] args) {

		BubbleSortImprovedIterativeApproach obj = new BubbleSortImprovedIterativeApproach();
		int[] arr = { -10, 9, 8, -6, 3, 7, -2, -4, 1, 2 };
		System.out.println("Original Unsorted Array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Resultant Sorted Array : ");
		System.out.println(Arrays.toString(obj.bubbleSort(arr)));
	}

	public int[] bubbleSort(int[] arr) {
		int n = arr.length;
		boolean sortedFlag;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0 ; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					sortedFlag = true;
				}
			}
			if (sortedFlag = false)
				break;
		}
		return arr;
	}

}
