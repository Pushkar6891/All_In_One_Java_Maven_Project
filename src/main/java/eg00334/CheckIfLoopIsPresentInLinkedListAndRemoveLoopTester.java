package eg00334;

public class CheckIfLoopIsPresentInLinkedListAndRemoveLoopTester {

	public static void main(String[] args) {

		loopExists();
		System.out.println("\n=======\n");
		noLoopExists();
	}

	public static void loopExists() {
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

		int lengthOfLoop = list.getLengthOfLoop(head);
		System.out.println("\nLength of Loop present in LinkedList : ");
		System.out.println(lengthOfLoop);

		list.detectAndRemoveLoopPresent(head);

		System.out.println("\nNo Loop in LinkedList : ");
		list.printLinkedList(head);
	}

	public static void noLoopExists() {
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

		int lengthOfLoop = list.getLengthOfLoop(head);
		System.out.println("\nLength of Loop present in LinkedList : ");
		System.out.println(lengthOfLoop);
	}

}

// Loop in Linked List
//   12 -> 99 -> 37
//			^	 |
//			|	 V
//		   25 <- 5	
