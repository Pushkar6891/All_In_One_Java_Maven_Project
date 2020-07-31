package eg00904;

import java.util.Arrays;

public class IndexArray {

	public static void main(String[] args) {

		IndexArray obj = new IndexArray();
		int[] arr = { 8, -1, 6, 1, 9, 3, 2, 7, 4, -1 };
		System.out.println(Arrays.toString(arr));
		int[] indexArray1 = obj.indexArray1(arr);
		System.out.println(Arrays.toString(indexArray1));
		int[] indexArray2 = obj.indexArray2(arr);
		System.out.println(Arrays.toString(indexArray2));
	}

	public int[] indexArray1(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int curr = i;
			int value = -1;

			// swap
			while (arr[curr] != -1 && arr[curr] != curr) {
				int temp = arr[curr];
				arr[curr] = value;
				value = curr = temp;
			}

			// check if some swaps happened
			if (value != -1) {
				arr[curr] = value;
			}
		}

		// return index array
		return arr;
	}

	public int[] indexArray2(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {

			// swap
			while (arr[i] != -1 && arr[i] != i) {
				temp = arr[i];
				arr[i] = arr[temp];
				arr[temp] = temp;
			}
		}

		// return index array
		return arr;
	}

}
