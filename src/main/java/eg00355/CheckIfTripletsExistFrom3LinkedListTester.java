package eg00355;

public class CheckIfTripletsExistFrom3LinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head1 = null;
		Node head2 = null;
		Node head3 = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("Initially LinkedList 2 is Empty : null");
		list.printLinkedList(head2);

		System.out.println("Initially LinkedList 3 is Empty : null");
		list.printLinkedList(head3);

		System.out.println("Inserting Elements in Unsorted LinkedList 1 : ");
		head1 = list.insert(5, head1);
		head1 = list.insert(2, head1);
		head1 = list.insert(9, head1);

		System.out.println("Inserting Elements in Sorted Asc LinkedList 2 : ");
		head2 = list.insert(2, head2);
		head2 = list.insert(3, head2);
		head2 = list.insert(7, head2);

		System.out.println("Inserting Elements in Sorted Desc LinkedList 3 : ");
		head3 = list.insert(12, head3);
		head3 = list.insert(8, head3);
		head3 = list.insert(4, head3);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head1);
		
		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head2);
		
		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head3);

		int targetSum = 13;
		boolean istripletExistForSum = list.isTripletExistForSum(head1, head2, head3, targetSum);

		System.out.println("\n\nIs Triplet Exist for 3 LinkedLists : ");
		System.out.println(istripletExistForSum);

	}

}
// List 1: 5 -> 2 -> 9
// List 2: 3 -> 2 -> 7
// List 3: 8 -> 12 -> 4
// Sum : 13
// Ans : 
// Result List : 2 -> 0 -> 0 -> 0 -> 0
