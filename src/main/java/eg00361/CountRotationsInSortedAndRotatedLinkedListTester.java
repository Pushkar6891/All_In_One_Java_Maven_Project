package eg00361;

public class CountRotationsInSortedAndRotatedLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList 1 : ");
		head = list.insert(22, head);
		head = list.insert(38, head);
		head = list.insert(100, head);
		head = list.insert(700, head);
		head = list.insert(1300, head);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head);

		int noOfRotations = list.countRotationInSortedRotatedList(head);

	//	System.out.println("\n\nMake Middle Node as Head of LinkedList : ");
	//	list.printLinkedList(head);

		System.out.println("\n\nNo Of Rotations : " + noOfRotations);
	}

}
