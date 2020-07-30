package eg00374;

public class MergeTwoSortedLinkedListInReverseOrderTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head1 = null;
		Node head2 = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("Initially LinkedList 2 is Empty : null");
		list.printLinkedList(head2);

		System.out.println("Inserting Elements in Sorted LinkedList 1 : ");
		head1 = list.insert(1, head1);
		head1 = list.insert(5, head1);
		head1 = list.insert(9, head1);
		head1 = list.insert(10, head1);

		System.out.println("Inserting Elements in Sorted LinkedList 2 : ");
		head2 = list.insert(7, head2);
		head2 = list.insert(18, head2);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head1);

		System.out.println("\nItems Present in LinkedList 2 : ");
		list.printLinkedList(head2);

		Node mergeTwoSortedLinkedListReverseOrder = list.mergeTwoSortedLinkedListReverseOrder(head1,head2);

		System.out.println("\nAfter Merge Two Sorting LinkedList in reverse : ");
		list.printLinkedList(mergeTwoSortedLinkedListReverseOrder);

	}

}