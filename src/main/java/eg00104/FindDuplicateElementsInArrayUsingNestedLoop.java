package eg00104;

import java.util.Arrays;

public class FindDuplicateElementsInArrayUsingNestedLoop {

	public static void main(String[] args) {

		FindDuplicateElementsInArrayUsingNestedLoop obj = new FindDuplicateElementsInArrayUsingNestedLoop();
		int[] arr = { 10, 7, 11, 9, 7, 99, -1, 34, 11, 90 };
		int[] result = obj.findDuplicatesUsingNestedLoop(arr);
		System.out.println("Original : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Duplicate Elements : ");
		System.out.println(Arrays.toString(result));
	}

	// Complexity = O(n^2)
	public int[] findDuplicatesUsingNestedLoop(int[] arr) {
		int[] duplicateElements = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					duplicateElements[count++] = arr[i];
				}
			}
		}

		int nonZeroElementsCount = 0;
		for (int i : duplicateElements) {
			if (i != 0) {
				nonZeroElementsCount++;
			}
		}

		int[] result = new int[nonZeroElementsCount];
		for (int i = 0; i < result.length; i++) {
			result[i] = duplicateElements[i];
		}
		return result;
	}
}
