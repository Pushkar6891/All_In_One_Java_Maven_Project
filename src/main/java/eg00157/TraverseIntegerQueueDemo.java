package eg00157;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;
import java.util.stream.Stream;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;

public class TraverseIntegerQueueDemo {

	public static void main(String[] args) {

		TraverseIntegerQueueDemo obj = new TraverseIntegerQueueDemo();
		Queue<Integer> queue = new LinkedList<>();
		queue.add(9);
		queue.add(8);
		queue.add(2);
		queue.add(6);
		queue.add(3);
		queue.add(9);
		queue.add(6);
		queue.add(4);
		queue.add(6);
		queue.add(5);
		System.out.println("Size : " + queue.size());

		System.out.println("\n1. Using Iterator");
		obj.traverseIntegerQueueUsingIterator(queue);
		System.out.println("\n2. Using enhanced for loop (uses Iterator internally)");
		obj.traverseIntegerQueueUsingenhancedForLoop(queue);
		System.out.println("\n3. Using Java 8 Stream and Lambda Expression");
		obj.traverseIntegerQueueUsingJava8StreamAndLambdaExpression(queue);
		System.out.println("\n4. Using Java 8 Stream and Method Reference");
		obj.traverseIntegerQueueUsingJava8StreamandMethodReference(queue);
		System.out.println("\n5. Using Java 8 Stream.of() + toArray() + forEach()");
		obj.traverseIntegerQueueUsingJava8StreamAndtoarrayAndforEach(queue);
		System.out.println("\n6. Using Java 8 queue inherit forEach() from Iterable Interface");
		obj.traverseIntegerQueueUsingJava8QueueInheritForEachFromIterableInterface(queue);
		System.out.println("\n7. Using Java 8 queue inherit iterator() from Collection Interface");
		obj.traverseIntegerQueueUsingiteratormethodFromCollectionInterfaceAndforEachRemaining(queue);
		System.out.println("\n8. Using Vector And Enumeration");
		obj.traverseIntegerQueueUsingVectorAndEnumeration(queue);
		System.out.println("\n9. Using Collections.enumeration()");
		obj.traverseIntegerQueueUsingCollectionsAndEnumeration(queue);
		System.out.println("\n10. Using Convert Queue to String using toString()");
		obj.traverseIntegerQueueUsingtoString(queue);
		System.out.println("\n11. Using Convert Queue to String using Stream.of()");
		obj.traverseIntegerQueueUsingStreamof(queue);
		System.out.println("\n12. Using Convert Queue to Array using to Array(Integer[])");
		obj.traverseIntegerQueueUsingtoNewArrayByAllocatingMemory(queue);
		System.out.println("\n13. Using Convert Queue to Array without allocating Memory");
		obj.traverseIntegerQueueUsingtoNewArrayJVMWillAllocateMemory(queue);
		System.out.println("\n14. Using Convert Queue to Array that returns an Object[] array");
		obj.traverseIntegerQueueUsingqueuetoArray(queue);
		System.out.println("\n15. Using Java 8 Streams, toArray and Lambda Expression");
		obj.traverseIntegerQueueUsingJava8StreamAndtoArrayAndLambdaExpression(queue);
		System.out.println("\n16. Using Java 8 Streams, toArray and Method Reference");
		obj.traverseIntegerQueueUsingJava8StreamAndtoArrayAndMethodReference(queue);
		System.out.println("\n17. Using FluentIterable class from Guava Library");
		obj.traverseIntegerQueueUsingFluentIterableClassFromGuavaLibrary(queue);
		System.out.println("\n18. Using Iterable class from Guava Libarary");
		obj.traverseIntegerQueueUsingIterablesClassFromGuavaLibrary(queue);

	}

	// 1. Using Iterator
	public void traverseIntegerQueueUsingIterator(Queue<Integer> queue) {
		Iterator<Integer> iterator = queue.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.print(next);
		}
	}

	// 2. Using enhanced for loop (uses Iterator internally)
	public void traverseIntegerQueueUsingenhancedForLoop(Queue<Integer> queue) {
		for (Integer value : queue) {
			System.out.print(value);
		}
	}

	// 3. Using Java 8 Stream and Lambda Expression
	public void traverseIntegerQueueUsingJava8StreamAndLambdaExpression(Queue<Integer> queue) {
		queue.stream().forEach(e -> System.out.print(e));
	}

	// 4. Using Java 8 Stream and Method Reference
	public void traverseIntegerQueueUsingJava8StreamandMethodReference(Queue<Integer> queue) {
		queue.stream().forEach(System.out::print);
	}

	// 5. Using Java 8 Stream.of() + toArray() + forEach()
	public void traverseIntegerQueueUsingJava8StreamAndtoarrayAndforEach(Queue<Integer> queue) {
		Stream.of(queue.toArray()).forEach(System.out::print);
	}

	// 6. Using Java 8 queue inherit forEach() from Iterable Interface
	public void traverseIntegerQueueUsingJava8QueueInheritForEachFromIterableInterface(Queue<Integer> queue) {
		queue.forEach(System.out::print);
	}

	// 7. Using Java 8 queue inherit iterator() from Collection Interface
	public void traverseIntegerQueueUsingiteratormethodFromCollectionInterfaceAndforEachRemaining(
			Queue<Integer> queue) {
		queue.iterator().forEachRemaining(System.out::print);
	}

	// 8. Using Vector And Enumeration
	public void traverseIntegerQueueUsingVectorAndEnumeration(Queue<Integer> queue) {
		@Deprecated
		Enumeration<Integer> enumeration = new Vector<Integer>(queue).elements();
		while (enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement());
		}
	}

	// 9. Using Collections.enumeration()
	public void traverseIntegerQueueUsingCollectionsAndEnumeration(Queue<Integer> queue) {
		@Deprecated
		Enumeration<Integer> enumeration = Collections.enumeration(queue);
		while (enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement());
		}
	}

	// 10. Using Convert Queue to String using toString()
	public void traverseIntegerQueueUsingtoString(Queue<Integer> queue) {
		System.out.print(queue.toString());
	}

	// 11. Using Convert Queue to String using Stream.of()
	public void traverseIntegerQueueUsingStreamof(Queue<Integer> queue) {
		Stream.of(queue.toString()).forEach(System.out::print);
	}

	// 12. Using Convert Queue to Array using to Array(Integer[])
	public void traverseIntegerQueueUsingtoNewArrayByAllocatingMemory(Queue<Integer> queue) {
		Integer[] arr = queue.toArray(new Integer[queue.size()]);
		System.out.print(Arrays.toString(arr));
	}

	// 13. Using Convert Queue to Array without allocating Memory
	public void traverseIntegerQueueUsingtoNewArrayJVMWillAllocateMemory(Queue<Integer> queue) {
		Integer[] arr = queue.toArray(new Integer[0]);
		System.out.print(Arrays.toString(arr));
	}

	// 14. Using Convert Queue to Array that returns an Object[] array
	public void traverseIntegerQueueUsingqueuetoArray(Queue<Integer> queue) {
		Object[] arr = queue.toArray();
		System.out.print(Arrays.toString(arr));
	}

	// 15. Using Java 8 Streams, toArray and Lambda Expression
	public void traverseIntegerQueueUsingJava8StreamAndtoArrayAndLambdaExpression(Queue<Integer> queue) {
		Integer[] arr = queue.stream().toArray(n -> new Integer[n]);
		System.out.print(Arrays.toString(arr));
	}

	// 16. Using Java 8 Streams, toArray and Method Reference
	public void traverseIntegerQueueUsingJava8StreamAndtoArrayAndMethodReference(Queue<Integer> queue) {
		Integer[] arr = queue.stream().toArray(Integer[]::new);
		System.out.print(Arrays.toString(arr));
	}

	// 17. Using FluentIterable class from Guava Library
	public void traverseIntegerQueueUsingFluentIterableClassFromGuavaLibrary(Queue<Integer> queue) {
		Integer[] arr = FluentIterable.from(queue).toArray(Integer.class);
		System.out.print(Arrays.toString(arr));
	}

	// 18. Using Iterables class from Guava Libarary
	public void traverseIntegerQueueUsingIterablesClassFromGuavaLibrary(Queue<Integer> queue) {
		Integer[] arr = Iterables.toArray(queue, Integer.class);
		System.out.print(Arrays.toString(arr));
	}

}
