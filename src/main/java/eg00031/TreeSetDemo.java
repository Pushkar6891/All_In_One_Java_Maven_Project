package eg00031;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSetDemo obj = new TreeSetDemo();
		obj.displaySet();
	}

	public void displaySet() {
		Set<Employee> empSet = new TreeSet<>();
		empSet.add(new Employee(101, "Pushkar"));
		empSet.add(new Employee(101, "Pushkar"));
		empSet.forEach(System.out::println);
	}

}
