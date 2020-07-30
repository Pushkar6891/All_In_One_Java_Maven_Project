package eg00551;

public class Stack {

	private int maxSize;
	private int[] stackArr;
	private int top = 0;

	public Stack(int maxSize) {
		super();
		this.maxSize = maxSize;
		this.stackArr = new int[maxSize];
		this.top = -1;
	}

	public void push(int data) {
		if (isFull()) {
			throw new RuntimeException("Stack is Full!!");
		}

		stackArr[++top] = data;
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty!!");
		}
		return stackArr[top--];
	}

	// get top most item
	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty!!");
		}
		return stackArr[top];
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (top == maxSize - 1) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		return top + 1;
	}
}
