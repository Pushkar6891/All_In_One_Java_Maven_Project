package eg00311;

public class DeleteElementAtRearLinkedListTester {

	public static void main(String[] args) {

		Node head = null;
		MyLinkedList list = new MyLinkedList();

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in LinkedList at End : 12 99 37");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(37, head);

		System.out.println("\nItems Present in LinkedList : 12 99 37");
		list.printLinkedList(head);

		System.out.println("\n\nDelete Element in LinkedList at Rear : 37");
		head = list.deleteAtRear(head);

		System.out.println("\nItems Present in LinkedList : 12 99");
		list.printLinkedList(head);

		System.out.println("\n\nDelete Element in LinkedList at Rear : 37");
		head = list.deleteAtRear(head);

		System.out.println("\nItems Present in LinkedList : 12");
		list.printLinkedList(head);
	}

}
