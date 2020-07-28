package eg01001;

public class StringToint {

	public static void main(String[] args) {

		StringToint obj = new StringToint();
		obj.convertStringTointUsingIntegerparseInt();
		obj.convertStringTointUsingIntegervalueOf();
	}

	// 1. Using int i = Integer.parseInt(String)
	public void convertStringTointUsingIntegerparseInt() {
		String str = "200";
		int i = Integer.parseInt(str);
		System.out.println(i);
	}

	// 2. Using int i = Integer.valueOf(String)
	public void convertStringTointUsingIntegervalueOf() {
		String str = "200";
		int i = Integer.valueOf(str);
		System.out.println(i);
	}

}
