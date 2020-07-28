package eg01039;

public class intToDouble {

	public static void main(String[] args) {

		intToDouble obj = new intToDouble();
		obj.convertintToDoubleUsingnewDouble();
		obj.convertintToDoubleUsingDoublevalueOf();
		obj.convertintToDoubleUsingStringvalueOfAndnewDouble();
	}

	// 1. Using Long longVal = new Long(i);
	public void convertintToDoubleUsingnewDouble() {
		int i = 1234567890;
		Double doubleval = new Double(i);
		System.out.println(doubleval);
	//	System.out.println(doubleval instanceof Double);
	}

	// 2. Using Long longVal = Long.valueOf(i);
	public void convertintToDoubleUsingDoublevalueOf() {
		int i = 1234567890;
		Double doubleval = Double.valueOf(i);
		System.out.println(doubleval);
	//	System.out.println(doubleval instanceof Double);
	}

	// 3. Using
	public void convertintToDoubleUsingStringvalueOfAndnewDouble() {
		int i = 1234567890;
		String strVal = String.valueOf(i);
		Double doubleval = new Double(strVal);
		System.out.println(doubleval);
	//	System.out.println(doubleval instanceof Double);
	}
}
