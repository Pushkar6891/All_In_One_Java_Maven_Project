package eg00318;

public class MergeTwoUnsortLinkedListUsingMergeSortTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head1 = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("\nInserting Elements in LinkedList 1 : ");
		head1 = list.insert(12, head1);
		head1 = list.insert(99, head1);
		head1 = list.insert(37, head1);

		Node head2 = null;

		System.out.println("\nInitially LinkedList 2 is Empty : null");
		list.printLinkedList(head2);

		System.out.println("\nInserting Elements in LinkedList 2 : ");
		head2 = list.insert(45, head2);
		head2 = list.insert(8, head2);

		System.out.println("\nItems Present in Unsorted LinkedList 1 : 12 99 37");
		list.printLinkedList(head1);

		System.out.println("\n\nItems Present in Unsorted LinkedList 2 : 45 8");
		list.printLinkedList(head2);

		// pass both unsorted linked lists to merge List
		Node mergeList = list.mergeList(head1, head2);

		System.out.println("\n\nItems Present in Sorted Merged LinkedList : ");
		list.printLinkedList(mergeList);

	}

}
