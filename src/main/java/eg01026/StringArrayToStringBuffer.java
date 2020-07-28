package eg01026;

public class StringArrayToStringBuffer {

	public static void main(String[] args) {

		StringArrayToStringBuffer obj = new StringArrayToStringBuffer();
		obj.convertStringArrayToStringBufferUsingnewStringBuffer();

	}

	// 1. Using StringBuffer sb = new StringBuffer();
	public void convertStringArrayToStringBufferUsingnewStringBuffer() {

		String[] strArr = { "Asia", "Africa", "Europe", "Australia" };
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strArr.length; i++) {
			sb.append(strArr[i] + " ");
		}
		System.out.println(sb.toString());
		System.out.println(sb instanceof StringBuffer);

	}

}
