package eg00153;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import eg00152.Employee;

public class TraverseEmployeeListDemo {

	public static void main(String[] args) {

		TraverseEmployeeListDemo obj = new TraverseEmployeeListDemo();
		List<Employee> list = new ArrayList<>();
		Employee employee1 = new Employee(109, "Pushkar", 1000, false);
		Employee employee2 = new Employee(102, "Amit", 2000, true);
		Employee employee3 = new Employee(103, "Ram", 7000, true);
		Employee employee4 = new Employee(101, "Lucky", 4000, true);
		Employee employee5 = new Employee(105, "Vikram", 6000, false);
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		System.out.println("Size : " + list.size());
		System.out.println("1. Using for Loop");
		obj.traverseEmployeeListUsingforLoop(list);
		System.out.println("\n2. Using while Loop");
		obj.traverseEmployeeListUsingwhileLoop(list);
		System.out.println("\n3. Using do while Loop");
		obj.traverseEmployeeListUsingdowhileLoop(list);
		System.out.println("\n4. Using enhanced for Loop");
		obj.traverseEmployeeListUsingenhancedforLoop(list);
		System.out.println("\n5. Using Iterator");
		obj.traverseEmployeeListUsingIterator(list);
		System.out.println("\n6. Using List Iterator");
		obj.traverseEmployeeListUsingListIterator(list);
		System.out.println("\n7. Using Java 8 Iterable.forEach() 1 Way");
		obj.traverseEmployeeListUsingJava8StackInheritForEachFromIterableInterface(list);
		System.out.println("\n8. Using Java 8 Iterable.forEach() 2 Way");
		obj.traverseEmployeeListUsingJava8StreamSecondWay(list);
		System.out.println("\n9. Using Java 8 Stream.forEach()");
		obj.traverseEmployeeListUsingJava8StreamforEach(list);
	}

	public void traverseEmployeeListUsingforLoop(List<Employee> list) {
		int n = list.size();
		for (int i = 0; i < n; i++) {
			System.out.print(list.get(i) + " ");
		}
	}

	public void traverseEmployeeListUsingwhileLoop(List<Employee> list) {
		int n = list.size();
		int i = 0;
		while (i < n) {
			System.out.print(list.get(i) + " ");
			i++;
		}
	}

	public void traverseEmployeeListUsingdowhileLoop(List<Employee> list) {
		int n = list.size();
		int i = 0;
		do {
			System.out.print(list.get(i) + " ");
			i++;
		} while (i < n);
	}

	public void traverseEmployeeListUsingenhancedforLoop(List<Employee> list) {
		for (Employee value : list)
			System.out.print(value + " ");

	}

	public void traverseEmployeeListUsingIterator(List<Employee> list) {
		Iterator<Employee> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

	public void traverseEmployeeListUsingListIterator(List<Employee> list) {
		ListIterator<Employee> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
	}

	public void traverseEmployeeListUsingJava8StackInheritForEachFromIterableInterface(List<Employee> list) {
		list.forEach(e -> System.out.print(e + " "));
	}

	public void traverseEmployeeListUsingJava8StreamSecondWay(List<Employee> list) {
		list.forEach(System.out::print);
	}

	public void traverseEmployeeListUsingJava8StreamforEach(List<Employee> list) {
		list.stream().forEach(e -> System.out.print(e + " "));
	}
}
