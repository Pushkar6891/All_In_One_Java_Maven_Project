package eg01003;

public class StringTofloat {

	public static void main(String[] args) {

		StringTofloat obj = new StringTofloat();
		obj.convertStringTofloatUsingFloatparseFloat();
		obj.convertStringTofloatUsingFloatvalueOf();
	}

	// 1. Using float f = Float.parseFloat(String)
	public void convertStringTofloatUsingFloatparseFloat() {
		String str = "3141592653589793238";
		float f = Float.parseFloat(str);
		System.out.println(f);
	}

	// 2. Using float f = Float.valueOf(String)
	public void convertStringTofloatUsingFloatvalueOf() {
		String str = "3141592653589793238";
		Float f = Float.valueOf(str);
		System.out.println(f);
	}
}
