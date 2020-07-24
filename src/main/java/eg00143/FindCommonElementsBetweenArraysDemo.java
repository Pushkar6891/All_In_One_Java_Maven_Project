package eg00143;

import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonElementsBetweenArraysDemo {

	public static void main(String[] args) {

		FindCommonElementsBetweenArraysDemo obj = new FindCommonElementsBetweenArraysDemo();
		int[] arr1 = { 9, 2, 4, -1, -5, 99, 33, 56, 11, 0, 6 };
		int[] arr2 = { -9, 12, 24, -61, -5, 99, 33, 561, -11, 10, 6 };
		System.out.println("Original Array 1: ");
		System.out.println(Arrays.toString(arr1));
		System.out.println("Original Array 2: ");
		System.out.println(Arrays.toString(arr2));
		System.out.println("Common Elements Array: ");
		System.out.println(obj.findCommonElementsUsingList(arr1, arr2));
	}

	public ArrayList<Integer> findCommonElementsUsingList(int[] arr1, int[] arr2) {
		int p1 = 0;
		int p2 = 0;
		ArrayList<Integer> common = new ArrayList<Integer>();

		while (true) {
			if (arr1[p1] == arr2[p2]) {
				common.add(arr1[p1]);
			}
			if (p1 == arr1.length - 1 || p2 == arr2.length - 1)
				break;
			if (arr1[p1 + 1] < arr2[p2 + 1]) {
				p1++;
			} else {
				p2++;
			}
		}
		return common;
	}

}
