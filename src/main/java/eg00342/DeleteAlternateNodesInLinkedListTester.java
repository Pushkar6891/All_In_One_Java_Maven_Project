package eg00342;

public class DeleteAlternateNodesInLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList 1 : ");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(8, head);
		head = list.insert(39, head);
		head = list.insert(5, head);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head);

		System.out.println("\n\nDelete alternate Elements ");
		head = list.deleteAlternateNode(head);

		System.out.println("\nAfter Deleting Alternate Nodes : ");
		list.printLinkedList(head);

	}

}
//List 1 : 12 -> 99 -> 8 -> 39 -> 5
// Result : 12 -> 8 -> 5