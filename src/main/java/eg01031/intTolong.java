package eg01031;

public class intTolong {

	public static void main(String[] args) {

		intTolong obj = new intTolong();
		obj.convertintTolongUsingDirectAssigment();
	}

	// 1. Using long l = i;
	public void convertintTolongUsingDirectAssigment() {
		int i = 200;
		long l = i;
		System.out.println(l);
	}

}
