package eg00003;

import java.util.Arrays;

// Divide and Conquer Technique or Partitioning
public class MergeSortDemo {

	int n = 10;
	int[] tempMergeArr = new int[n];
	int[] array;

	public static void main(String[] args) {

		MergeSortDemo obj = new MergeSortDemo();
		int[] arr = { -10, 9, 8, -6, 3, 7, -2, -4, 1, 2 };
		int low = 0;
		int high = arr.length - 1;

		System.out.println("Original Unsorted Array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Resultant Sorted Array : ");
		obj.mergeSort(arr, low, high);
		System.out.println(Arrays.toString(arr));
	}

	public void mergeSort(int[] arr, int low, int high) {
		array = arr;
		divideArray(0, n - 1);
	}

	public void divideArray(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// this will sort LHS array
			divideArray(lowerIndex, middle);
			// this will sort RHS array
			divideArray(middle + 1, higherIndex);
			// merge Arrays
			mergeArray(lowerIndex, middle, higherIndex);
		}
	}

	public void mergeArray(int lowerIndex, int middle, int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergeArr[i] = array[i];
		}

		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergeArr[i] <= tempMergeArr[j]) {
				array[k] = tempMergeArr[i];
				i++;
			} else {
				array[k] = tempMergeArr[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			array[k] = tempMergeArr[i];
			k++;
			i++;
		}
	}

}
