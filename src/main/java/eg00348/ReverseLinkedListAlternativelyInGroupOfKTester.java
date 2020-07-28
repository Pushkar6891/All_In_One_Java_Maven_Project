package eg00348;

// Swap k elements then skip k elements
public class ReverseLinkedListAlternativelyInGroupOfKTester {

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
		head = list.insert(0, head);
		head = list.insert(1, head);
		head = list.insert(2, head);
		head = list.insert(3, head);
		head = list.insert(4, head);
		head = list.insert(5, head);
		head = list.insert(6, head);
		head = list.insert(7, head);
		head = list.insert(8, head);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head);

		int k = 3;
		System.out.println("\n\nReverse LinkedList Alternatively in group of K : " + k);
		head = list.reverseAlternativelyInGroup(head, k);

		System.out.println("\nReversed LinkedList : ");
		list.printLinkedList(head);
	}

}
