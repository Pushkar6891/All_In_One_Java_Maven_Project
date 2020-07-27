package eg00108;

import java.util.Arrays;

public class FindCommonElementsBetweenArraysWithDistinctElements {

	public static void main(String[] args) {

		FindCommonElementsBetweenArraysWithDistinctElements obj = new FindCommonElementsBetweenArraysWithDistinctElements();
		int[] arr1 = { 9, 2, 4, -1, -5, 99, 33, 56, 11, 0, 6, 99 };
		int[] arr2 = { -9, 12, 24, -61, -5, 99, 33, 561, -11, 10, 6 };
		System.out.println("Array 1:");
		System.out.println(Arrays.toString(arr1));
		System.out.println("Array 2:");
		System.out.println(Arrays.toString(arr2));
		System.out.println("Common Elements:");
		obj.findCommonElements(arr1, arr2);
	}

	public void findCommonElements(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
				}
			}
		}
	}

}
