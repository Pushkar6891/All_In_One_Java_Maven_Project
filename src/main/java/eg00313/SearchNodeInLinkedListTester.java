package eg00313;

public class SearchNodeInLinkedListTester {

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

		boolean ifNodeExist1 = list.searchNode(123, head);
		System.out.println("\n\nNode exists in LinkedList : " + ifNodeExist1);

		boolean ifNodeExist2 = list.searchNode(37, head);
		System.out.println("\nNode exists in LinkedList : " + ifNodeExist2);
	}

}
