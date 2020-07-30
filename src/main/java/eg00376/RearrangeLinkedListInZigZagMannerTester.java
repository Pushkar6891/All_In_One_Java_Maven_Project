package eg00376;

public class RearrangeLinkedListInZigZagMannerTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head1 = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("Inserting Elements in Sorted LinkedList 1 : ");
		head1 = list.insert(2, head1);
		head1 = list.insert(3, head1);
		head1 = list.insert(5, head1);
		head1 = list.insert(9, head1);
		head1 = list.insert(11, head1);
		head1 = list.insert(12, head1);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head1);

		Node rearrangeLinkedListZigzag = list.rearrangeLinkedListZigzag(head1);

		System.out.println("\nAfter Arranging List in Zig Zag Manner: ");
		list.printLinkedList(rearrangeLinkedListZigzag);

	}

}