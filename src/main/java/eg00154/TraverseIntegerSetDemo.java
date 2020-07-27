package eg00154;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TraverseIntegerSetDemo {

	public static void main(String[] args) {

		TraverseIntegerSetDemo obj = new TraverseIntegerSetDemo();
		Set<Integer> set = new HashSet<>();
		set.add(9);
		set.add(8);
		set.add(2);
		set.add(6);
		set.add(3);
		set.add(9);
		set.add(6);
		set.add(4);
		set.add(6);
		set.add(5);
		System.out.println("Size : " + set.size());
		System.out.println("\n1. Using enhanced for Loop");
		obj.traverseIntegerSetUsingenhancedforLoop(set);
		System.out.println("\n2. Using Iterator");
		obj.traverseIntegerSetUsingIterator(set);
		System.out.println("\n3. Using Java 8 Iterable.forEach() 1 Way");
		obj.traverseIntegerSetUsingJava8StackInheritForEachFromIterableInterface(set);
		System.out.println("\n4. Using Java 8 Iterable.forEach() 2 Way");
		obj.traverseIntegerMapUsingJava8StackInheritForEachFromIterableInterface(set);
		System.out.println("\n5. Using Java 8 Stream.forEach()");
		obj.traverseIntegerSetUsingJava8StreamforEach(set);
	}

	public void traverseIntegerSetUsingenhancedforLoop(Set<Integer> set) {
		for (int value : set)
			System.out.print(value + " ");

	}

	public void traverseIntegerSetUsingIterator(Set<Integer> set) {
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

	public void traverseIntegerSetUsingJava8StackInheritForEachFromIterableInterface(Set<Integer> set) {
		set.forEach(e -> System.out.print(e + " "));
	}

	public void traverseIntegerMapUsingJava8StackInheritForEachFromIterableInterface(Set<Integer> set) {
		set.forEach(System.out::print);
	}

	public void traverseIntegerSetUsingJava8StreamforEach(Set<Integer> set) {
		set.stream().forEach(e -> System.out.print(e + " "));
	}
}
