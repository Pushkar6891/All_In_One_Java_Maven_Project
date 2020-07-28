package eg00347;

public class ReverseLinkedListInGroupOfKTester {

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
		head = list.insert(50, head);
		head = list.insert(40, head);
		head = list.insert(52, head);
		head = list.insert(4, head);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head);

		int k = 3;
		System.out.println("\n\nReverse LinkedList in group of K");
		head = list.reverseLinkedListInGroupOfK(head, k);

		System.out.println("\nReversed LinkedList : ");
		list.printLinkedList(head);
	}

}
