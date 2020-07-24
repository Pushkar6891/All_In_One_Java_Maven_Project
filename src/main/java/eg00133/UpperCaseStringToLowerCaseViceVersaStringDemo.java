package eg00133;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UpperCaseStringToLowerCaseViceVersaStringDemo {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();
		list.add("Apple");
		list.add("Orange");
		list.add("Mango");
		list.add("Cherry");

		System.out.println(list);

		Function<String, String> function1 = s -> s.toUpperCase();
		Function<String, String> function2 = s -> s.toLowerCase();
		List<String> list2 = list.stream().map(function1).collect(Collectors.toList());
		System.out.println(list2);
		List<String> list3 = list.stream().map(function2).collect(Collectors.toList());
		System.out.println(list3);
		long count = list.stream().map(function2).count();
		System.out.println(count);
		List<String> list4 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list4);
		Comparator<String> comp = (i1, i2) -> i1.compareTo(i2);
		List<String> list5 = list.stream().sorted(comp).collect(Collectors.toList());
		System.out.println(list5);
		List<String> list6 = list.stream().sorted(comp.reversed()).collect(Collectors.toList());
		System.out.println(list6);
		String max = list.stream().max(comp).get();
		System.out.println(max);
		String min = list.stream().min(comp).get();
		System.out.println(min);
		list.stream().forEach(i->System.out.print(i + " "));
	}

}
