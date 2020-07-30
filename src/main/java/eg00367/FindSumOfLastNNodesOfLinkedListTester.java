package eg00367;

public class FindSumOfLastNNodesOfLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head1 = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head1);

		System.out.println("Inserting Elements in Unsorted LinkedList 1 : ");
		head1 = list.insert(22, head1);
		head1 = list.insert(3, head1);
		head1 = list.insert(10, head1);
		head1 = list.insert(13, head1);
		head1 = list.insert(23, head1);
		head1 = list.insert(6, head1);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head1);
		
		int N = 2;
		int sumOfNodes = list.getSumOfLastNNodes(head1,N);

		System.out.println("\n\nSum of Last N nodes of LinkedLists : ");
		System.out.println(sumOfNodes);
	}

}