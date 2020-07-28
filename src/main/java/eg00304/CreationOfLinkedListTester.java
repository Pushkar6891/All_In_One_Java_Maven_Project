package eg00304;

import eg00305.MyLinkedList;
import eg00305.Node;

public class CreationOfLinkedListTester {

	public static void main(String[] args) {

		Node head = null;
		MyLinkedList list = new MyLinkedList();
		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);
		System.out.println("\nInserting Elements in LinkedList at End : 12 99 37");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(37, head);
		list.printLinkedList(head);
		System.out.println("\n\nInserting Elements in LinkedList at End : 48");
		head = list.insert(48, head);
		System.out.println("\nItems Present in LinkedList : 12 99 37 48");
		list.printLinkedList(head);
		System.out.println();
	}

}
