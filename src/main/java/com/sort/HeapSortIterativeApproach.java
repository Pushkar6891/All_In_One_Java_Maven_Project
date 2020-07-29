package com.sort;

import java.util.Arrays;

// Divide and Conquer Technique or Partitioning
public class HeapSortIterativeApproach {

	public static void main(String[] args) {

		HeapSortIterativeApproach obj = new HeapSortIterativeApproach();
		int[] arr = { -10, 9, 8, -6, 3, 7, -2, -4, 1, 2 };
		System.out.println("Original Unsorted Array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Resultant Sorted Array : ");
		obj.heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public void heapSort(int arr[]) {
		int i;
		int size = arr.length;
		for (i = size / 2 - 1; i >= 0; i--)
			heapify(arr, size, i);
		for (i = size - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}

	public void heapify(int arr[], int size, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < size && arr[left] > arr[largest])
			largest = left;

		if (right < size && arr[right] > arr[largest])
			largest = right;

		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, size, largest);
		}
	}

}
