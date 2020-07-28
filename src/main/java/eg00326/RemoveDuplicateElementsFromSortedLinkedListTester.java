package eg00326;

public class RemoveDuplicateElementsFromSortedLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Sorted LinkedList 1 : ");
		head = list.insert(8, head);
		head = list.insert(8, head);
		head = list.insert(8, head);
		head = list.insert(18, head);
		head = list.insert(34, head);
		head = list.insert(37, head);
		head = list.insert(37, head);
		head = list.insert(45, head);
		head = list.insert(45, head);
		head = list.insert(45, head);

		System.out.println("\nItems Present in Sorted LinkedList 1 : 3 8 13");
		list.printLinkedList(head);

		head = list.removeDuplicatesFromSortedLinkedList(head);

		System.out.println("\n\nRemoved Duplicate Element Present in LinkedList : ");
		list.printLinkedList(head);

	}

}
