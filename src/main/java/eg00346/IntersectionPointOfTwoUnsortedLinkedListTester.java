package eg00346;

public class IntersectionPointOfTwoUnsortedLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head1 = null;
		Node head2 = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("Initially LinkedList 2 is Empty : null");
		list.printLinkedList(head2);

		System.out.println("Inserting Elements in Unsorted LinkedList 1 : ");
		head1 = list.insert(1, head1);
		head1 = list.insert(24, head1);
		head1 = list.insert(34, head1);
		head1 = list.insert(9, head1);
		head1 = list.insert(8, head1);
		head1 = list.insert(37, head1);
		head1 = list.insert(5, head1);

		System.out.println("Inserting Elements in Unsorted LinkedList 2 : ");
		head2 = list.insert(12, head2);
		head2 = list.insert(99, head2);
		head2 = list.insert(8, head2);
		head2 = list.insert(37, head2);
		head2 = list.insert(5, head2);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head1);

		System.out.println("\n\nItems Present in LinkedList 2 : ");
		list.printLinkedList(head2);

		System.out.println("\n\nFinding Intersection Point of two LinkedList");
		int intersectionPoint = list.getIntersectionOfLists(head1,head2);

		System.out.println("\nIntersection Point of two LinkedList : ");
		System.out.println(intersectionPoint);
	}

}
