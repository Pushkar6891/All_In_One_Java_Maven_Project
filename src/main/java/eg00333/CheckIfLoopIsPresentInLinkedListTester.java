package eg00333;

public class CheckIfLoopIsPresentInLinkedListTester {

	public static void main(String[] args) {

		m1();
		System.out.println("=======");
		m2();
	}

	public static void m1() {
		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList : ");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(37, head);
		head = list.insert(5, head);
		head = list.insert(25, head);

		head.next.next.next.next.next = head.next;

		boolean result = list.ifLoopPresent(head);
		System.out.println("\nIs Loop present in  LinkedList : ");
		System.out.println(result);
	}

	public static void m2() {
		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList : ");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(37, head);
		head = list.insert(5, head);
		head = list.insert(25, head);

		// head.next.next.next.next.next = head.next;

		boolean result = list.ifLoopPresent(head);
		System.out.println("\nIs Loop present in  LinkedList : ");
		System.out.println(result);
	}

}

// Loop in Linked List
//   12 -> 99 -> 37
//			^	 |
//			|	 V
//		   25 <- 5	
