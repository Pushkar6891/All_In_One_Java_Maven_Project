package eg00349;

public class SeparateOddAndEvenNodesInLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head);

		System.out.println("Inserting Elements in Unsorted LinkedList 1 : ");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(8, head);
		head = list.insert(39, head);
		head = list.insert(5, head);
		head = list.insert(70, head);
		head = list.insert(25, head);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head);

		System.out.println("\n\nSeparate Odd and Even Nodes : ");
		head = list.seperateOddEven(head);

		System.out.println("\nReversed LinkedList : ");
		list.printLinkedList(head);
	}

}
// List : 12 -> 99 -> 8 -> 39 -> 5 -> 70 -> 25
// Result : 12 -> 8 -> 70 -> 99 -> 39 -> 5 -> 25
