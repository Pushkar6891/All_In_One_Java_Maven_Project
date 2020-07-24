package eg00109;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArrayDemo {

	public static void main(String[] args) {

		RemoveDuplicateElementsFromArrayDemo obj = new RemoveDuplicateElementsFromArrayDemo();
		int[] arr = { 9, 8, 2, 6, 3, 9, 6, 4};
		Integer[] result = obj.findDuplicates(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(result));
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
