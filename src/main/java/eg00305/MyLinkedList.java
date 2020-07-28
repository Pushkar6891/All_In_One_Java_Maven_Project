package eg00305;

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
	
}
