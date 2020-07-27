package eg00183;

import java.util.Arrays;

public class InsertAnElementIntoArrayAtSpecificIndex {

	public static void main(String[] args) {

		InsertAnElementIntoArrayAtSpecificIndex obj = new InsertAnElementIntoArrayAtSpecificIndex();
		int[] arr = { 10, 40, 8, 30, 80, 60, 20, 9, 3 };
		int index = 5;
		int element = 100;
		System.out.println("Original Array :");
		System.out.println(Arrays.toString(arr));
		System.out.println("Resultant Array :");
		System.out.println(Arrays.toString(obj.insertElementAtIndexFromBackSide(arr, index, element)));
	}

	// replace position - 1 by index
	public int[] insertElementAtIndexFromBackSide(int[] arr, int index, int key) {
		int n = arr.length;
		for (int i = n - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = key;
		return arr;
	}

}
