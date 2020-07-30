package eg00371;

public class DeleteLastOccurrenceOfElementInLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head1 = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("Inserting Elements in Unsorted LinkedList 1 : ");
		head1 = list.insert(22, head1);
		head1 = list.insert(3, head1);
		head1 = list.insert(10, head1);
		head1 = list.insert(13, head1);
		head1 = list.insert(23, head1);
		head1 = list.insert(6, head1);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head1);

		int val = 13;
		head1 = list.deleteLastOccurrenceOfItem(head1, val);

		System.out.println("\n\nAfter Deleting Last Occurrence of val in LinkedList : ");
		list.printLinkedList(head1);
	}

}