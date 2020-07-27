package eg00184;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindLongestSubsequenceLengthOrLongestConsecutiveSequenceInIntArray {

	public static void main(String[] args) {

		FindLongestSubsequenceLengthOrLongestConsecutiveSequenceInIntArray obj = new FindLongestSubsequenceLengthOrLongestConsecutiveSequenceInIntArray();
//		int[] arr = { 3, 9, 1, 10, 4, 20, 2 };
		int[] arr = { 3, 9, 1, 13, 10, 4, 20, 2, 11, 12 };
		System.out.println("Original Array :");
		System.out.println(Arrays.toString(arr));
		System.out.println("Resultant Array :");
		System.out.println(obj.findLongestSubsequenceUsingHashSet(arr));

	}

	// [1,2,3,4] longest length is 4
	// [9,10,11,12,13] longest length is 5
	public int findLongestSubsequenceUsingHashSet(int[] arr) {
		int n = arr.length;
		int longest_length = 0;
		Set<Integer> set = new HashSet<>();
		// store all array elements into hashset
		for (int i = 0; i < n; i++) {
			set.add(arr[i]);
		}
		for (int i = 0; i < n; i++) {
			// element one less than the number is there in set
			if (!set.contains(arr[i] - 1)) {
				int num = arr[i];

				while (set.contains(num)) {
					num++;
				}

				if (longest_length < num - arr[i])
					longest_length = num - arr[i];
			}
		}

		return longest_length;
	}

}
