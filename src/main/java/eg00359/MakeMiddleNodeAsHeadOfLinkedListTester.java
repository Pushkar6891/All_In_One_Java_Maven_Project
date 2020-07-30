package eg00359;

public class MakeMiddleNodeAsHeadOfLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList 1 : ");
		head = list.insert(1, head);
		head = list.insert(7, head);
		head = list.insert(8, head);
		head = list.insert(2, head);
		head = list.insert(5, head);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head);

		head = list.makeMiddleNodeHead(head);

		System.out.println("\n\nMake Middle Node as Head of LinkedList : ");
		list.printLinkedList(head);

	}

}
