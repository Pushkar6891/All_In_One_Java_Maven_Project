package eg00308;

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
}
