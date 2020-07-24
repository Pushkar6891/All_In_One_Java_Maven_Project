package eg00129;

import java.util.function.Predicate;

//Predicate is a boolean function which returns true or false
public class GreaterThan20Demo {

	public static void main(String[] args) {

		Predicate<Integer> predicate = i -> (i > 20);
		System.out.println(predicate.test(10));
		System.out.println(predicate.test(20));
		System.out.println(predicate.test(30));
	}
}
