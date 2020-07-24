package eg00110;

import java.util.Arrays;

public class RemoveDuplicateElementsFromArrayDemo {

	public static void main(String[] args) {

		RemoveDuplicateElementsFromArrayDemo obj = new RemoveDuplicateElementsFromArrayDemo();
		int[] arr = { 9, 8, 2, 6, 3, 9, 6, 4 };
		int[] result = obj.removeDuplicates(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(result));
	}

	public int[] removeDuplicates(int[] arr) {
		return Arrays.stream(arr).distinct().toArray();
	}

}
