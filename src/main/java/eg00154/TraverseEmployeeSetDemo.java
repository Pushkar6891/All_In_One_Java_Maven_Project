package eg00154;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import eg00152.Employee;

public class TraverseEmployeeSetDemo {

	public static void main(String[] args) {

		TraverseEmployeeSetDemo obj = new TraverseEmployeeSetDemo();
		Set<Employee> set = new HashSet<>();
		Employee employee1 = new Employee(109, "Pushkar", 1000, false);
		Employee employee2 = new Employee(102, "Amit", 2000, true);
		Employee employee3 = new Employee(103, "Ram", 7000, true);
		Employee employee4 = new Employee(101, "Lucky", 4000, true);
		Employee employee5 = new Employee(105, "Vikram", 6000, false);
		Employee employee6 = new Employee(109, "Pushkar", 1000, false);
		Employee employee7 = new Employee(102, "Amit", 2000, true);
		Employee employee8 = new Employee(103, "Ram", 7000, true);
		Employee employee9 = new Employee(101, "Lucky", 4000, true);
		Employee employee10 = new Employee(105, "Vikram", 6000, false);
		set.add(employee1);
		set.add(employee2);
		set.add(employee3);
		set.add(employee4);
		set.add(employee5);
		set.add(employee6);
		set.add(employee7);
		set.add(employee8);
		set.add(employee9);
		set.add(employee10);
		System.out.println("Size : " + set.size());
		System.out.println("\n1. Using enhanced for Loop");
		obj.traverseEmployeeSetUsingenhancedforLoop(set);
		System.out.println("\n2. Using Iterator");
		obj.traverseEmployeeSetUsingIterator(set);
		System.out.println("\n3. Using Java 8 Iterable.forEach() 1 Way");
		obj.traverseEmployeeMapUsingJava8StackInheritForEachFromIterableInterface(set);
		System.out.println("\n4. Using Java 8 Iterable.forEach() 2 Way");
		obj.traverseEmployeeSetUsingJava8StreamSecondWay(set);
		System.out.println("\n5. Using Java 8 Stream.forEach()");
		obj.traverseEmployeeSetUsingJava8StreamforEach(set);
		
	}

	public void traverseEmployeeSetUsingenhancedforLoop(Set<Employee> set) {
		for (Employee value : set)
			System.out.print(value + " ");

	}

	public void traverseEmployeeSetUsingIterator(Set<Employee> set) {
		Iterator<Employee> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

	public void traverseEmployeeMapUsingJava8StackInheritForEachFromIterableInterface(Set<Employee> set) {
		set.forEach(e -> System.out.print(e + " "));
	}

	public void traverseEmployeeSetUsingJava8StreamSecondWay(Set<Employee> set) {
		set.forEach(System.out::print);
	}

	public void traverseEmployeeSetUsingJava8StreamforEach(Set<Employee> set) {
		set.stream().forEach(e -> System.out.print(e + " "));
	}
}
