package eg00804;

public class MyLinkedList {

	// 1. Creating a new Node
	public Node getNewNode(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		return node;
	}

	// 2. Print LinkedList Recursively
	public void printLinkedList(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		printLinkedList(node.next);
	}

	// 3. Insert at end
	public Node insert(int data, Node node) {
		if (node == null) {
			// create a new node
			return getNewNode(data);
		} else {
			node.next = insert(data, node.next);
		}
		return node;
	}

	// 4. Reverse LinkedList
	public Node reverseLinkedListUsingIteration(Node node) {
		// Single Node
		if (node == null || node.next == null) {
			return node;
		}

		Node previous = null;
		Node next = null;

		while (node != null) {
			next = node.next;
			node.next = previous;
			previous = node;
			node = next;
		}
		return previous;
	}

	// 5. Reverse LinkedList
	public Node reverseLinkedList(Node head) {
		// Single Node
		if (head == null || head.next == null) {
			return head;
		}

		Node previous = null;
		Node next = null;

		// traverse till end
		while (head != null) {
			next = head.next;
			head.next = previous;
			previous = head;
			head = next;
		}
		return previous;
	}
}
