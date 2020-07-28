package eg00312;

public class FindSizeLinkedListTester {

	public static void main(String[] args) {

		Node head = null;
		MyLinkedList list = new MyLinkedList();

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in LinkedList at End : 12 99 37");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(37, head);

		System.out.println("\nItems Present in LinkedList : 12 99 37");
		list.printLinkedList(head);

		System.out.println("\n\nSize of LinkedList : 3");
		System.out.println(list.getSizeOfLinkedList(head));

		System.out.println("\nInserting Elements in LinkedList at End : 12 99 37 48");
		head = list.insert(48, head);

		System.out.println("\nSize of LinkedList : 4");
		System.out.println(list.getSizeOfLinkedList(head));
	}

}
