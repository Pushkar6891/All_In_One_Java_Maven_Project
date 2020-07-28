package eg01034;

public class intTochar {

	public static void main(String[] args) {

		intTochar obj = new intTochar();
		obj.convertintTocharUsingDirectAssigment();
	}

	// 1. Using char ch = (char)i;
	public void convertintTocharUsingDirectAssigment() {
		int i = 97;
		char ch = (char) i;
		System.out.println(ch);
	}

}
