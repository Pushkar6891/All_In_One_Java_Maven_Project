package eg01043;

public class longToString {

	public static void main(String[] args) {

		longToString obj = new longToString();
		obj.convertlongToStringUsingStringvalueOf();
		obj.convertlongToStringUsingLongtoString();
		obj.convertlongToStringUsingStringformat();
	}

	// 1. Using String str = String.valueOf(l);
	public void convertlongToStringUsingStringvalueOf() {
		long l = 9826396465L;
		String str = String.valueOf(l);
		System.out.println(str);
		System.out.println(str instanceof String);
	}

	// 2. Using int i = String.valueOf(String)
	public void convertlongToStringUsingLongtoString() {
		long l = 9826396465L;
		String str = Long.toString(l);
		System.out.println(str);
		System.out.println(str instanceof String);
	}

	// 2. Using int i = String.valueOf(String)
	public void convertlongToStringUsingStringformat() {
		long l = 9826396465L;
		String str = String.format("%d", l);
		System.out.println(str);
		System.out.println(str instanceof String);
	}

}