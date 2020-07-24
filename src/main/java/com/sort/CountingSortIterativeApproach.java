package com.sort;

import java.util.Arrays;

// Counting Sort is not a comparison sort
// Counting Sort for only positive integers
// Cpunt distinct elements
// arr = {2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9}
// Pass 1: (count of occurrence of each element) 
// index      => 0 1 2 3 4 5 6 7 8 9
// occurrence => 3 3 4 0 1 1 0 2 1 2

// O(n)
// n
// k = maxElement
// 0 < arr[i] < k
public class CountingSortIterativeApproach {

	public static void main(String[] args) {

		CountingSortIterativeApproach obj = new CountingSortIterativeApproach();
		int[] arr = { -10, 1, 9, -1, -9, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9, -9, -8, -7, -6, -5, -4, -3, -2, -1, 8, 3, -4, 9,
				-8, 7, -6, 5, -4, 3, -2, 1, 0, -1, 2, -3, 4, -5, 6, -7, 8, -9 };
		System.out.println("Original Unsorted Array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Resultant Sorted Array : ");
		System.out.println(Arrays.toString(obj.countSort(arr)));
	}

	public int[] countSort(int[] arr) {
		// k is the max element in arr
		// range is from min to max
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int range = max - min + 1;
		int[] count = new int[range];
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - min]++;
		}
		for (int i = 1; i < count.length; i++) {
			count[i] = count[i] + count[i - 1];
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			result[count[arr[i] - min] - 1] = arr[i];
			count[arr[i] - min]--;
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = result[i];
		}
		return arr;
	}

}
