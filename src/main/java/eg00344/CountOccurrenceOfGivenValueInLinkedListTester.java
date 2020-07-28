package eg00344;

public class CountOccurrenceOfGivenValueInLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList 1 is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList 1 : ");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(5, head);
		head = list.insert(37, head);
		head = list.insert(5, head);
		head = list.insert(2, head);
		head = list.insert(5, head);

		System.out.println("\nItems Present in LinkedList 1 : ");
		list.printLinkedList(head);

		System.out.println("\n\nGetting count of value : 5 ");
		int totalCount = list.getCountOfValue(head,5);

		System.out.println("\nTotal Count of value 5 : ");
		System.out.println(totalCount);
	}

}
