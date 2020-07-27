package eg00151;

import java.util.Arrays;

public class RemoveDuplicateElementsFromSortedArrayUsingSingleArrayDemo {

	public static void main(String[] args) {

		RemoveDuplicateElementsFromSortedArrayUsingSingleArrayDemo obj = new RemoveDuplicateElementsFromSortedArrayUsingSingleArrayDemo();
		int[] arr = { -2, -2, -1, -1, -1, 0, 0, 0, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10, 10 };
		// int[] arr = { -2, 6, 6, 7, 8, 9, 10, 10 };
		int[] result = obj.removeDuplicates(arr);
		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Unique Elements Array : ");
		System.out.println(Arrays.toString(result));
	}

	public int[] removeDuplicates(int[] arr) {
		int n = arr.length;
		if (n == 0 || n == 1) {
			return arr;
		}

	//	int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}

		arr[j++] = arr[n - 1];

		// create new array of size of unique elements
		// copy that many elements to new array
		int[] uniqueElementsArr = new int[j];
		for (int i = 0; i < j; i++) {
			uniqueElementsArr[i] = arr[i];
		}
		return uniqueElementsArr;
	}

}
