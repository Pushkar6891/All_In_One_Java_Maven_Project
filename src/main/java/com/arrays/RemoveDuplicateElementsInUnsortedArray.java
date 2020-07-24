package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateElementsInUnsortedArray {

	public static void main(String[] args) {

		RemoveDuplicateElementsInUnsortedArray obj = new RemoveDuplicateElementsInUnsortedArray();
		int[] arr = { 9, 8, 2, 6, 3, 9, 6, 4, 6, 5 };
		System.out.println("Original Arr :");
		System.out.println(Arrays.toString(arr));
		System.out.println("Resultant Arr Removing duplicate elements Using HashSet :");
		System.out.println(Arrays.toString(obj.removeDuplicatesUsingHashSet(arr)));
		System.out.println("Resultant Arr Removing duplicate elements Using Java 8 stream :");
		System.out.println(Arrays.toString(obj.removeDuplicatesUsingJava8Stream(arr)));
		System.out.println("Resultant Arr Removing duplicate elements Using HashMap :");
		System.out.println(Arrays.toString(obj.removeDuplicatesUsingHashMap(arr)));
	}

	// Complexity :
	public int[] removeDuplicatesUsingHashSet(int[] arr) {
		int n = arr.length;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(arr[i]);
		}
		int[] uniqueElements = new int[set.size()];
		int k = 0;
		for (int num : set) {
			uniqueElements[k++] = num;
		}
		return uniqueElements;
	}

	public int[] removeDuplicatesUsingJava8Stream(int[] arr) {
		return Arrays.stream(arr).distinct().toArray();
	}

	public Integer[] removeDuplicatesUsingHashMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int num = arr[i];
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		Set<Integer> keySet = map.keySet();
		Integer[] uniqueArr = keySet.toArray(new Integer[keySet.size()]);
		return uniqueArr;
	}
}
