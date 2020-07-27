package eg00301;

public class LinkedList {

	Node head;

	public void insert(int data) {

		// create a new node everytime we insert
		Node node = new Node();
		node.data = data;
		node.next = null;

		// If No nodes currently
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			// traverse linkedlist
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;// second last node is pointing to last node
		}
	}

	public void insertAtStart(int data) {
		// create a new node everytime we insert
		Node node = new Node();
		node.data = data;
		node.next = null;

		node.next = head; // store current head to new head
		head = node; // make current node as head;
	}

	public void insertAt(int index, int data) {
		// create a new node everytime we insert
		Node node = new Node();
		node.data = data;
		node.next = null;

		// insert at start
		if (index == 0)
			insertAtStart(data);
		else {
			// traverse
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;// store current next into new next
			n.next = node;
		}
	}

	public void deleteAt(int index) {
		// delete head node
		if (index == 0) {
			head = head.next;
		} else {
			// traverse
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println("deleted n1 " + n1.data);
			n1 = null;// will be garbage collected
		}
	}

	public void printLinkedList() {
		Node node = head;
		while (node.next != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println(node.data);
	}

}
