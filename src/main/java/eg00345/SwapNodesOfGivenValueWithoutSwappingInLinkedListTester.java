package eg00345;

public class SwapNodesOfGivenValueWithoutSwappingInLinkedListTester {

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

		System.out.println("\n\nSwapping Nodes ");
		head = list.swapNodes(head, 99, 39);
	//	head = list.swapNodes(head, 39, 99);
	//	head = list.swapNodes(head, 12, 5);
	//	head = list.swapNodes(head, 0, 39);
		
		System.out.println("\nAfter Swapping Nodes : ");
		list.printLinkedList(head);
	}

}
