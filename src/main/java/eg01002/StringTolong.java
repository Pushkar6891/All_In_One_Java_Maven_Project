package eg01002;

public class StringTolong {

	public static void main(String[] args) {

		StringTolong obj = new StringTolong();
		obj.convertStringTolongUsingLongparseLong();
		obj.convertStringTolongUsingLongvalueOf();
	}

	// 1. Using long l = Long.parseLong(String)
	public void convertStringTolongUsingLongparseLong() {
		String str = "1234567890123456789";
		Long l = Long.parseLong(str);
		System.out.println(l);
	}

	// 2. Using long l = Long.valueOf(String)
	public void convertStringTolongUsingLongvalueOf() {
		String str = "1234567890123456789";
		Long l = Long.valueOf(str);
		System.out.println(l);
	}

}
