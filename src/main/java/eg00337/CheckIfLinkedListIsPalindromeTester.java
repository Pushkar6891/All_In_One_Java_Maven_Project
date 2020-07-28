package eg00337;

public class CheckIfLinkedListIsPalindromeTester {

	public static void main(String[] args) {

		oddNodesPalindrome();
		System.out.println("=======================");
		oddNodesNotPalindrome();
		System.out.println("=======================");
		evenNodesPalindrome();
		System.out.println("=======================");
		evenNodesNotPalindrome();
		System.out.println("=======================");
	}

	public static void oddNodesPalindrome() {
		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList : ");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(37, head);
		head = list.insert(99, head);
		head = list.insert(12, head);

		System.out.println("\nItems Present in LinkedList : ");
		list.printLinkedList(head);

		System.out.println("\n\nCheck if LinkedList is Palindrome");
		boolean result = list.ifPalindromeLinkedList(head);

		System.out.println("\nIs LinkedList Palindrome: ");
		System.out.println(result);
	}

	public static void oddNodesNotPalindrome() {
		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList : ");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(37, head);
		head = list.insert(99, head);
		head = list.insert(11, head);

		System.out.println("\nItems Present in LinkedList : ");
		list.printLinkedList(head);

		System.out.println("\n\nCheck if LinkedList is Palindrome");
		boolean result = list.ifPalindromeLinkedList(head);

		System.out.println("\nIs LinkedList Palindrome: ");
		System.out.println(result);
	}

	public static void evenNodesPalindrome() {
		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList : ");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(37, head);
		head = list.insert(37, head);
		head = list.insert(99, head);
		head = list.insert(12, head);

		System.out.println("\nItems Present in LinkedList : ");
		list.printLinkedList(head);

		System.out.println("\n\nCheck if LinkedList is Palindrome");
		boolean result = list.ifPalindromeLinkedList(head);

		System.out.println("\nIs LinkedList Palindrome: ");
		System.out.println(result);
	}

	public static void evenNodesNotPalindrome() {
		MyLinkedList list = new MyLinkedList();

		Node head = null;

		System.out.println("Initially LinkedList is Empty : null");
		list.printLinkedList(head);

		System.out.println("\nInserting Elements in Unsorted LinkedList : ");
		head = list.insert(12, head);
		head = list.insert(99, head);
		head = list.insert(37, head);
		head = list.insert(37, head);
		head = list.insert(99, head);
		head = list.insert(11, head);

		System.out.println("\nItems Present in LinkedList : ");
		list.printLinkedList(head);

		System.out.println("\n\nCheck if LinkedList is Palindrome");
		boolean result = list.ifPalindromeLinkedList(head);

		System.out.println("\nIs LinkedList Palindrome: ");
		System.out.println(result);
	}

}

// List 1 : 12 -> 99 -> 37 -> 99 -> 12
// List 2 : 12 -> 99 -> 37 -> 99 -> 10
// List 3 : 12 -> 99 -> 37 -> 99 -> 12 -> 37
// List 4 : 12 -> 99 -> 37 -> 99 -> 12 -> 30