package eg001102;

public class DiagonalDifferenceInMatrix {

	public static void main(String[] args) {

		DiagonalDifferenceInMatrix obj = new DiagonalDifferenceInMatrix();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int arraySum = obj.getArraySum(arr);
		System.out.println(arraySum);

	}

	public int getArraySum(int[] arr) {
		int n = arr.length;
		int array_sum = 0;
		for (int i = 0; i < n; i++) {
			array_sum += arr[i];
		}
		return array_sum;
	}

}
