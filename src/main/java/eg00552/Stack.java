package eg00552;

import java.util.EmptyStackException;

public class Stack {

	private Node top;
	private int size;
	private int MAX_SIZE = 5;

	class Node {
		private int data;
		private Node next;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;// initially node points to null
		}
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
		size++;
	}

	public int pop() {
		if (isEmpty())
			throw new EmptyStackException();
		int result = top.data;
		top = top.next;
		size--;
		return result;
	}

	public int peek() {
		if (isEmpty())
			throw new EmptyStackException();
		int result = top.data;
		return result;
	}

	public int size() {
		return size;
	}

	public boolean isFull() {
		if (size == MAX_SIZE)
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	public void displayStack() {
		Node current = top;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
}
