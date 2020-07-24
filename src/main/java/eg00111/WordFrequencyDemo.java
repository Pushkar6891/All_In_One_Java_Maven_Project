package eg00111;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyDemo {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Apple", "Mango", "Cherry", "Guava", "Orange", "Apple", "Banana", "Mango",
				"Apple", "Guava");

		Map<String, List<String>> collect = fruits.stream().sorted().collect(Collectors.groupingBy(e -> e));
		System.out.println(collect);
	}

}
