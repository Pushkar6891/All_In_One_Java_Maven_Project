package eg00919;

public class CalculatePowerOfANumberDemo {

	public static void main(String[] args) {

		CalculatePowerOfANumberDemo obj = new CalculatePowerOfANumberDemo();
		int base = 2;
		int exponent = 5;
		int result = obj.calculatePower(base, exponent);
		System.out.println(result);
		result = obj.power(base, exponent);
		System.out.println(result);
	}

	public int calculatePower(int base, int exponent) {
		int power = 1;
		for (int i = 0; i < exponent; i++) {
			power = power * base;
		}
		return power;
	}

	public int power(int base, int exponent) {
		return (int) Math.pow(new Double(base), new Double(exponent));
	}

}
