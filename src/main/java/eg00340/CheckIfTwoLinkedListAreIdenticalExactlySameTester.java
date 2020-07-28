package eg00340;

public class CheckIfTwoLinkedListAreIdenticalExactlySameTester {

	public static void main(String[] args) {

		identicalLinkedLists();
		System.out.println("=============");
		nonIdenticalLinkedLists();
		
	}

	public static void identicalLinkedLists() {
		MyLinkedList list = new MyLinkedList();

		Node head1 = null;
		Node head2 = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("Initially LinkedList 2 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("\nInserting Elements in Unsorted LinkedList 1 : ");
		head1 = list.insert(12, head1);
		head1 = list.insert(99, head1);
		head1 = list.insert(8, head1);
		head1 = list.insert(39, head1);
		head1 = list.insert(5, head1);

		System.out.println("\nInserting Elements in Unsorted LinkedList 2 : ");
		head2 = list.insert(12, head2);
		head2 = list.insert(99, head2);
		head2 = list.insert(8, head2);
		head2 = list.insert(39, head2);
		head2 = list.insert(5, head2);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head1);

		System.out.println("\nItems Present in LinkedList 2 : ");
		list.printLinkedList(head1);

		System.out.println("\n\nCheck if Two LinkedList are identical with same order ");
		boolean result = list.ifIdentical(head1, head2);

		System.out.println("\nAre LinkedList 1 and 2 identical : ");
		System.out.println(result);
	}

	public static void nonIdenticalLinkedLists() {
		MyLinkedList list = new MyLinkedList();

		Node head1 = null;
		Node head2 = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("Initially LinkedList 2 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("\nInserting Elements in Unsorted LinkedList 1 : ");
		head1 = list.insert(12, head1);
		head1 = list.insert(99, head1);
		head1 = list.insert(8, head1);
		head1 = list.insert(39, head1);
		head1 = list.insert(5, head1);

		System.out.println("\nInserting Elements in Unsorted LinkedList 2 : ");
		head2 = list.insert(12, head2);
		head2 = list.insert(99, head2);
		head2 = list.insert(8, head2);
		head2 = list.insert(39, head2);
	//	head2 = list.insert(5, head2);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head1);

		System.out.println("\nItems Present in LinkedList 2 : ");
		list.printLinkedList(head1);

		System.out.println("\n\nCheck if Two LinkedList are identical with same order ");
		boolean result = list.ifIdentical(head1, head2);

		System.out.println("\nAre LinkedList 1 and 2 identical : ");
		System.out.println(result);
	}

}
