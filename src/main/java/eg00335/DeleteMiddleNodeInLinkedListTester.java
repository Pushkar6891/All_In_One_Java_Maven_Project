package eg00335;

public class DeleteMiddleNodeInLinkedListTester {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList : ");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(37, head);
		head = list.insert(5, head);
		head = list.insert(25, head);

		System.out.println("\nItems Present in LinkedList Before Deletion : ");
		list.printLinkedList(head);

		System.out.println("\n\nDeleting Middle Element In LinkedList");
		head = list.deleteMiddleNodeInLinkedList(head);

		System.out.println("\nItems Present in LinkedList After Deletion : ");
		list.printLinkedList(head);

	}

}
