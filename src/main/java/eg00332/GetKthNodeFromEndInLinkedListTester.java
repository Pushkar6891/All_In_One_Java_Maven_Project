package eg00332;

public class GetKthNodeFromEndInLinkedListTester {

	public static void main(String[] args) {

		m1();
		System.out.println("==========");
		m2();
		
	}

	public static void m1() {
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

		int k = 5;
		int kThElement = list.getKthNodeFromEndInLinkedListByReversing(head, k);

		System.out.println("\n\n" + k + " element from end in LinkedList : " + kThElement);

	}

	public static void m2() {
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
		int kThElement = list.getKthNodeFromEndInLinkedList(head, k);

		System.out.println("\n" + k + " element from end in LinkedList : " + kThElement);
	}

}
