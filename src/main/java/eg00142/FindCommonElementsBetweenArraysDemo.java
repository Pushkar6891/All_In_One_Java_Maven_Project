package eg00142;

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
		System.out.println(Arrays.toString(obj.findCommonElementsUsingArray(arr1, arr2)));
	}
	
	public int[] findCommonElementsUsingArray(int[] arr1, int[] arr2) {
		int p1 = 0;
		int p2 = 0;
		int n1 = arr1.length;
		int n2 = arr2.length;
		int size = 0;
		if (n1 > n2) {
			size = n1;
		} else {
			size = n2;
		}
		int[] commonElementsArr = new int[size];
		int k = 0;
		while (true) {
			if (arr1[p1] == arr2[p2]) {
				commonElementsArr[k++] = arr1[p1];
			}
			if (p1 == n1 - 1 || p2 == n2 - 1)
				break;
			if (arr1[p1 + 1] < arr2[p2 + 1]) {
				p1++;
			} else {
				p2++;
			}
		}

		int[] common = new int[k];
		for (int i = 0; i < common.length; i++) {
			common[i] = commonElementsArr[i];
		}
		return common;
	}

}
