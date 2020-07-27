package eg00254;

public class DifferentWaysToCreateArrayDemo {

	public static void main(String[] args) {

		// 1. Anonymous Array
		// No name for Anonymous Array
		// Anonymous Array are created and initialised in one line
		// Anonymous Array as used as argument to method
		// Anonymous Array can be 1D 2D 3D
		// Anonymous array can be used only once
		System.out.println(sum(new int[] { 10, 20, 30 }));

		// 2. Single Dimensional Array
		int[] one_dimeension_arr = new int[10];

		// 3. Two Dimensional Array
		int[][] two_dimension_arr = new int[2][2];

		// 4. Three Dimensional Array
		int[][][] three_dimension_arr = new int[3][3][3];
	}

	public static int sum(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}

}
