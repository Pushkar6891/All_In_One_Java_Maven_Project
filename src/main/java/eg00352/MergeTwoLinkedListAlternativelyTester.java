package eg00352;

public class MergeTwoLinkedListAlternativelyTester {

	public static void main(String[] args) {

		firstListGreaterThanSecondList();
		System.out.println("\n===========\n");
		secondListGreaterThanFirstList();

	}

	public static void firstListGreaterThanSecondList() {
		MyLinkedList list = new MyLinkedList();

		Node head1 = null;
		Node head2 = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("Initially LinkedList 2 is Empty : null");
		list.printLinkedList(head2);

		System.out.println("Inserting Elements in Unsorted LinkedList 1 : ");
		head1 = list.insert(12, head1);
		head1 = list.insert(99, head1);
		head1 = list.insert(8, head1);
		head1 = list.insert(39, head1);

		System.out.println("Inserting Elements in Unsorted LinkedList 2 : ");
		head2 = list.insert(5, head2);
		head2 = list.insert(70, head2);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head1);

		System.out.println("\n\nItems Present in LinkedList 2 : ");
		list.printLinkedList(head2);

		Node[] nodes = list.mergeTwoLinkedListAlternatively(head1, head2);

		Node firstHead = nodes[0];
		Node secondHead = nodes[1];

		System.out.println("\n\nMerged LinkedList : ");
		list.printLinkedList(firstHead);
	}

	public static void secondListGreaterThanFirstList() {
		MyLinkedList list = new MyLinkedList();

		Node head1 = null;
		Node head2 = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("Initially LinkedList 2 is Empty : null");
		list.printLinkedList(head2);

		System.out.println("Inserting Elements in Unsorted LinkedList 1 : ");
		head1 = list.insert(5, head1);
		head1 = list.insert(70, head1);

		System.out.println("Inserting Elements in Unsorted LinkedList 2 : ");
		head2 = list.insert(12, head2);
		head2 = list.insert(99, head2);
		head2 = list.insert(8, head2);
		head2 = list.insert(39, head2);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head1);

		System.out.println("\n\nItems Present in LinkedList 2 : ");
		list.printLinkedList(head2);

		Node[] nodes = list.mergeTwoLinkedListAlternatively(head1, head2);

		Node firstHead = nodes[0];
		Node secondHead = nodes[1];

		System.out.println("\n\nMerged LinkedList 1: ");
		list.printLinkedList(firstHead);
		
		System.out.println("\n\nMerged LinkedList 2: ");
		list.printLinkedList(secondHead);
	}
}
// If List 1 > List 2
// List 1: 12 -> 99 -> 8 -> 39
// List 2: 5 -> 70
// Result List : 12 -> 5 -> 99 -> 8 -> 39

// If List 1 < List 2
// List 1: 5 -> 70
// List 2: 12 -> 99 -> 8 -> 39
// Result List : 5 -> 12 -> 70 -> 99 List : 8 -> 39
