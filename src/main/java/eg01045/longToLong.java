package eg01045;

public class longToLong {

	public static void main(String[] args) {

		longToLong obj = new longToLong();
		obj.convertlongToLongUsingnewLong();
		obj.convertlongToLongUsingLongvalueOf();
		obj.convertlongToLongUsingStringvalueOfAndnewLong();
	}

	// 1. Using Integer intVal = new Integer(i);
	public void convertlongToLongUsingnewLong() {
		long l = 982639646L;
		Long longVal = new Long(l);
		System.out.println(longVal);
		System.out.println(longVal instanceof Long);
	}

	// 2. Using Integer intVal = Integer.valueOf(i);
	public void convertlongToLongUsingLongvalueOf() {
		long l = 982639646L;
		Long longVal = Long.valueOf(l);
		System.out.println(longVal);
		System.out.println(longVal instanceof Long);
	}

	// 3. Using
	public void convertlongToLongUsingStringvalueOfAndnewLong() {
		long l = 982639646L;
		String strVal = String.valueOf(l);
		Long longVal = new Long(strVal);
		System.out.println(longVal);
		System.out.println(longVal instanceof Long);
	}
}
