package eg00365;

public class CountPairsEqualToGivenSumFromTwoLinkedListTester {

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
		head2 = list.insert(14, head2);
		head2 = list.insert(10, head2);
		head2 = list.insert(27, head2);
		head2 = list.insert(21, head2);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head1);

		System.out.println("\n\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head2);

		int sum = 24;// 22 + 2, 10 + 14, 3 + 21
		int sumOfPairs = list.getSumOfPairs(head1, head2, sum);

		System.out.println("\n\nNo of Pairs equal to given sum in 2 LinkedLists : ");
		System.out.println(sumOfPairs);
	}

}