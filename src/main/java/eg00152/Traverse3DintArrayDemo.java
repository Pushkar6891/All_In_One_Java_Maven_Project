package eg00152;

public class Traverse3DintArrayDemo {

	public static void main(String[] args) {

		Traverse3DintArrayDemo obj = new Traverse3DintArrayDemo();
		int[][][] arr = { { { 10, 20 }, { 30, 40, 50 } }, { { 60, 70, 80 }, { 90, 100 } } };
		System.out.println("Size : " + arr.length);
		System.out.println("1. Using for Loop");
		obj.traverse3DintArrayUsingforLoop(arr);
		System.out.println("\n2. Using while Loop");
		obj.traverse3DintArrayUsingwhileLoop(arr);
		System.out.println("\n3. Using do while Loop");
		obj.traverse3DintArrayUsingdowhileLoop(arr);
	}

	public void traverse3DintArrayUsingforLoop(int[][][] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public void traverse3DintArrayUsingwhileLoop(int[][][] arr) {
		int n = arr.length;
		int i = 0;
		while (i < n) {
			int j = 0;
			while (j < arr[i].length) {
				int k = 0;
				while (k < arr[i][j].length) {
					System.out.print(arr[i][j][k] + " ");
					k++;
				}
				System.out.println();
				j++;
			}
			i++;
			System.out.println();
		}
	}

	public void traverse3DintArrayUsingdowhileLoop(int[][][] arr) {
		int n = arr.length;
		int i = 0;
		do {
			int j = 0;
			do {
				int k = 0;
				do {
					System.out.print(arr[i][j][k] + " ");
					k++;
				} while (k < arr[i][j].length);
				j++;
				System.out.println();
			} while (j < arr[i].length);
			i++;
			System.out.println();
		} while (i < n);
	}

}
