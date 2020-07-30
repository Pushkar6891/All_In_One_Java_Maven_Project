package eg00375;

public class MoveAllOccurrencesOfElementToTheEndInLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head1 = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("Inserting Elements in Sorted LinkedList 1 : ");
		head1 = list.insert(3, head1);
		head1 = list.insert(2, head1);
		head1 = list.insert(4, head1);
		head1 = list.insert(3, head1);
		head1 = list.insert(5, head1);
		head1 = list.insert(2, head1);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head1);

		int N = 2;
		Node moveAllOccurrenceOfElementToEnd = list.moveAllOccurrenceOfElementToEnd(head1, N);

		System.out.println("\nAfter Moving All Occurrences of N to End: ");
		list.printLinkedList(moveAllOccurrenceOfElementToEnd);

	}

}