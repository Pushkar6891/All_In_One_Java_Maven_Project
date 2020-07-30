package eg00358;

public class Sub2NumbersRepresentedAsLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head1 = null;
		Node head2 = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("Initially LinkedList 2 is Empty : null");
		list.printLinkedList(head2);

		System.out.println("Inserting Elements in Unsorted LinkedList 1 : ");
		head1 = list.insert(1, head1);
		head1 = list.insert(7, head1);
		head1 = list.insert(8, head1);
		head1 = list.insert(2, head1);
		head1 = list.insert(5, head1);

		System.out.println("Inserting Elements in Unsorted LinkedList 1 : ");
		head2 = list.insert(5, head2);
		head2 = list.insert(6, head2);
		head2 = list.insert(7, head2);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head1);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head2);

		Node newListHead = list.subtractTwoNumbers(head1, head2);

		System.out.println("\n\nSubtraction of 2 LinkedLists : ");
		list.printLinkedList(newListHead);

	}

}
// List 1: 1 -> 7 -> 8 -> 2 -> 5
// List 2:           5 -> 6 -> 7
// List 3: 1 -> 7 -> 2 -> 5 -> 8
