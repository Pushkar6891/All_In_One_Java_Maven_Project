package eg00100;

import java.util.Arrays;

public class InsertAnElementIntoArrayAtSpecificPosition {

	public static void main(String[] args) {

		InsertAnElementIntoArrayAtSpecificPosition obj = new InsertAnElementIntoArrayAtSpecificPosition();
		int[] arr = { 10, 40, 30, 80, 60, 20 };
		int position = 3;
		int element = 100;
		System.out.println("Original Array :");
		System.out.println(Arrays.toString(arr));
		System.out.println("Resultant Array :");
		System.out.println(Arrays.toString(obj.insertElementAtPositionFromBackSide(arr, position, element)));
	}

	public int[] insertElementAtPositionFromBackSide(int[] arr, int position, int key) {
		int n = arr.length;
		for (int i = n - 1; i > position - 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[position - 1] = key;
		return arr;
	}

}
