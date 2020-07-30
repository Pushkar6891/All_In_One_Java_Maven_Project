package eg00373;

public class CloneLinkedListWithNextAndRandomPointerUsingInPlUsingHashMapTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node head = list.createNewNodeWithRandomPointer(1);
		head.next = list.createNewNodeWithRandomPointer(2);
		head.next.next = list.createNewNodeWithRandomPointer(3);
		head.next.next.next = list.createNewNodeWithRandomPointer(4);
		head.next.next.next.next = list.createNewNodeWithRandomPointer(5);

		head.random = head.next.next;
		head.next.random = head;
		head.next.next.random = head.next.next.next.next;
		head.next.next.next.random = head.next.next.next.next;
		head.next.next.next.next.random = head.next;

		System.out.println("\nItems Present in LinkedList : ");
		list.printLinkedList(head);

		Node cloneUsingCloneMethod = list.clone(head);
		Node cloneUsingHashMap = list.cloneUsingHashmap(head);

		System.out.println("\nItems Present in LinkedList Cloned using clone : ");
		list.printLinkedList(cloneUsingCloneMethod);

		System.out.println("\nItems Present in LinkedList Cloned using HashMap : ");
		list.printLinkedList(cloneUsingHashMap);
	}

}