package eg00804;

public class ReverseLinkedList {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		Node head = null;
		
		head = list.insert(1, head);
		head = list.insert(2, head);
		head = list.insert(3, head);
		head = list.insert(4, head);
		head = list.insert(5, head);
		
		System.out.println("Before : ");
		list.printLinkedList(head);
		
	//	head = list.reverseLinkedListUsingIteration(head);
		head = list.reverseLinkedList(head);
		
		System.out.println("\nAfter : ");
		list.printLinkedList(head);
		
		
		
		
	}

}
