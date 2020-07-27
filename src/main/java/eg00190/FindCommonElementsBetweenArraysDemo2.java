package eg00190;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindCommonElementsBetweenArraysDemo2 {

	public static void main(String[] args) {

		FindCommonElementsBetweenArraysDemo2 obj = new FindCommonElementsBetweenArraysDemo2();
		int[] arr1 = { 9, 2, 4, -1, -5, 99, 33, 56, 11, 0, 6 };
		int[] arr2 = { -9, 12, 24, -61, -5, 99, 33, 561, -11, 10, 6 };
		System.out.println("Original Array 1: ");
		System.out.println(Arrays.toString(arr1));
		System.out.println("Original Array 2: ");
		System.out.println(Arrays.toString(arr2));
		System.out.println("Common Elements Array: ");
		System.out.println((obj.findCommonElementsUsingNestedForLoopAndSet(arr1, arr2)));
	}

	public Set<Integer> findCommonElementsUsingNestedForLoopAndSet(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				if (arr1[i] == arr2[j]) {
				//	System.out.print(arr1[i] + " ");
					set.add(arr1[i]);

				}
			}
		}
		
		return set;
	}

}
