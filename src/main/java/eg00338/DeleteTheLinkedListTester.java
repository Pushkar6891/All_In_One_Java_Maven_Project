package eg00338;

public class DeleteTheLinkedListTester {

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

		System.out.println("\nItems Present in LinkedList : ");
		list.printLinkedList(head);

		System.out.println("\n\nDelete LinkedList / Deleting all elements from LinkedList");
		head = list.deleteLinkedList(head);

		System.out.println("\nItems Present in LinkedList : null");
		list.printLinkedList(head);
		
		System.out.println("\nAll Elements of LinkedList have been deleted: ");
	}

}
// Garbage Collector will take care of deleting other nodes
// List 1 : 12 -> 99 -> 37 -> 99 -> 12