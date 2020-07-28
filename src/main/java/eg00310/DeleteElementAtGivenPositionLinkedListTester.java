package eg00310;

public class DeleteElementAtGivenPositionLinkedListTester {

	public static void main(String[] args) {

		Node head = null;
		MyLinkedList list = new MyLinkedList();

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nDelete Elements in LinkedList At Front : null ");
		head = list.deleteAtFront(head);

		System.out.println("\nInserting Elements in LinkedList at End : 12 99 37");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(37, head);

		System.out.println("\nItems Present in LinkedList : 12 99 37");
		list.printLinkedList(head);

		System.out.println("\n\nDelete Element in LinkedList at Position : 2");
		head = list.deleteAtPosition(4, head);

		System.out.println("\nItems Present in LinkedList : 37");
		list.printLinkedList(head);
	}

}
