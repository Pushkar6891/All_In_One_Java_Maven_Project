package eg00192;

public class FindMaxAndMinElementInSortedArray {

	public static void main(String[] args) {

		FindMaxAndMinElementInSortedArray obj = new FindMaxAndMinElementInSortedArray();
		int[] arr = { -4, -2, 0, 1, 5, 9 };
		System.out.println(obj.findMinElement(arr));
		System.out.println(obj.findMaxElement(arr));
	}

	public int findMaxElement(int[] arr) {
		int n = arr.length;
		return arr[n - 1];
	}

	public int findMinElement(int[] arr) {
		return arr[0];
	}

}
