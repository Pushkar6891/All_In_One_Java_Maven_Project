package eg00307;

public class InsertElementAtGivenPositionLinkedListTester {

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
		
		System.out.println("\n\nInsert Elements in LinkedList : 5 at Position : 2" );
		list.insertAtPosition(5, 5, head);
		
		System.out.println("\nItems Present in LinkedList : 5 12 99 37 48");
		list.printLinkedList(head);
	}

}
