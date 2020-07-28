package eg01024;

import java.text.ParseException;

public class StringToStringBuffer {

	public static void main(String[] args) throws ParseException {

		StringToStringBuffer obj = new StringToStringBuffer();
		obj.convertStringToStringBufferUsingnewStringBuffer();

	}

	// 1. Using StringBuffer sb = new StringBuffer(str);
	public void convertStringToStringBufferUsingnewStringBuffer() {

		String str = "I am Pushkar I am brown";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb);
	//	System.out.println(sb instanceof StringBuffer);

	}

}
