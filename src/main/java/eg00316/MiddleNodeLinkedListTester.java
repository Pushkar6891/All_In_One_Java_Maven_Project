package eg00316;

public class MiddleNodeLinkedListTester {

	public static void main(String[] args) {

		Node head = null;
		MyLinkedList list = new MyLinkedList();

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in LinkedList at End : 12 99 37 8 18");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(37, head);
		head = list.insert(8, head);
		head = list.insert(18, head);
		head = list.insert(1, head);
		head = list.insert(7, head);

		System.out.println("\nItems Present in LinkedList : 12 99 37 8 18");
		list.printLinkedList(head);

		Node middleNode = list.getMiddleNode(head);

		System.out.println("\n\nMiddle Node : ");
		System.out.println(middleNode.data);

	}

}
