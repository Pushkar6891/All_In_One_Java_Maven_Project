package eg00248;

public class Tester {
	public static void main(String[] args) {

		System.out.println("Min Stack : ");
		MyMinStack minStack = new MyMinStack();
		minStack.push(3);
		minStack.push(5);
		minStack.getMin();
		minStack.push(2);
		minStack.push(1);
		minStack.getMin();
		minStack.pop();
		minStack.getMin();
		minStack.pop();
		minStack.peek();
		minStack.getMin();
		minStack.peek();

		System.out.println("======================");
		System.out.println("Max Stack : ");
		MyMinStack maxStack = new MyMinStack();
		maxStack.push(3);
		maxStack.push(5);
		maxStack.getMin();
		maxStack.push(2);
		maxStack.push(1);
		maxStack.getMin();
		maxStack.pop();
		maxStack.getMin();
		maxStack.pop();
		maxStack.peek();
		maxStack.getMin();
		maxStack.peek();
	}
}