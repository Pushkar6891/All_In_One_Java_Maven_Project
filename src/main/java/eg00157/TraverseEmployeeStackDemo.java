package eg00157;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.Stream;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;

import eg00152.Employee;

public class TraverseEmployeeStackDemo {

	public static void main(String[] args) {

		TraverseEmployeeStackDemo obj = new TraverseEmployeeStackDemo();
		Stack<Employee> stack = new Stack<>();
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
		stack.push(employee1);
		stack.push(employee2);
		stack.push(employee3);
		stack.push(employee4);
		stack.push(employee5);
		stack.push(employee6);
		stack.push(employee7);
		stack.push(employee8);
		stack.push(employee9);
		stack.push(employee10);
		System.out.println("Size : " + stack.size());

		System.out.println("\n1. Using Iterator");
		obj.traverseEmployeeStackUsingIterator(stack);
		System.out.println("\n2. Using enhanced for loop (uses Iterator internally)");
		obj.traverseEmployeeStackUsingenhancedForLoop(stack);
		System.out.println("\n3. Using Java 8 Stream and Lambda Expression");
		obj.traverseEmployeeStackUsingJava8StreamAndLambdaExpression(stack);
		System.out.println("\n4. Using Java 8 Stream and Method Reference");
		obj.traverseEmployeeStackUsingJava8StreamandMethodReference(stack);
		System.out.println("\n5. Using Java 8 Stream.of() + toArray() + forEach()");
		obj.traverseEmployeeStackUsingJava8StreamAndtoarrayAndforEach(stack);
		System.out.println("\n6. Using Java 8 stack inherit forEach() from Iterable Interface");
		obj.traverseEmployeeStackUsingJava8StackInheritForEachFromIterableInterface(stack);
		System.out.println("\n7. Using Java 8 stack inherit iterator() from Collection Interface");
		obj.traverseEmployeeStackUsingiteratormethodFromCollectionInterfaceAndforEachRemaining(stack);
		System.out.println("\n8. Using Vector And Enumeration");
		obj.traverseEmployeeStackUsingVectorAndEnumeration(stack);
		System.out.println("\n9. Using Collections.enumeration()");
		obj.traverseEmployeeStackUsingCollectionsAndEnumeration(stack);
		System.out.println("\n10. Using Convert Stack to String using toString()");
		obj.traverseEmployeeStackUsingtoString(stack);
		System.out.println("\n11. Using Convert Stack to String using Stream.of()");
		obj.traverseEmployeeStackUsingStreamof(stack);
		System.out.println("\n12. Using Convert Stack to Array using to Array(Integer[])");
		obj.traverseEmployeeStackUsingtoNewArrayByAllocatingMemory(stack);
		System.out.println("\n13. Using Convert Stack to Array without allocating Memory");
		obj.traverseEmployeeStackUsingtoNewArrayJVMWillAllocateMemory(stack);
		System.out.println("\n14. Using Convert Stack to Array that returns an Object[] array");
		obj.traverseEmployeeStackUsingstacktoArray(stack);
		System.out.println("\n15. Using Java 8 Streams, toArray and Lambda Expression");
		obj.traverseEmployeeStackUsingJava8StreamAndtoArrayAndLambdaExpression(stack);
		System.out.println("\n16. Using Java 8 Streams, toArray and Method Reference");
		obj.traverseEmployeeStackUsingJava8StreamAndtoArrayAndMethodReference(stack);
		System.out.println("\n17. Using FluentIterable class from Guava Library");
		obj.traverseEmployeeStackUsingFluentIterableClassFromGuavaLibrary(stack);
		System.out.println("\n18. Using Iterable class from Guava Libarary");
		obj.traverseEmployeeStackUsingIterablesClassFromGuavaLibrary(stack);

	}

	// 1. Using Iterator
	public void traverseEmployeeStackUsingIterator(Stack<Employee> stack) {
		Iterator<Employee> iterator = stack.iterator();
		while (iterator.hasNext()) {
			Employee next = iterator.next();
			System.out.print(next + " ");
		}
	}

	// 2. Using enhanced for loop (uses Iterator internally)
	public void traverseEmployeeStackUsingenhancedForLoop(Stack<Employee> stack) {
		for (Employee value : stack) {
			System.out.print(value + " ");
		}
	}

	// 3. Using Java 8 Stream and Lambda Expression
	public void traverseEmployeeStackUsingJava8StreamAndLambdaExpression(Stack<Employee> stack) {
		stack.stream().forEach(e -> System.out.print(e));
	}

	// 4. Using Java 8 Stream and Method Reference
	public void traverseEmployeeStackUsingJava8StreamandMethodReference(Stack<Employee> stack) {
		stack.stream().forEach(System.out::print);
	}

	// 5. Using Java 8 Stream.of() + toArray() + forEach()
	public void traverseEmployeeStackUsingJava8StreamAndtoarrayAndforEach(Stack<Employee> stack) {
		Stream.of(stack.toArray()).forEach(System.out::print);
	}

	// 6. Using Java 8 stack inherit forEach() from Iterable Interface
	public void traverseEmployeeStackUsingJava8StackInheritForEachFromIterableInterface(Stack<Employee> stack) {
		stack.forEach(System.out::print);
	}

	// 7. Using Java 8 stack inherit iterator() from Collection Interface
	public void traverseEmployeeStackUsingiteratormethodFromCollectionInterfaceAndforEachRemaining(
			Stack<Employee> stack) {
		stack.iterator().forEachRemaining(System.out::print);
	}

	// 8. Using Vector And Enumeration
	public void traverseEmployeeStackUsingVectorAndEnumeration(Stack<Employee> stack) {
		@Deprecated
		Enumeration<Employee> enumeration = new Vector<Employee>(stack).elements();
		while (enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement() + " ");
		}
	}

	// 9. Using Collections.enumeration()
	public void traverseEmployeeStackUsingCollectionsAndEnumeration(Stack<Employee> stack) {
		@Deprecated
		Enumeration<Employee> enumeration = Collections.enumeration(stack);
		while (enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement() + " ");
		}
	}

	// 10. Using Convert Stack to String using toString()
	public void traverseEmployeeStackUsingtoString(Stack<Employee> stack) {
		System.out.print(stack.toString());
	}

	// 11. Using Convert Stack to String using Stream.of()
	public void traverseEmployeeStackUsingStreamof(Stack<Employee> stack) {
		Stream.of(stack.toString()).forEach(System.out::print);
	}

	// 12. Using Convert Stack to Array using to Array(Integer[])
	public void traverseEmployeeStackUsingtoNewArrayByAllocatingMemory(Stack<Employee> stack) {
		Employee[] arr = stack.toArray(new Employee[stack.size()]);
		System.out.print(Arrays.toString(arr));
	}

	// 13. Using Convert Stack to Array without allocating Memory
	public void traverseEmployeeStackUsingtoNewArrayJVMWillAllocateMemory(Stack<Employee> stack) {
		Employee[] arr = stack.toArray(new Employee[0]);
		System.out.print(Arrays.toString(arr));
	}

	// 14. Using Convert Stack to Array that returns an Object[] array
	public void traverseEmployeeStackUsingstacktoArray(Stack<Employee> stack) {
		Object[] arr = stack.toArray();
		System.out.print(Arrays.toString(arr));
	}

	// 15. Using Java 8 Streams, toArray and Lambda Expression
	public void traverseEmployeeStackUsingJava8StreamAndtoArrayAndLambdaExpression(Stack<Employee> stack) {
		Employee[] arr = stack.stream().toArray(n -> new Employee[n]);
		System.out.print(Arrays.toString(arr));
	}

	// 16. Using Java 8 Streams, toArray and Method Reference
	public void traverseEmployeeStackUsingJava8StreamAndtoArrayAndMethodReference(Stack<Employee> stack) {
		Employee[] arr = stack.stream().toArray(Employee[]::new);
		System.out.print(Arrays.toString(arr));
	}

	// 17. Using FluentIterable class from Guava Library
	public void traverseEmployeeStackUsingFluentIterableClassFromGuavaLibrary(Stack<Employee> stack) {
		Employee[] arr = FluentIterable.from(stack).toArray(Employee.class);
		System.out.print(Arrays.toString(arr));
	}

	// 18. Using Iterables class from Guava Libarary
	public void traverseEmployeeStackUsingIterablesClassFromGuavaLibrary(Stack<Employee> stack) {
		Employee[] arr = Iterables.toArray(stack, Employee.class);
		System.out.print(Arrays.toString(arr));
	}

}
