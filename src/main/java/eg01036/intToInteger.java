package eg01036;

public class intToInteger {

	public static void main(String[] args) {

		intToInteger obj = new intToInteger();
		obj.convertintToIntegerUsingnewInteger();
		obj.convertintToIntegerUsingIntegervalueOf();
		obj.convertintToIntegerUsingStringvalueOfAndnewInteger();
	}

	// 1. Using Integer intVal = new Integer(i);
	public void convertintToIntegerUsingnewInteger() {
		int i = 1234567890;
		Integer intVal = new Integer(i);
		System.out.println(intVal);
	//	System.out.println(intVal instanceof Integer);
	}
	
	// 2. Using Integer intVal = Integer.valueOf(i);
	public void convertintToIntegerUsingIntegervalueOf() {
		int i = 1234567890;
		Integer intVal = Integer.valueOf(i);
		System.out.println(intVal);
	//	System.out.println(intVal instanceof Integer);
	}
	
	// 3. Using
	public void convertintToIntegerUsingStringvalueOfAndnewInteger() {
		int i = 1234567890;
		String strVal = String.valueOf(i);
		Integer intVal = new Integer(strVal);
		System.out.println(intVal);
	//	System.out.println(intVal instanceof Integer);
	}
}
