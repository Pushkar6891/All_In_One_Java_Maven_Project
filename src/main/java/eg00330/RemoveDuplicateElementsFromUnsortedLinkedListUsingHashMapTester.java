package eg00330;

// Time Complexity : O(n) as we are using HashMap
public class RemoveDuplicateElementsFromUnsortedLinkedListUsingHashMapTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList 1 : ");
		head = list.insert(8, head);
		head = list.insert(45, head);
		head = list.insert(37, head);
		head = list.insert(8, head);
		head = list.insert(45, head);
		head = list.insert(18, head);
		head = list.insert(34, head);
		head = list.insert(37, head);
		head = list.insert(45, head);
		head = list.insert(8, head);

		System.out.println("\nItems Present in Unsorted LinkedList 1 : ");
		list.printLinkedList(head);

		head = list.removeDuplicatesFromUnsortedLinkedListUsingHashMap(head);

		System.out.println("\n\nRemoved Duplicate Element Present in LinkedList : ");
		list.printLinkedList(head);

	}

}
