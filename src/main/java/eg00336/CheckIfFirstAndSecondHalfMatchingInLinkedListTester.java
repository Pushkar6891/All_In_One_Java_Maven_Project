package eg00336;

public class CheckIfFirstAndSecondHalfMatchingInLinkedListTester {

	public static void main(String[] args) {
		firstAndSecondHalfMatching1();
		System.out.println("========");
		firstAndSecondHalfMatching2();
		System.out.println("========");
		firstAndSecondHalfNotMatching3();

	}

	public static void firstAndSecondHalfMatching1() {
		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList : ");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(37, head);
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(37, head);

		System.out.println("\nItems Present in LinkedList : ");
		list.printLinkedList(head);

		System.out.println("\n\nDeleting Middle Element In LinkedList");
		boolean result = list.ifFirstAndSecondHalfMatching(head);

		System.out.println("\nAre First and Second Half Matching: ");
		System.out.println(result);
	}

	public static void firstAndSecondHalfMatching2() {
		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList : ");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(37, head);
		head = list.insert(12, head);
		head = list.insert(99, head);
		// head = list.insert(37, head);

		System.out.println("\nItems Present in LinkedList : ");
		list.printLinkedList(head);

		System.out.println("\n\nDeleting Middle Element In LinkedList");
		boolean result = list.ifFirstAndSecondHalfMatching(head);

		System.out.println("\nAre First and Second Half Matching: ");
		System.out.println(result);
	}

	public static void firstAndSecondHalfNotMatching3() {
		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList : ");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(0, head);

		System.out.println("\nItems Present in LinkedList : ");
		list.printLinkedList(head);

		System.out.println("\n\nDeleting Middle Element In LinkedList");
		boolean result = list.ifFirstAndSecondHalfMatching(head);

		System.out.println("\nAre First and Second Half Matching: ");
		System.out.println(result);
	}
}

// List 1 : 12 -> 99 -> 37 -> 12 -> 99
// List 2 : 12 -> 99 -> 12 -> 99 -> 37
