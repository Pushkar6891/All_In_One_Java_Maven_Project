package eg00325;

public class FindLowestCommonElementInTwoLinkedListTester {

	public static void main(String[] args) {

		ifThereAreCommonElementsBetweenTwoLinkedList();
		System.out.println("=======================");
		ifThereAreNoCommonElementsBetweenTwoLinkedListReturnNull();
	}

	public static void ifThereAreCommonElementsBetweenTwoLinkedList() {
		MyLinkedList list = new MyLinkedList();

		Node head1 = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("\nInserting Elements in LinkedList 1 : ");
		head1 = list.insert(37, head1);
		head1 = list.insert(8, head1);
		head1 = list.insert(13, head1);
		head1 = list.insert(18, head1);
		head1 = list.insert(9, head1);
		head1 = list.insert(3, head1);
		head1 = list.insert(0, head1);

		Node head2 = null;

		System.out.println("\nInitially LinkedList 2 is Empty : null");
		list.printLinkedList(head2);

		System.out.println("\nInserting Elements in LinkedList 2 : ");
		head2 = list.insert(18, head2);
		head2 = list.insert(14, head2);
		head2 = list.insert(8, head2);
		head2 = list.insert(10, head2);
		head2 = list.insert(7, head2);
		head2 = list.insert(13, head2);

		System.out.println("\nItems Present in Sorted LinkedList 1 : 3 8 13");
		list.printLinkedList(head1);

		System.out.println("\n\nItems Present in Sorted LinkedList 2 : 4 14");
		list.printLinkedList(head2);

		Node firstCommonIntersectionNode = list.findLowestCommonElementInTwoLinkedList(head1, head2);

		System.out.println("\n\nLowest Common Element Present in both LinkedList : ");
		System.out.println(firstCommonIntersectionNode.data);

	}
	
	public static void ifThereAreNoCommonElementsBetweenTwoLinkedListReturnNull() {
		MyLinkedList list = new MyLinkedList();

		Node head1 = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("\nInserting Elements in LinkedList 1 : ");
		head1 = list.insert(37, head1);
		head1 = list.insert(8, head1);
		head1 = list.insert(13, head1);
		head1 = list.insert(18, head1);
		head1 = list.insert(9, head1);
		head1 = list.insert(3, head1);
		head1 = list.insert(0, head1);

		Node head2 = null;

		System.out.println("\nInitially LinkedList 2 is Empty : null");
		list.printLinkedList(head2);

		System.out.println("\nInserting Elements in LinkedList 2 : ");
		head2 = list.insert(10, head2);
		head2 = list.insert(14, head2);

		System.out.println("\nItems Present in Sorted LinkedList 1 : 3 8 13");
		list.printLinkedList(head1);

		System.out.println("\n\nItems Present in Sorted LinkedList 2 : 4 14");
		list.printLinkedList(head2);

		Node firstCommonIntersectionNode = list.findLowestCommonElementInTwoLinkedList(head1, head2);

		System.out.println("\n\nLowest Common Element Present in both LinkedList : ");
		System.out.println(firstCommonIntersectionNode);

	}
	
}
