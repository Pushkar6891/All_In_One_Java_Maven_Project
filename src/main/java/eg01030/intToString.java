package eg01030;

public class intToString {

	public static void main(String[] args) {

		intToString obj = new intToString();
		obj.convertintToStringUsingStringvalueOf();
		obj.convertintToStringUsingIntegertoString();
		obj.convertintToStringUsingStringformat();
	}

	// 1. Using String str = String.valueOf(i);
	public void convertintToStringUsingStringvalueOf() {
		int i = 200;
		String str = String.valueOf(i);
		System.out.println(str);
	}

	// 2. Using int i = String.valueOf(String)
	public void convertintToStringUsingIntegertoString() {
		int i = 200;
		String str = Integer.toString(i);
		System.out.println(str);
	}

	// 2. Using int i = String.valueOf(String)
	public void convertintToStringUsingStringformat() {
		int i = 200;
		String str = String.format("%d", i);
		System.out.println(str);
	}

}
