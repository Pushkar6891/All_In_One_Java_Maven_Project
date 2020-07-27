package eg00302;

public class ReverseLinkedListUsingIterativeApproachTester {

	public static void main(String args[]) {

		LinkedList list = new LinkedList();
		Node head = new Node(1);
		list.insertAtEnd(head);
		list.insertAtEnd(new Node(2));
		list.insertAtEnd(new Node(3));
		list.insertAtEnd(new Node(4));
		list.insertAtEnd(new Node(5));
	//	list.insertAtStart(25);
	//	list.insertAt(0, 55);
	//	list.deleteAt(2);
	//	list.deleteAt(3);
		System.out.println("Before Reverse : ");
		list.printLinkedList();
		System.out.println("After Reverse : ");
		Node reverseHead = list.reverseLinkedListUsingIterativeApproach(head);
		list.printLinkedList(reverseHead);

	}

}