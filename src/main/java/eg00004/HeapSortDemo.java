package eg00004;

import java.util.Arrays;

public class HeapSortDemo {

	public static void main(String[] args) {

		HeapSortDemo obj = new HeapSortDemo();
		int[] arr = { 22, 13, 17, 11, 10, 14, 12 };
		System.out.println("Original Unsorted Array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Resultant Sorted Array : ");
		obj.heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public void heapSort(int[] arr) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--) {
			// i is parent node index
			heapify(arr, n, i);
		}

		// swap elements and heapify
		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}

	public void heapify(int arr[], int n, int i) {
		int largest = i; // parent node index position
		int left = 2 * i + 1; // left child node index position
		int right = 2 * i + 2;// right child node index position

		if (left < n && arr[left] > arr[largest]) {
			largest = left;
		}

		if (right < n && arr[right] > arr[largest]) {
			largest = right;
		}

		if (largest != i) {
			// swap
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			// call heapify
			heapify(arr, n, largest);
		}
	}

}
