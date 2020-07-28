package eg00331;

public class GetKthNodeFromStartInLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList 1 : ");
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

		System.out.println("\nItems Present in Unsorted LinkedList 1 : ");
		list.printLinkedList(head);

		int k = 8;

		System.out.println("\n");
		int kThElement = list.getKthNodeFromStartInLinkedList(head, k);

		System.out.println("\n\n"+ k +" element from start in LinkedList : " + kThElement);

	}

}
