package eg00244;

import java.util.Arrays;

public class RemoveDuplicatesFromAdjacentStringCharactersWithoutRecursion {
	public static void main(String args[]) {
		RemoveDuplicatesFromAdjacentStringCharactersWithoutRecursion obj = new RemoveDuplicatesFromAdjacentStringCharactersWithoutRecursion();
		String str = "Mississippi";
		obj.removeDuplicates(str);
	}

	public void removeDuplicates(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;

		if (n < 2) {
			return;
		}

		int k = 0;

		for (int i = 1; i < n; i++) {
			if (arr[k] != arr[i]) {
				k++;
				arr[k] = arr[i];
			}
		}
		System.out.println(Arrays.copyOfRange(arr, 0, k + 1));
	}
}