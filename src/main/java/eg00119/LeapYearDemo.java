package eg00119;

public class LeapYearDemo {

	public static void main(String[] args) {

		LeapYearDemo obj = new LeapYearDemo();
		int[] years = { 2000, 2001, 2004, 2006, 2008, 2010, 2100, 2222, 2203, 2030 };
		for (int i = 0; i < years.length; i++) {
			boolean result = obj.isLeapYear(years[i]);
			System.out.println(years[i] + " " + result);
		}
	}

	public boolean isLeapYear(int year) {
		boolean isLeapYear = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = true;
				} else {
					isLeapYear = false;
				}
			} else {
				isLeapYear = true;
			}
		} else {
			isLeapYear = false;
		}

		return isLeapYear;
	}

}
