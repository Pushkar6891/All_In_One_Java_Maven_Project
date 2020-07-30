package eg00360;

public class InsertNodeIntoMiddleOfLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList 1 : ");
		head = list.insert(12, head);
		head = list.insert(7, head);
		head = list.insert(13, head);
		head = list.insert(22, head);
		head = list.insert(8, head);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head);

		head = list.insertNodeInMiddle(head, 100);

		System.out.println("\n\nMake Middle Node as Head of LinkedList : ");
		list.printLinkedList(head);

	}

}
