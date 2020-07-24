package eg00026;

public class AddDigitsUsingRecursionDemo {

	public static void main(String[] args) {
		AddDigitsUsingRecursionDemo obj = new AddDigitsUsingRecursionDemo();
		int n = 123;
		int result = obj.add(n);
		System.out.println(result);
	}

	public int add(int n) {
		int sum = n % 10;
		if (n == 0) {
			return 0;
		}
		return sum + add(n / 10);
	}

}
