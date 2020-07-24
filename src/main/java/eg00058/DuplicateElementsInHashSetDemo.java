package eg00058;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInHashSetDemo {

	public static void main(String[] args) {

		DuplicateElementsInHashSetDemo obj = new DuplicateElementsInHashSetDemo();
		obj.displayHashSet();
	}

	public void displayHashSet() {
		Set<Employee> empSet = new HashSet<>();
		empSet.add(new Employee(101, "Pushkar"));
		empSet.add(new Employee(101, "Pushkar"));
		empSet.add(new Employee(102, "Amit"));
		System.out.println(empSet.size());
	}

}
