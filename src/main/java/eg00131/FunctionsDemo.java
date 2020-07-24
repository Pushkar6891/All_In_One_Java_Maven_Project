package eg00131;

import java.util.function.Function;

public class FunctionsDemo {

	public static void main(String[] args) {

		Function<String, Integer> function1 = s -> s.length();
		System.out.println(function1.apply("Pushkar"));
		Function<String, String> function2 = s -> s.toUpperCase();
		System.out.println(function2.apply("Pushkar"));
	}

}
