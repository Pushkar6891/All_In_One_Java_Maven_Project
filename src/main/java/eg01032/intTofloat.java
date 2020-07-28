package eg01032;

public class intTofloat {

	public static void main(String[] args) {

		intTofloat obj = new intTofloat();
		obj.convertintTofloatUsingDirectAssigment();
	}

	// 1. Using float f = i;
	public void convertintTofloatUsingDirectAssigment() {
		int i = 200;
		float f = i;
		System.out.println(f);
	}

}
