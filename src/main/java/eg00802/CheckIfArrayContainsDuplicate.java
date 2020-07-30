package eg00802;

import java.util.Arrays;
import java.util.HashSet;

public class CheckIfArrayContainsDuplicate {

	public static void main(String[] args) {

		CheckIfArrayContainsDuplicate obj = new CheckIfArrayContainsDuplicate();

		int[] arr1 = { 1, 2, 3, 1 };
		int[] arr2 = { 1, 2, 3, 4 };
		int[] arr3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

		System.out.println("1. Using HashSet");
		System.out.println(Arrays.toString(arr1) + " " + obj.containsDuplicateUsingHashSet(arr1));
		System.out.println(Arrays.toString(arr2) + " " + obj.containsDuplicateUsingHashSet(arr2));
		System.out.println(Arrays.toString(arr3) + " " + obj.containsDuplicateUsingHashSet(arr3));

		System.out.println("\n2. Using Arrays.sort(arr)");
		System.out.println(Arrays.toString(arr1) + " " + obj.containsDuplicateUsingHashSet(arr1));
		System.out.println(Arrays.toString(arr2) + " " + obj.containsDuplicateUsingHashSet(arr2));
		System.out.println(Arrays.toString(arr3) + " " + obj.containsDuplicateUsingHashSet(arr3));
	}

	// 1. Using HashSet
	public boolean containsDuplicateUsingHashSet(int[] arr) {
		int n = arr.length;
		HashSet<Object> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			// if element is present in set
			if (set.contains(arr[i])) {
				return true;
			} else {
				// add element to hashset if coming for first time
				set.add(arr[i]);
			}
		}
		return false;
	}

	// 2. Using Sorting
	public boolean containsDuplicateUsingArraysSort(int[] arr) {

		int n = arr.length;

		// 1. Sort the Array
		Arrays.sort(arr);

		// 2. Loop through array and compare i and i+1
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				return true;
			}
		}

		return false;
	}

}
