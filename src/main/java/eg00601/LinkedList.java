package eg00601;

public class LinkedList<T> {

	private Node<T> head;

	// This internal class represents Node in Linked List
	private static class Node<T> {

		private T data;
		private Node<T> next;

		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * This method insert a Node in Linked List
	 * 
	 * @param newNode has to insert in the List
	 */
	public void insert(Node<T> newNode) {
		if (head == null) {
			head = newNode;
		} else {
			Node<T> currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}

	/**
	 * Method which traverse Linked List from first to last node and prints Node's
	 * value.
	 */
	public void displayLinkedList() {
		Node<T> currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}

	public static void main(String[] args) {

		Node<Integer> node1 = new Node<Integer>(10);
		Node<Integer> node2 = new Node<Integer>(20);
		Node<Integer> node3 = new Node<Integer>(30);

		Node<Integer> node4 = new Node<Integer>(40);

		Node<Integer> node5 = new Node<Integer>(50);
		Node<Integer> node6 = new Node<Integer>(60);
		Node<Integer> node7 = new Node<Integer>(70);

		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.insert(node1);
		linkedList.insert(node2);
		linkedList.insert(node3);

		// Node with value 40 added first time
		linkedList.insert(node4);
		linkedList.insert(node5);
		linkedList.insert(node6);
		linkedList.insert(node7);

		// Node with value 40 added Second time
		linkedList.insert(node4);

		System.out.println("Original LinkedList:");
		linkedList.displayLinkedList();

	}
}