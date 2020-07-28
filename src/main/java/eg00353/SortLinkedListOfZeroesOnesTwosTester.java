package eg00353;

public class SortLinkedListOfZeroesOnesTwosTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head);

		System.out.println("Inserting Elements in Unsorted LinkedList 1 : ");
		head = list.insert(2, head);
		head = list.insert(1, head);
		head = list.insert(0, head);
		head = list.insert(1, head);
		head = list.insert(2, head);
		head = list.insert(1, head);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head);

		head = list.sortListOfZeroesOnesTwos(head);

		System.out.println("\n\nSorted LinkedList : ");
		list.printLinkedList(head);

	}

}
// List 1: 2 -> 1 -> 0 -> 1 -> 2 -> 1
// Result List : 0 -> 1 -> 1 -> 1 -> 2 -> 2
