package eg00551;

public class StackTester {

	public static void main(String[] args) {

		Stack stack = new Stack(5);

		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());

		stack.push(12);
		stack.push(5);
		stack.push(34);
		stack.push(42);
		stack.push(91);

		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("Stack Size: " + stack.size());
		System.out.println(stack.peek());
		System.out.println("Stack Size: " + stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());

	}

}
