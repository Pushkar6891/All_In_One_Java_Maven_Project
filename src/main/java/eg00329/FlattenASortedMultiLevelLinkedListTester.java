package eg00329;

public class FlattenASortedMultiLevelLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in LinkedList : ");
		head = list.insert(20, head);
		head = list.insert(22, head);
		head = list.insert(25, head);
		head = list.insert(65, head);
		head = list.insert(70, head);

		head = list.insert(20, head);
		head = list.insert(22, head);
		head = list.insert(25, head);
		head = list.insert(65, head);
		head = list.insert(70, head);

		head.right = list.insert(7, head.right);
		head.right = list.insert(12, head.right);
		head.right = list.insert(23, head.right);
		head.right = list.insert(34, head.right);

		head.right.right = list.insert(10, head.right.right);
		head.right.right = list.insert(15, head.right.right);
		head.right.right = list.insert(17, head.right.right);
		head.right.right = list.insert(18, head.right.right);
		head.right.right = list.insert(21, head.right.right);
		head.right.right = list.insert(33, head.right.right);

		head.right.right.right = list.insert(32, head.right.right.right);
		head.right.right.right = list.insert(39, head.right.right.right);
		head.right.right.right = list.insert(40, head.right.right.right);

		System.out.println("\nItems Present in LinkedList 1 : " + " Size : " + list.getSizeOfLinkedList(head));
		list.printLinkedList(head);

		System.out.println("\nItems Present in LinkedList 2 : " + " Size : " + list.getSizeOfLinkedList(head.right));
		list.printLinkedList(head.right);

		System.out.println(
				"\nItems Present in LinkedList 3 : " + " Size : " + list.getSizeOfLinkedList(head.right.right));
		list.printLinkedList(head.right.right);

		System.out.println(
				"\nItems Present in LinkedList 4 : " + " Size : " + list.getSizeOfLinkedList(head.right.right.right));
		list.printLinkedList(head.right.right.right);

		Node flattenList = list.flatten(head);

		System.out.println("\n\nItems Present in Flattenned LinkedList : " + list.getSizeOfLinkedList(flattenList));
		list.printLinkedList(flattenList);

	}

}
