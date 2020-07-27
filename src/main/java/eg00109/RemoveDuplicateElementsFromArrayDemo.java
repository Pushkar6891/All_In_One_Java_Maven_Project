package eg00109;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArrayDemo {

	public static void main(String[] args) {

		RemoveDuplicateElementsFromArrayDemo obj = new RemoveDuplicateElementsFromArrayDemo();
		int[] sortedArr = { -2, -2, -1, -1, -1, 0, 0, 0, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10,
				10 };
		int[] unsortedArr = { -2, 10, 10, 3, 7, 9, 10, -2 };
		Integer[] resultSortedArr = obj.findDuplicates(sortedArr);
		System.out.println("Original Sorted Array : ");
		System.out.println(Arrays.toString(sortedArr));
		System.out.println("Unique Elements Sorted Array : ");
		System.out.println(Arrays.toString(resultSortedArr));
		Integer[] resultUnsortedArr = obj.findDuplicates(unsortedArr);
		System.out.println("Original Unsorted Array : ");
		System.out.println(Arrays.toString(unsortedArr));
		System.out.println("Unique Elements Unsorted Array : ");
		System.out.println(Arrays.toString(resultUnsortedArr));
	}

	public Integer[] findDuplicates(int[] arr) {
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		Integer[] resultArray = set.toArray(new Integer[set.size()]);
		return resultArray;
	}

}
