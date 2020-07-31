package eg00916;

// Happy Number : sum of square of digits is 1
// 19 -> 1^2 + 9^2 -> 1 + 81 = 82 -> 8^2 + 2^2 -> 64 + 4 = 68 -> 6^2 + 8^2 = 36 + 64 = 100 -> 1^2 + 0^2 + 0^2 = 1 (Happy Number) 
// 25 -> 29 -> 85 -> 89 -> 145 -> 42 -> 20 -> 4 -> 16 -> 37 -> 58 -> 89
//					  |-----------------------------------------------|

public class IsHappyNumber {

	public static void main(String[] args) {

		IsHappyNumber obj = new IsHappyNumber();

		Integer n1 = 19;
		boolean isHappyNumber1 = obj.ifHappyNumber(n1);
		System.out.println("Is " + n1 + " a Happy Number : ");
		System.out.println(isHappyNumber1);

		Integer n2 = 25;
		boolean ifHappyNumber2 = obj.ifHappyNumber(n2);
		System.out.println("Is " + n2 + " a Happy Number : ");
		System.out.println(ifHappyNumber2);
	}

	public boolean ifHappyNumber(int val) {
		int first, second;
		first = second = val;

		do {
			first = getNextValue(first);
			second = getNextValue(getNextValue(second));
		} while (first != second);

		return first == 1;
	}

	public int getNextValue(int val) {
		int square = 0;

		while (val > 0) {
			int t = val % 10;
			square = square + t * t;
			val = val / 10;
		}

		return square;
	}

}
