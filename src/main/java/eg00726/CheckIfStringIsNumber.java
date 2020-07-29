package eg00726;

public class CheckIfStringIsNumber {
	public static void main(String[] args) {
		String[] strArr = { "+100", "-100", "3.1416", "-1E-16", "1.2.3", "+-5", "12e+5.4" };
		CheckIfStringIsNumber obj = new CheckIfStringIsNumber();

		// String Array length
		int n = strArr.length;

		for (int i = 0; i < n; i++) {
			System.out.print(obj.isNum(strArr[i]) + " ");
		}

	}

	// check if input str is numeric by converting to Double
	public boolean isNum(String str) {
		boolean isNum = true;
		try {
			Double num = Double.parseDouble(str);
		} catch (Exception e) {
			isNum = false;
		}

		return isNum;
	}

}