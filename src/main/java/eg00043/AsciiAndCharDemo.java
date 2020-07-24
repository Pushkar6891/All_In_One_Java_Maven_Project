package eg00043;

public class AsciiAndCharDemo {

	public static void main(String[] args) {

		System.out.println("Upper Case");
		for (int i = 65; i <= 90; i++) {
			System.out.println("Char : " + (char) i + " Ascii : " + i);
		}
		
		System.out.println();
		System.out.println("Lower Case");
		for (int i = 97; i <= 122; i++) {
			System.out.println("Char : " + (char) i + " Ascii : " + i);
		}
		
		System.out.println();
	}
}
