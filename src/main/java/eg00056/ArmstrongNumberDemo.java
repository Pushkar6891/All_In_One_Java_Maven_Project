package eg00056;

public class ArmstrongNumberDemo {

	public static void main(String[] args) {

		ArmstrongNumberDemo obj = new ArmstrongNumberDemo();
		for (int i = 1; i < 1000000; i++) {
			boolean result = obj.isArmstrongNumber(i);
			if (result) {
				System.out.println(i);
			}
		}
	}

	public boolean isArmstrongNumber(int n) {
		int temp = n;
		int r = 0;
		int s = 0;
		while (n > 0) {
			r = n % 10;
			s = s + r * r * r;
			n = n / 10;

		}
		if (s == temp) {
			return true;
		}

		return false;
	}

}
