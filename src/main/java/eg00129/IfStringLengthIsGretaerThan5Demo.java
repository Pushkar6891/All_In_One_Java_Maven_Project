package eg00129;

import java.util.function.Predicate;

//Predicate is a boolean function which returns true or false
public class IfStringLengthIsGretaerThan5Demo {

	public static void main(String[] args) {

		Predicate<String> predicate = s -> (s.length() > 5);
		System.out.println(predicate.test("abc"));
		System.out.println(predicate.test("pushkar"));
		System.out.println(predicate.test("xyz"));
	}
}
