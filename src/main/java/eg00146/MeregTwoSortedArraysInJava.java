package eg00146;

import java.util.Arrays;

public class MeregTwoSortedArraysInJava {

	public static void main(String[] args) {

		MeregTwoSortedArraysInJava obj = new MeregTwoSortedArraysInJava();
		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = { 40, 50, 60, 70, 80 };
		System.out.println("Sorted Array 1 : ");
		System.out.println(Arrays.toString(arr1));
		System.out.println("Sorted Array 2 : ");
		System.out.println(Arrays.toString(arr2));
		int[] mergedSortedArray1 = obj.mergeTwoSortedArrays1(arr1, arr2);
		System.out.println("Resultant Sorted Array Using 1: ");
		System.out.println(Arrays.toString(mergedSortedArray1));
		int[] mergedSortedArray2 = obj.mergeTwoSortedArrays1(arr1, arr2);
		System.out.println("Resultant Sorted Array Using 2: ");
		System.out.println(Arrays.toString(mergedSortedArray2));

	}

	// Using firstArrayLength + i
	public int[] mergeTwoSortedArrays1(int[] arr1, int[] arr2) {
		int firstArrayLength = arr1.length;
		int secondArrayLength = arr2.length;
		int resultArrayLength = firstArrayLength + secondArrayLength;
		int[] mergedArr = new int[resultArrayLength];

		for (int i = 0; i < firstArrayLength; i++) {
			mergedArr[i] = arr1[i];
		}
		for (int i = 0; i < secondArrayLength; i++) {
			mergedArr[firstArrayLength + i] = arr2[i];
		}
		return mergedArr;

	}

	// Using temporary variable k
	public int[] mergeTwoSortedArrays2(int[] arr1, int[] arr2) {
		int firstArrayLength = arr1.length;
		int secondArrayLength = arr2.length;
		int resultArrayLength = firstArrayLength + secondArrayLength;
		int[] mergedArr = new int[resultArrayLength];

		int k = 0;
		for (int i = 0; i < firstArrayLength; i++) {
			mergedArr[k++] = arr1[i];
		}
		for (int i = 0; i < secondArrayLength; i++) {
			mergedArr[k++] = arr2[i];
		}
		return mergedArr;

	}
}
