package eg01007;

public class StringToboolean {

	public static void main(String[] args) throws ClassNotFoundException {

		StringToboolean obj = new StringToboolean();
		obj.convertStringTobooleanUsingBooleanparseBoolean();
		obj.convertStringTobooleanUsingBooleanvalueOf();
	}

	// 1. Using boolean b = Boolean.parseBoolean(String)
	public void convertStringTobooleanUsingBooleanparseBoolean() {
		String str = "True";
		boolean b = Boolean.parseBoolean(str);
		System.out.println(b);
	}

	// 2. Using boolean b = Boolean.valueOf(String)
	public void convertStringTobooleanUsingBooleanvalueOf() {
		String str = "True";
		boolean b = Boolean.valueOf(str);
		System.out.println(b);
	}
}
