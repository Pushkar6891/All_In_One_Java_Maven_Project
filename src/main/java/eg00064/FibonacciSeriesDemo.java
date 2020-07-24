package eg00064;

public class FibonacciSeriesDemo {

	public static void main(String[] args) {

		FibonacciSeriesDemo obj = new FibonacciSeriesDemo();
		int n = 10;
		obj.printFibonacciSeries(n);
	}

	public void printFibonacciSeries(int n) {
		int a = 0;
		int b = 1;
		if (n == 1) {
			System.out.print(a + " ");
		} else if (n == 2) {
			System.out.print(a + " " + b + " ");
		} else {
			System.out.print(a + " " + b + " ");
			for (int i = 0; i < n - 2; i++) {
				int c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;
			}
		}

	}

}
