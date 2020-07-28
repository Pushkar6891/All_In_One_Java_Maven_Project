package eg01027;

public class StringArrayToStringBuilder {

	public static void main(String[] args) {

		StringArrayToStringBuilder obj = new StringArrayToStringBuilder();
		obj.convertStringArrayToStringBuilderUsingnewStringBuilder();

	}

	// 1. Using StringBuilder sb = new StringBuilder(str);
	public void convertStringArrayToStringBuilderUsingnewStringBuilder() {

		String[] strArr = { "Asia", "Africa", "Europe", "Australia"};
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strArr.length; i++) {
			sb.append(strArr[i] + " ");
		}
		System.out.println(sb.toString());
		System.out.println(sb instanceof StringBuilder);

	}

}
