package eg00339;

public class DeleteNodesWhichHaveGreaterValuesOnRightInTheLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList : ");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(8, head);
		head = list.insert(39, head);
		head = list.insert(5, head);

		System.out.println("\nItems Present in LinkedList : ");
		list.printLinkedList(head);

		System.out.println("\n\nDelete LinkedList Nodes which have greater values on right");
		head = list.deleteGreaterValuesOnRight(head);

		System.out.println("\nItems Present in LinkedList : null");
		list.printLinkedList(head);
		
	}

}
// Garbage Collector will take care of deleting other nodes
// List 1 : 12 -> 99 -> 8 -> 39 -> 5
// First Reverse List : 5 -> 39 -> 8 -> 99 -> 12
// 5 -> 39 -> 99 -> 12
// 5 -> 39 -> 99 
// Reverse List : 99 -> 39 -> 5
