package eg01025;

public class StringToStringBuilder {

	public static void main(String[] args) {

		StringToStringBuilder obj = new StringToStringBuilder();
		obj.convertStringToStringBufferUsingnewStringBuffer();

	}

	// 1. Using StringBuilder sb = new StringBuilder(str);
	public void convertStringToStringBufferUsingnewStringBuffer() {

		String str = "I am Pushkar I am brown";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		System.out.println(sb instanceof StringBuilder);

	}

}
