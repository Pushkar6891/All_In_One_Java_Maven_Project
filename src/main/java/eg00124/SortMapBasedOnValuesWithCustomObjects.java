package eg00124;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;

public class SortMapBasedOnValuesWithCustomObjects {

	public static void main(String[] args) {


		Map<Integer, Employee> map = new HashMap<>();
		map.put(110, new Employee(110, "Vikas", 10000.0, "Sales"));
		map.put(101, new Employee(101, "Pushkar", 12000.0, "Sales"));
		map.put(109, new Employee(109, "Vishal", 13000.0, "IT"));
		map.put(103, new Employee(103, "Chinmay", 11000.0, "IT"));
		map.put(100, new Employee(100, "Pooja", 19000.0, "HR"));
		map.put(111, new Employee(111, "Vikram", 18000.0, "Marketing"));

		System.out.println("Unsorted Map");
		map.forEach((k, v) -> System.out.println(k + " " + v));

		Set<Entry<Integer, Employee>> entrySet = map.entrySet();
		List<Entry<Integer, Employee>> list = new ArrayList<>(entrySet);
		System.out.println("Unorted List");
		list.forEach(e -> {
			System.out.println(e.getKey() + " " + e.getValue());
		});
		
		Collections.sort(list, (e1, e2) -> e1.getValue().getName().compareTo(e2.getValue().getName()));

		System.out.println("Sorted List");
		list.forEach(e -> {
			System.out.println(e.getKey() + " " + e.getValue());
		});
	}

}
