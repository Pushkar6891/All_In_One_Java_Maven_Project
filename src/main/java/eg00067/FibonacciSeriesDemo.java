package eg00067;

public class FibonacciSeriesDemo {

	public static void main(String[] args) {

		FibonacciSeriesDemo obj = new FibonacciSeriesDemo();
		int n = 10;
		int requiredTermCount = 4;
		obj.printFibonacciSeries(n, requiredTermCount);
	}

	public void printFibonacciSeries(int n, int requiredTermCount) {
		int a = 0;
		int b = 1;
		int count = 0;
		if (requiredTermCount == 1) {
			System.out.print(a + " ");
		} else if (requiredTermCount == 2) {
			System.out.print(b + " ");
		} else {
			count = count + 2;
			for (int i = 0; i < n - 2; i++) {
				int c = a + b;
				count = count + 1;
				if (count == requiredTermCount) {
					System.out.print(c + " ");
				}
				a = b;
				b = c;
				
			}
		}

	}

}
