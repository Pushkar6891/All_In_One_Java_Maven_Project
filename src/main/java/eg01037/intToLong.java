package eg01037;

public class intToLong {

	public static void main(String[] args) {

		intToLong obj = new intToLong();
		obj.convertintToLongUsingnewLong();
		obj.convertintToIntegerUsingLongvalueOf();
		obj.convertintToIntegerUsingStringvalueOfAndnewLong();
	}

	// 1. Using Long longVal = new Long(i);
	public void convertintToLongUsingnewLong() {
		int i = 1234567890;
		Long longVal = new Long(i);
		System.out.println(longVal);
	//	System.out.println(longVal instanceof Long);
	}

	// 2. Using Long longVal = Long.valueOf(i);
	public void convertintToIntegerUsingLongvalueOf() {
		int i = 1234567890;
		Long longVal = Long.valueOf(i);
		System.out.println(longVal);
	//	System.out.println(longVal instanceof Long);
	}

	// 3. Using
	public void convertintToIntegerUsingStringvalueOfAndnewLong() {
		int i = 1234567890;
		String strVal = String.valueOf(i);
		Long longVal = new Long(strVal);
		System.out.println(longVal);
	//	System.out.println(longVal instanceof Long);
	}
}
