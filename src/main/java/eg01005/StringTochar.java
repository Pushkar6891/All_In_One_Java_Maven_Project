package eg01005;

public class StringTochar {

	public static void main(String[] args) {

		StringTochar obj = new StringTochar();
		obj.convertStringTochar();
	}

	// 1. Using char ch = str.charAt(i)
	public void convertStringTochar() {
		String str = "hello";
		char ch = str.charAt(0);
		System.out.println(ch);
	}

}
