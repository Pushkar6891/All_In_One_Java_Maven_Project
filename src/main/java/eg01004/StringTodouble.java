package eg01004;

public class StringTodouble {

	public static void main(String[] args) {

		StringTodouble obj = new StringTodouble();
		obj.convertStringTodoubleUsingDoubleparseDouble();
		obj.convertStringTodoubleUsingDoublevalueOf();
	}

	// 1. Using double d = Double.parseDouble(String)
	public void convertStringTodoubleUsingDoubleparseDouble() {
		String str = "3141592653589793238";
		double d = Double.parseDouble(str);
		System.out.println(d);
	}

	// 2. Using double d = Double.valueOf(String)
	public void convertStringTodoubleUsingDoublevalueOf() {
		String str = "3141592653589793238";
		double d = Double.valueOf(str);
		System.out.println(d);
	}
}
