package eg00350;

public class SplitLinkedListAlternativelyIntoTwoLinkedListTester {

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

		System.out.println("\n\nSplit LinkedList Alternatively into Two separate LinkedList : ");
		Node[] nodes = list.alternateSplit(head);

		Node firstHead = nodes[0];
		Node secondHead = nodes[1];

		System.out.println("\nSplitted LinkedList 1: ");
		list.printLinkedList(firstHead);

		System.out.println("\nSplitted LinkedList 2: ");
		list.printLinkedList(secondHead);
	}

}
// List : 12 -> 99 -> 8 -> 39 -> 5 -> 70 -> 25
// Result List 1: 12 -> 8 -> 5 -> 25
// Result List 2 : 99 -> 39 -> 70
