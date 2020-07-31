package eg00912;

public class FibonacciSeriesDemo {

	public static void main(String[] args) {

		FibonacciSeriesDemo obj = new FibonacciSeriesDemo();
		int result = 0;
		for (int i = 0; i < 10; i++) {
			result = obj.fibonacci(i);
			System.out.print(result + " ");
		}
		
	}

	public int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
