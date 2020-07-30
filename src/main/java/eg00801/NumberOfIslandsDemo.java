package eg00801;

// Use Breadth First Search
public class NumberOfIslandsDemo {

	public static void main(String[] args) {

		NumberOfIslandsDemo obj = new NumberOfIslandsDemo();
// 		No. of Islands : 1
//		int[][] arr = { { 1, 1, 1, 1, 0 }, { 1, 1, 0, 1, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0 } };
	
// 		No. of Islands : 3
		int[][] arr = { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 0, 1, 1 } };
		
		for (int i = 0; i < arr.length; i++) {
			// Loop through all elements of current row
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		int islandCounter = obj.islandCounter(arr);
		System.out.println(islandCounter);

	}

	public int islandCounter(int[][] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1) {
					count++;
					callBFS(arr, i, j);
				}
			}
		}
		return count;
	}

	public void callBFS(int[][] arr, int i, int j) {
		// Boundary Checks
		if (i < 0 || i >= arr.length || j < 0 || j >= arr[i].length || arr[i][j] == 0)
			return;

		arr[i][j] = 0;
		callBFS(arr, i + 1, j);// up
		callBFS(arr, i - 1, j);// down
		callBFS(arr, i, j - 1);// left
		callBFS(arr, i, j + 1);// right
	}

}
