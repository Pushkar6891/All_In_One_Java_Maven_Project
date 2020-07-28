package eg00312;

public class MyLinkedList {

	// 1. Creating a new Node
	private Node getNewNode(int data) {
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

	// 4. Insert at front / start / beginning
	public Node insertAtFront(int data, Node node) {

		Node newNode = getNewNode(data);
		newNode.next = node;

		return newNode;
	}

	// 5. Insert at given postion
	public Node insertAtPosition(int data, int position, Node node) {
		if (position < 1) {
			System.out.println("Position cannot be less than 1");
			return node;
		}
		if (node == null && position > 1) {
			System.out.println("Position is greater than no. of elements exist");
			return node;
		}
		if (node == null && position == 1) {
			return getNewNode(data);
		}
		if (position == 1) {
			Node newNode = getNewNode(data);
			newNode.next = node;
			return newNode;
		}
		// recursively call position-1
		node.next = insertAtPosition(data, position - 1, node.next);
		return node;
	}

	// 6. Insert at rear / end
	public void insertAtRear(int data, Node node) {
		insert(data, node);
	}

	// 7. Delete at Front
	public Node deleteAtFront(Node node) {
		// If LinkedList is Empty
		if (node == null) {
			return node;
		}
		return node.next;
	}

	// 8. Delete at given position
	public Node deleteAtPosition(int position, Node node) {
		if (position < 0) {
			System.out.println("Invalid Position");
			return node;
		}
		if (node == null && position > 1) {
			System.out.println("Position is greater than no. of elements exist");
			return node;
		}
		if (position == 1) {
			return node.next;
		}
		// recursively call position-1
		node.next = deleteAtPosition(position - 1, node.next);
		return node;
	}

	// 9. Delete at rear / end
	public Node deleteAtRear(Node node) {
		// If LinkedList is Empty
		if (node == null || node.next == null) {
			return node;
		}

		Node tempNode = node;

		while (tempNode.next.next != null) {
			tempNode = tempNode.next;
		}

		tempNode.next = null;
		return node;
	}

	// 10. Get Size of LinkedList
	public int getSizeOfLinkedList(Node node) {
		if (node == null) {
			return 0;
		}
		return getSizeOfLinkedList(node.next) + 1;
	}

}
