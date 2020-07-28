package eg00354;

public class Add1ToLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head);

		System.out.println("Inserting Elements in Unsorted LinkedList 1 : ");
		head = list.insert(1, head);
		head = list.insert(9, head);
		head = list.insert(9, head);
		head = list.insert(9, head);
		head = list.insert(9, head);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head);

		head = list.addOne(head);

		System.out.println("\n\nSorted LinkedList : ");
		list.printLinkedList(head);

	}

}
// List 1: 1 -> 9 -> 9 -> 9 -> 9
// Result List : 2 -> 0 -> 0 -> 0 -> 0
