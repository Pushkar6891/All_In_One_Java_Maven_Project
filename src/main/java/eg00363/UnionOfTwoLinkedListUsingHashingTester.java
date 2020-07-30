package eg00363;

public class UnionOfTwoLinkedListUsingHashingTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head1 = null;
		Node head2 = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("Initially LinkedList 2 is Empty : null");
		list.printLinkedList(head2);

		System.out.println("Inserting Elements in Unsorted LinkedList 1 : ");
		head1 = list.insert(22, head1);
		head1 = list.insert(3, head1);
		head1 = list.insert(10, head1);
		head1 = list.insert(3, head1);
		head1 = list.insert(13, head1);

		System.out.println("Inserting Elements in Unsorted LinkedList 2 : ");
		head2 = list.insert(2, head2);
		head2 = list.insert(13, head2);
		head2 = list.insert(10, head2);
		head2 = list.insert(27, head2);
		head2 = list.insert(36, head2);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head1);

		System.out.println("\n\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head2);

		Node unionOfTwoLinkedListUsingHashing = list.getUnionOfTwoLinkedListUsingHashing(head1, head2);

		System.out.println("\n\nUnion of 2 LinkedLists Using Hashing : ");
		list.printLinkedList(unionOfTwoLinkedListUsingHashing);

	}

}
// List 1 : 22 -> 3  -> 10 -> 3  -> 13
// List 2 : 2  -> 13 -> 10 -> 27 -> 36
// Union List : 22 -> 3 -> 10 -> 13 -> 2 -> 27 -> 36