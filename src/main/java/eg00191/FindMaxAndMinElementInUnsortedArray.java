package eg00191;

public class FindMaxAndMinElementInUnsortedArray {

	public static void main(String[] args) {

		FindMaxAndMinElementInUnsortedArray obj = new FindMaxAndMinElementInUnsortedArray();
		int[] arr = { -4, 2, 6, -9, 1, 7, 3 };
		System.out.println(obj.findMinElement(arr));
		System.out.println(obj.findMaxElement(arr));
	}

	public int findMaxElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public int findMinElement(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}
