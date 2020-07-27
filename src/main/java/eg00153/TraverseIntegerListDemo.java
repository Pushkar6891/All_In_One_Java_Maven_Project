package eg00153;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TraverseIntegerListDemo {

	public static void main(String[] args) {

		TraverseIntegerListDemo obj = new TraverseIntegerListDemo();
		List<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(8);
		list.add(2);
		list.add(6);
		list.add(3);
		list.add(9);
		list.add(6);
		list.add(4);
		list.add(6);
		list.add(5);
		System.out.println("Size : " + list.size());
		System.out.println("1. Using for Loop");
		obj.traverseIntegerListUsingforLoop(list);
		System.out.println("\n2. Using while Loop");
		obj.traverseIntegerListUsingwhileLoop(list);
		System.out.println("\n3. Using do while Loop");
		obj.traverseIntegerListUsingdowhileLoop(list);
		System.out.println("\n4. Using enhanced for Loop");
		obj.traverseIntegerListUsingenhancedforLoop(list);
		System.out.println("\n5. Using Iterator");
		obj.traverseIntegerListUsingIterator(list);
		System.out.println("\n6. Using List Iterator");
		obj.traverseIntegerListUsingListIterator(list);
		System.out.println("\n7. Using Java 8 Iterable.forEach() 1 Way");
		obj.traverseIntegerListUsingJava8StackInheritForEachFromIterableInterface(list);
		System.out.println("\n8. Using Java 8 Iterable.forEach() 2 Way");
		obj.traverseIntegerListUsingJava8StreamSecondWay(list);
		System.out.println("\n9. Using Java 8 Stream.forEach()");
		obj.traverseIntegerListUsingJava8StreamforEach(list);
	}

	public void traverseIntegerListUsingforLoop(List<Integer> list) {
		int n = list.size();
		for (int i = 0; i < n; i++) {
			System.out.print(list.get(i) + " ");
		}
	}

	public void traverseIntegerListUsingwhileLoop(List<Integer> list) {
		int n = list.size();
		int i = 0;
		while (i < n) {
			System.out.print(list.get(i) + " ");
			i++;
		}
	}

	public void traverseIntegerListUsingdowhileLoop(List<Integer> list) {
		int n = list.size();
		int i = 0;
		do {
			System.out.print(list.get(i) + " ");
			i++;
		} while (i < n);
	}

	public void traverseIntegerListUsingenhancedforLoop(List<Integer> list) {
		for (int value : list)
			System.out.print(value + " ");

	}

	public void traverseIntegerListUsingIterator(List<Integer> list) {
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

	public void traverseIntegerListUsingListIterator(List<Integer> list) {
		ListIterator<Integer> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
	}

	public void traverseIntegerListUsingJava8StackInheritForEachFromIterableInterface(List<Integer> list) {
		list.forEach(e -> System.out.print(e + " "));
	}

	public void traverseIntegerListUsingJava8StreamSecondWay(List<Integer> list) {
		list.forEach(System.out::print);
	}

	public void traverseIntegerListUsingJava8StreamforEach(List<Integer> list) {
		list.stream().forEach(e -> System.out.print(e + " "));
	}
}
