package eg00308;

public class InsertElementAtRearLinkedListTester {

	public static void main(String[] args) {

		Node root = null;
		MyLinkedList list = new MyLinkedList();
		
		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(root);
		
		System.out.println("\nInserting Elements in LinkedList at End : 12 99 37");
		root = list.insert(12, root);
		root = list.insert(99, root);
		root = list.insert(37, root);
		
		System.out.println("\nItems Present in LinkedList : 12 99 37");
		list.printLinkedList(root);
		
		System.out.println("\n\nInsert Elements in LinkedList At End : 5" );
		list.insertAtRear(55, root);
		
		System.out.println("\nItems Present in LinkedList : 5 12 99 37 48");
		list.printLinkedList(root);
	}

}
