package eg00317;

public class SortLinkedListUsingMergeSortTester {

	public static void main(String[] args) {

		Node head = null;
		MyLinkedList list = new MyLinkedList();

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in LinkedList at End : 12 99 37 8 18");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(37, head);
		head = list.insert(8, head);
		head = list.insert(18, head);

		System.out.println("\nItems Present in Unsorted LinkedList : 12 99 37 8 18");
		list.printLinkedList(head);

		Node sortedList = list.mergeSort(head);

		System.out.println("\n\nItems Present in Sorted LinkedList : 12 99 37 8 18");
		list.printLinkedList(sortedList);

	}

}
