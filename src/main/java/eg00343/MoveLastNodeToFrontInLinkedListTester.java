package eg00343;

public class MoveLastNodeToFrontInLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList 1 : ");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(8, head);
		head = list.insert(39, head);
		head = list.insert(5, head);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head);

		System.out.println("\n\nMove last node to Front ");
		head = list.moveLastNodeToFront(head);

		System.out.println("\nUpdated LinkedList After moving last node to front: ");
		list.printLinkedList(head);

	}

}
