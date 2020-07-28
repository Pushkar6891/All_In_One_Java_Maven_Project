package eg01038;

public class intToFloat {

	public static void main(String[] args) {

		intToFloat obj = new intToFloat();
		obj.convertintToFloatUsingnewFloat();
		obj.convertintToFloatUsingFloatvalueOf();
		obj.convertintToFloatUsingStringvalueOfAndnewFloat();
	}

	// 1. Using Long longVal = new Long(i);
	public void convertintToFloatUsingnewFloat() {
		int i = 1234567890;
		Float floatVal = new Float(i);
		System.out.println(floatVal);
	//	System.out.println(floatVal instanceof Float);
	}

	// 2. Using Long longVal = Long.valueOf(i);
	public void convertintToFloatUsingFloatvalueOf() {
		int i = 1234567890;
		Float floatVal = Float.valueOf(i);
		System.out.println(floatVal);
	//	System.out.println(floatVal instanceof Float);
	}

	// 3. Using
	public void convertintToFloatUsingStringvalueOfAndnewFloat() {
		int i = 1234567890;
		String strVal = String.valueOf(i);
		Float floatVal = new Float(strVal);
		System.out.println(floatVal);
	//	System.out.println(floatVal instanceof Float);
	}
}
