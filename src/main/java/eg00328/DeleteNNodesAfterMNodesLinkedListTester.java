package eg00328;

public class DeleteNNodesAfterMNodesLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in LinkedList 1 : ");
		head = list.insert(8, head);
		head = list.insert(45, head);
		head = list.insert(37, head);
		head = list.insert(8, head);
		head = list.insert(45, head);
		head = list.insert(18, head);
		head = list.insert(34, head);
		head = list.insert(37, head);
		head = list.insert(45, head);
		head = list.insert(8, head);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head);

		// delete 1 node after 2 nodes
		head = list.deleteNNodesAfterMNodes(1, 2, head);

		System.out.println("\n\nDeleted 1 node after 2 nodes in LinkedList : ");
		list.printLinkedList(head);

		// delete 2 node after 3 nodes
		head = list.deleteNNodesAfterMNodes(2, 3, head);

		System.out.println("\n\nDeleted 2 node after 3 nodes in LinkedList : ");
		list.printLinkedList(head);

	}

}
