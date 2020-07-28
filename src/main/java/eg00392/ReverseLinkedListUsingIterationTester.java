package eg00392;

public class ReverseLinkedListUsingIterationTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head);

		System.out.println("Inserting Elements in Unsorted LinkedList 1 : ");
		head = list.insert(1, head);
		head = list.insert(24, head);
		head = list.insert(34, head);
		head = list.insert(9, head);
		head = list.insert(8, head);
		head = list.insert(37, head);
		head = list.insert(5, head);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head);

		System.out.println("\n\nReverse LinkedList using Iteration");
		head = list.reverseLinkedListUsingIteration(head);

		System.out.println("\nReversed LinkedList : ");
		list.printLinkedList(head);
	}

}
