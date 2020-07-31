package eg01101;

public class DiagonalDifferenceInMatrix {

	public static void main(String[] args) {

		DiagonalDifferenceInMatrix obj = new DiagonalDifferenceInMatrix();
//		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		int[][] arr = { { 7, 8, 9 }, { 4, 5, 6 }, { 1, 2, 3 } };
//		int[][] arr = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int[][] arr = { { 9, 8, 5 }, { 1, 1, 2 }, { 2, 2, 5 } }; // 15 - 8 = 7 
		int diagonalDifference1 = obj.getDiagonalDifference1(arr);
		int diagonalDifference2 = obj.getDiagonalDifference2(arr);
		System.out.println(diagonalDifference1);
		System.out.println(diagonalDifference2);

	}

	public int getDiagonalDifference1(int[][] arr) {

		int left_to_right = 0;
		int right_to_left = 0;

		int rows = arr.length;
		int columns = arr[0].length;

		int i = 0;
		int j = 0;
		int k = 0;
		int l = arr.length - 1;

		while (i < rows && j < columns && k < rows && l >= 0) {
			left_to_right += arr[i][j];
			right_to_left += arr[k][l];
			i += 1;
			j += 1;
			k += 1;
			l -= 1;
		}

		return Math.abs(left_to_right - right_to_left);
	}

	public int getDiagonalDifference2(int arr[][]) {
		int n = arr.length;
		// Initialize sums of diagonals
		int d1 = 0, d2 = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// finding sum of primary diagonal
				if (i == j)
					d1 += arr[i][j];

				// finding sum of secondary diagonal
				if (i == n - j - 1)
					d2 += arr[i][j];
			}
		}

		// Absolute difference of the sums
		// across the diagonals
		return Math.abs(d1 - d2);
	}

}
