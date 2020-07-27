package eg00008;

import java.util.Arrays;

public class QuickSortDemo {

	public static void main(String[] args) {

		QuickSortDemo obj = new QuickSortDemo();
		int[] arr = { -10, 9, 8, -6, 3, 7, -2, -4, 1, 2 };
		int low = 0;
		int high = arr.length - 1;
		System.out.println("Original Unsorted Array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Resultant Sorted Array : ");
		obj.quickSort(arr, low, high);
		System.out.println(Arrays.toString(arr));

	}

	public void quickSort(int[] arr, int low, int high) {
		int loc = partition(arr, low, high);
		// LHS List
		if (low < loc - 1) {
			quickSort(arr, low, loc - 1);
		}
		// RHS List
		if (loc < high) {
			quickSort(arr, loc + 1, high);
		}
	}

	public int partition(int arr[], int low, int high) {
	// Taking middle element as pivot
		int pivot = arr[(low + high) / 2];
		
	// Taking first element as pivot
	//	int pivot = arr[low];
		
	// Taking last element as pivot	will give error
	//	int pivot = arr[high];
		while (low <= high) {
			while (arr[low] < pivot) {
				low++;
			}
			while (arr[high] > pivot) {
				high--;
			}
			if (low <= high) {
				// swap
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;

				low++;
				high--;
			}
		}
		return low;
	}

}
