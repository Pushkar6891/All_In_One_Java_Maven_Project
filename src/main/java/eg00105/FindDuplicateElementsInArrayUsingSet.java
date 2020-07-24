package eg00105;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateElementsInArrayUsingSet {

	public static void main(String[] args) {

		FindDuplicateElementsInArrayUsingSet obj = new FindDuplicateElementsInArrayUsingSet();
		int[] arr = { 10, 7, 11, 9, 7, 99, -1, 34, 11, 90 };
		System.out.println("Original : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Duplicate Elements : ");
		System.out.println(Arrays.toString(obj.findDuplicatesUsingSet(arr)));

	}

	// Complexity = O(n)
	public int[] findDuplicatesUsingSet(int[] arr) {
		Set<Integer> set = new LinkedHashSet<>();
		String uniqueNumbers = "";
		for (Integer num : arr) {
			if (!set.add(num)) {
				uniqueNumbers += num + " ";
			}
		}

		String[] splitedUniqueNumbers = uniqueNumbers.split(" ");
		int[] uniqueArr = new int[splitedUniqueNumbers.length];
		for (int i = 0; i < splitedUniqueNumbers.length; i++) {
			uniqueArr[i] = Integer.parseInt(splitedUniqueNumbers[i]);
		}

		return uniqueArr;
	}
}
