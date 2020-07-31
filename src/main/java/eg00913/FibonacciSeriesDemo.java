package eg00913;

public class FibonacciSeriesDemo {

	public static void main(String[] args) {

		FibonacciSeriesDemo obj = new FibonacciSeriesDemo();
		int n = 10;
		int result = obj.fibonacci(n);
		System.out.println(result);
	}

	public int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
