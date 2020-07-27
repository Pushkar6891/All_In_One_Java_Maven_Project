package eg00156;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.Stream;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;

public class TraverseIntegerStackDemo {

	public static void main(String[] args) {

		TraverseIntegerStackDemo obj = new TraverseIntegerStackDemo();
		Stack<Integer> stack = new Stack<>();
		stack.push(9);
		stack.push(8);
		stack.push(2);
		stack.push(6);
		stack.push(3);
		stack.push(9);
		stack.push(6);
		stack.push(4);
		stack.push(6);
		stack.push(5);
		System.out.println("Size : " + stack.size());

		System.out.println("\n1. Using Iterator");
		obj.traverseIntegerStackUsingIterator(stack);
		System.out.println("\n2. Using enhanced for loop (uses Iterator internally)");
		obj.traverseIntegerStackUsingenhancedForLoop(stack);
		System.out.println("\n3. Using Java 8 Stream and Lambda Expression");
		obj.traverseIntegerStackUsingJava8StreamAndLambdaExpression(stack);
		System.out.println("\n4. Using Java 8 Stream and Method Reference");
		obj.traverseIntegerStackUsingJava8StreamandMethodReference(stack);
		System.out.println("\n5. Using Java 8 Stream.of() + toArray() + forEach()");
		obj.traverseIntegerStackUsingJava8StreamAndtoarrayAndforEach(stack);
		System.out.println("\n6. Using Java 8 stack inherit forEach() from Iterable Interface");
		obj.traverseIntegerStackUsingJava8StackInheritForEachFromIterableInterface(stack);
		System.out.println("\n7. Using Java 8 stack inherit iterator() from Collection Interface");
		obj.traverseIntegerStackUsingiteratormethodFromCollectionInterfaceAndforEachRemaining(stack);
		System.out.println("\n8. Using Vector And Enumeration");
		obj.traverseIntegerStackUsingVectorAndEnumeration(stack);
		System.out.println("\n9. Using Collections.enumeration()");
		obj.traverseIntegerStackUsingCollectionsAndEnumeration(stack);
		System.out.println("\n10. Using Convert Stack to String using toString()");
		obj.traverseIntegerStackUsingtoString(stack);
		System.out.println("\n11. Using Convert Stack to String using Stream.of()");
		obj.traverseIntegerStackUsingStreamof(stack);
		System.out.println("\n12. Using Convert Stack to Array using to Array(Integer[])");
		obj.traverseIntegerStackUsingtoNewArrayByAllocatingMemory(stack);
		System.out.println("\n13. Using Convert Stack to Array without allocating Memory");
		obj.traverseIntegerStackUsingtoNewArrayJVMWillAllocateMemory(stack);
		System.out.println("\n14. Using Convert Stack to Array that returns an Object[] array");
		obj.traverseIntegerStackUsingstacktoArray(stack);
		System.out.println("\n15. Using Java 8 Streams, toArray and Lambda Expression");
		obj.traverseIntegerStackUsingJava8StreamAndtoArrayAndLambdaExpression(stack);
		System.out.println("\n16. Using Java 8 Streams, toArray and Method Reference");
		obj.traverseIntegerStackUsingJava8StreamAndtoArrayAndMethodReference(stack);
		System.out.println("\n17. Using FluentIterable class from Guava Library");
		obj.traverseIntegerStackUsingFluentIterableClassFromGuavaLibrary(stack);
		System.out.println("\n18. Using Iterable class from Guava Libarary");
		obj.traverseIntegerStackUsingIterablesClassFromGuavaLibrary(stack);

	}

	// 1. Using Iterator
	public void traverseIntegerStackUsingIterator(Stack<Integer> stack) {
		Iterator<Integer> iterator = stack.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.print(next);
		}
	}

	// 2. Using enhanced for loop (uses Iterator internally)
	public void traverseIntegerStackUsingenhancedForLoop(Stack<Integer> stack) {
		for (Integer value : stack) {
			System.out.print(value);
		}
	}

	// 3. Using Java 8 Stream and Lambda Expression
	public void traverseIntegerStackUsingJava8StreamAndLambdaExpression(Stack<Integer> stack) {
		stack.stream().forEach(e -> System.out.print(e));
	}

	// 4. Using Java 8 Stream and Method Reference
	public void traverseIntegerStackUsingJava8StreamandMethodReference(Stack<Integer> stack) {
		stack.stream().forEach(System.out::print);
	}

	// 5. Using Java 8 Stream.of() + toArray() + forEach()
	public void traverseIntegerStackUsingJava8StreamAndtoarrayAndforEach(Stack<Integer> stack) {
		Stream.of(stack.toArray()).forEach(System.out::print);
	}

	// 6. Using Java 8 stack inherit forEach() from Iterable Interface
	public void traverseIntegerStackUsingJava8StackInheritForEachFromIterableInterface(Stack<Integer> stack) {
		stack.forEach(System.out::print);
	}

	// 7. Using Java 8 stack inherit iterator() from Collection Interface
	public void traverseIntegerStackUsingiteratormethodFromCollectionInterfaceAndforEachRemaining(
			Stack<Integer> stack) {
		stack.iterator().forEachRemaining(System.out::print);
	}

	// 8. Using Vector And Enumeration
	public void traverseIntegerStackUsingVectorAndEnumeration(Stack<Integer> stack) {
		@Deprecated
		Enumeration<Integer> enumeration = new Vector(stack).elements();
		while (enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement());
		}
	}

	// 9. Using Collections.enumeration()
	public void traverseIntegerStackUsingCollectionsAndEnumeration(Stack<Integer> stack) {
		@Deprecated
		Enumeration<Integer> enumeration = Collections.enumeration(stack);
		while (enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement());
		}
	}

	// 10. Using Convert Stack to String using toString()
	public void traverseIntegerStackUsingtoString(Stack<Integer> stack) {
		System.out.print(stack.toString());
	}

	// 11. Using Convert Stack to String using Stream.of()
	public void traverseIntegerStackUsingStreamof(Stack<Integer> stack) {
		Stream.of(stack.toString()).forEach(System.out::print);
	}

	// 12. Using Convert Stack to Array using to Array(Integer[])
	public void traverseIntegerStackUsingtoNewArrayByAllocatingMemory(Stack<Integer> stack) {
		Integer[] arr = stack.toArray(new Integer[stack.size()]);
		System.out.print(Arrays.toString(arr));
	}

	// 13. Using Convert Stack to Array without allocating Memory
	public void traverseIntegerStackUsingtoNewArrayJVMWillAllocateMemory(Stack<Integer> stack) {
		Integer[] arr = stack.toArray(new Integer[0]);
		System.out.print(Arrays.toString(arr));
	}

	// 14. Using Convert Stack to Array that returns an Object[] array
	public void traverseIntegerStackUsingstacktoArray(Stack<Integer> stack) {
		Object[] arr = stack.toArray();
		System.out.print(Arrays.toString(arr));
	}

	// 15. Using Java 8 Streams, toArray and Lambda Expression
	public void traverseIntegerStackUsingJava8StreamAndtoArrayAndLambdaExpression(Stack<Integer> stack) {
		Integer[] arr = stack.stream().toArray(n -> new Integer[n]);
		System.out.print(Arrays.toString(arr));
	}

	// 16. Using Java 8 Streams, toArray and Method Reference
	public void traverseIntegerStackUsingJava8StreamAndtoArrayAndMethodReference(Stack<Integer> stack) {
		Integer[] arr = stack.stream().toArray(Integer[]::new);
		System.out.print(Arrays.toString(arr));
	}

	// 17. Using FluentIterable class from Guava Library
	public void traverseIntegerStackUsingFluentIterableClassFromGuavaLibrary(Stack<Integer> stack) {
		Integer[] arr = FluentIterable.from(stack).toArray(Integer.class);
		System.out.print(Arrays.toString(arr));
	}

	// 18. Using Iterables class from Guava Libarary
	public void traverseIntegerStackUsingIterablesClassFromGuavaLibrary(Stack<Integer> stack) {
		Integer[] arr = Iterables.toArray(stack, Integer.class);
		System.out.print(Arrays.toString(arr));
	}

}
