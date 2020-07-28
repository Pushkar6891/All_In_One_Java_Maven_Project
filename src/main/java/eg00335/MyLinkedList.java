package eg00335;

import java.util.HashMap;
import java.util.Map;

public class MyLinkedList {

	// 1. Creating a new Node
	private Node getNewNode(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		return node;
	}

	// 2. Print LinkedList Recursively
	public void printLinkedList(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		printLinkedList(node.next);
	}

	// 3. Insert at end
	public Node insert(int data, Node node) {
		if (node == null) {
			// create a new node
			return getNewNode(data);
		} else {
			node.next = insert(data, node.next);
		}
		return node;
	}

	// 4. Insert at front / start / beginning
	public Node insertAtFront(int data, Node node) {

		Node newNode = getNewNode(data);
		newNode.next = node;

		return newNode;
	}

	// 5. Insert at given postion
	public Node insertAtPosition(int data, int position, Node node) {
		if (position < 1) {
			System.out.println("Position cannot be less than 1");
			return node;
		}
		if (node == null && position > 1) {
			System.out.println("Position is greater than no. of elements exist");
			return node;
		}
		if (node == null && position == 1) {
			return getNewNode(data);
		}
		if (position == 1) {
			Node newNode = getNewNode(data);
			newNode.next = node;
			return newNode;
		}
		// recursively call position-1
		node.next = insertAtPosition(data, position - 1, node.next);
		return node;
	}

	// 6. Insert at rear / end
	public void insertAtRear(int data, Node node) {
		insert(data, node);
	}

	// 7. Delete at Front
	public Node deleteAtFront(Node node) {
		// If LinkedList is Empty
		if (node == null) {
			return node;
		}
		return node.next;
	}

	// 8. Delete at given position
	public Node deleteAtPosition(int position, Node node) {
		if (position < 0) {
			System.out.println("Invalid Position");
			return node;
		}
		if (node == null && position > 1) {
			System.out.println("Position is greater than no. of elements exist");
			return node;
		}
		if (position == 1) {
			return node.next;
		}
		// recursively call position-1
		node.next = deleteAtPosition(position - 1, node.next);
		return node;
	}

	// 9. Delete at rear / end
	public Node deleteAtRear(Node node) {
		// If LinkedList is Empty
		if (node == null || node.next == null) {
			return node;
		}

		Node tempNode = node;

		while (tempNode.next.next != null) {
			tempNode = tempNode.next;
		}

		tempNode.next = null;
		return node;
	}

	// 10. Get Size of LinkedList
	public int getSizeOfLinkedList(Node node) {
		if (node == null) {
			return 0;
		}
		return getSizeOfLinkedList(node.next) + 1;
	}

	// 11. Search node in LinkedList
	public boolean searchNode(int data, Node node) {
		return ifNodeExists(data, node);
	}

	public boolean ifNodeExists(int data, Node node) {
		// If LinkedList is Empty
		if (node == null) {
			return false;
		}

		while (node != null) {
			if (node.data == data) {
				return true;
			}
			node = node.next;
		}
		return false;
	}

	// 12. Rotate LinkedList Clockwise
	public Node rotateLinkedListClockwise(int k, Node node) {
		if (node == null || k < 0) {
			return node;
		}

		int n = getSizeOfLinkedList(node);
		k = k % n;

		if (k == 0) {
			return node;
		}

		Node tempNode1 = node;
		int i = 1;

		while (i < n - k) {
			tempNode1 = tempNode1.next;
			i++;
		}

		Node tempNode2 = tempNode1.next;
		Node head = tempNode2;
		tempNode1.next = null;

		while (tempNode2.next != null) {
			tempNode2 = tempNode2.next;
		}

		tempNode2.next = node;

		return head;
	}

	// 13. Rotate LinkedList Anti Clockwise
	public Node rotateLinkedListAntiClockwise(int k, Node node) {
		if (node == null || k < 0) {
			return node;
		}

		int n = getSizeOfLinkedList(node);
		k = k % n;

		if (k == 0) {
			return node;
		}

		Node tempNode1 = node;

		int i = 1;
		while (i < k) {
			tempNode1 = tempNode1.next;
			i++;
		}

		Node tempNode2 = tempNode1.next;
		Node head = tempNode2;
		tempNode1.next = null;

		while (tempNode2.next != null) {
			tempNode2 = tempNode2.next;
		}

		tempNode2.next = node;

		return head;
	}

	// 14. Reverse LinkedList using Recursion
	public Node reverseLinkedListUsingRecursion(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node tempNode = reverseLinkedListUsingRecursion(node.next);
		node.next.next = node;
		node.next = null;
		return tempNode;
	}

	// 15. Find Middle Node
	public Node getMiddleNode(Node node) {
		if (node == null) {
			return node;
		}

		Node a = node;
		Node b = node.next;

		while (b != null && b.next != null) {
			a = a.next;
			b = b.next.next;
		}
		return a;
	}

	// 16. Sort LinkedList Using Merge Sort
	public Node mergeSort(Node node) {
		// If zero or one elements in LinkedList
		if (node == null || node.next == null) {
			return node;
		}

		Node middle = getMiddleNode(node);
		Node secondHalf = middle.next;
		middle.next = null;

		return merge(mergeSort(node), mergeSort(secondHalf));
	}

	public Node merge(Node a, Node b) {
		Node tempNode = new Node();
		Node finalList = tempNode;

		while (a != null && b != null) {
// 1. If we want duplicates in Sorted Linked List uncomment below logic		
//			if (a.data < b.data) {
//				tempNode.next = a;
//				a = a.next;
//			} else {
//				tempNode.next = b;
//				b = b.next;
//			}

// 2. If we do not want duplicates in Sorted Linked List add another else if check
			if (a.data < b.data) {
				tempNode.next = a;
				a = a.next;
			} else if (a.data > b.data) {
				tempNode.next = b;
				b = b.next;
			} else if (a.data == b.data) {
				tempNode.next = a;
				a = a.next;
				b = b.next;
			}
			tempNode = tempNode.next;
		}
		tempNode.next = (a == null) ? b : a;
		return finalList.next;
	}

	// This will merge Two Unsorted List
	public Node mergeList(Node a, Node b) {
		return merge(mergeSort(a), mergeSort(b));
	}

	// This will merge Two Sorted List
	public Node mergeSortedList(Node a, Node b) {
		return merge(a, b);
	}

	// 17. Get Union Set of Two LinkedList
	public Node getUnionOfTwoLinkedList(Node a, Node b) {
		a = mergeSort(a);
		b = mergeSort(b);
		return mergeWithUnion(a, b);
	}

	public Node mergeWithUnion(Node a, Node b) {
		Node tempNode = new Node();
		Node finalList = tempNode;

		while (a != null && b != null) {
// 1. If we want duplicates in Sorted Linked List uncomment below logic		
//			if (a.data < b.data) {
//				tempNode.next = a;
//				a = a.next;
//			} else {
//				tempNode.next = b;
//				b = b.next;
//			}

// 2. If we do not want duplicates in Sorted Linked List add another else if check
			if (a.data < b.data) {
				tempNode.next = a;
				a = a.next;
			} else if (a.data > b.data) {
				tempNode.next = b;
				b = b.next;
			} else if (a.data == b.data) {
				tempNode.next = a;
				a = a.next;
				b = b.next;
			}
			tempNode = tempNode.next;
		}
		tempNode.next = (a == null) ? b : a;
		return finalList.next;
	}

	// 18. Get Intersection Set of Two LinkedList
	public Node getIntersectionOfTwoLinkedList(Node a, Node b) {
		a = mergeSort(a);
		b = mergeSort(b);
		return mergeWithIntersection(a, b);
	}

	public Node mergeWithIntersection(Node a, Node b) {
		Node tempNode = new Node();
		Node finalList = tempNode;

		while (a != null && b != null) {
// 1. If we want duplicates in Sorted Linked List uncomment below logic		
//			if (a.data < b.data) {
//				tempNode.next = a;
//				a = a.next;
//			} else {
//				tempNode.next = b;
//				b = b.next;
//			}

// 2. If we do not want duplicates in Sorted Linked List add another else if check
			if (a.data < b.data) {
				a = a.next;
			} else if (a.data > b.data) {
				b = b.next;
			} else if (a.data == b.data) {
				tempNode.next = a;
				tempNode = tempNode.next;
				a = a.next;
				b = b.next;
			}
		}
		tempNode.next = null;
		return finalList.next;
	}

	// 19. Find Common Elements In Two Linked List
	public Node findLowestCommonElementInTwoLinkedList(Node a, Node b) {
		a = mergeSort(a);
		b = mergeSort(b);
		Node tempNode;
		while (a != null && b != null) {
// 2. If we do not want duplicates in Sorted Linked List add another else if check
			if (a.data < b.data) {
				a = a.next;
			} else if (a.data > b.data) {
				b = b.next;
			} else {
				tempNode = a;
				tempNode.next = null;
				return tempNode;
			}
		}
		return null;
	}

	// 20. Remove Duplicates from Sorted Linked List
	public Node removeDuplicatesFromSortedLinkedList(Node node) {
		// If zero or one elements in LinkedList
		if (node == null || node.next == null) {
			return node;
		}

		if (node.data == node.next.data) {
			node.next = node.next.next;
			removeDuplicatesFromSortedLinkedList(node);
		} else {
			removeDuplicatesFromSortedLinkedList(node.next);
		}

		return node;
	}

	// 21. Remove Duplicates from Unsorted Linked List, First sort LinkedList
	// then call method removeDuplicatesFromSortedLinkedList(node)
	public Node removeDuplicatesFromUnsortedLinkedListBySortingFirst(Node node) {
		// If zero or one elements in LinkedList
		if (node == null || node.next == null) {
			return node;
		}

		node = mergeSort(node);
		return removeDuplicatesFromSortedLinkedList(node);
	}

	// 22. Delete N Nodes after M nodes
	// When list is null
	// When n and m are greater than 0
	// When m=0 (Delete after No traversing)
	// When n=0 (Delete o element)
	public Node deleteNNodesAfterMNodes(int n, int m, Node node) {
		// If zero or one elements in LinkedList
		if (node == null || node.next == null) {
			return node;
		}

		Node tempNode1 = node;
		Node tempNode2 = node;
		int i = 0;
		int j = 0;

		while (i++ < m - 1) {
			tempNode1 = tempNode1.next;
		}

		tempNode2 = (m == 0) ? tempNode1 : tempNode1.next;

		while (j++ < n) {
			if (tempNode2 == null) {
				System.out.println("Not enough elements to delete");
				return node;
			}
			tempNode2 = tempNode2.next;
		}

		if (m == 0) {
			return tempNode2;
		} else {
			tempNode1.next = tempNode2;
		}
		return node;
	}

	// 23. flatten() method is used to flat the complex Linked List
	public Node flatten(Node node) {
		if (node == null || node.right == null) {
			return node;
		}
		return merge(node, flatten(node.right));
	}

	// 24. Remove Duplicates From Unsorted LinkedList Using HashMap
	public Node removeDuplicatesFromUnsortedLinkedListUsingHashMap(Node node) {
		if (node == null) {
			return node;
		}

		Map<Integer, Integer> map = new HashMap<>();

		Node head = node;
		Node previousNode = null;

		while (node != null) {
			int key = node.data;
			if (!map.containsKey(key)) {
				map.put(key, 1);
				previousNode = node;
				node = node.next;
			} else {
				previousNode.next = node.next;
				node = node.next;
			}
		}
		return head;
	}

	// 25. Get Kth node from Start of Linked List
	// Complexity : O(n)
	public int getKthNodeFromStartInLinkedList(Node node, int k) {
		if (node == null) {
			System.out.println("LinkedList is Empty");
			return -1;
		}

		for (int i = 1; i < k; i++) {
			node = node.next;
			if (node == null) {
				System.out.println("k is greater than total number of nodes present in LinkedList");
				return -1;
			}
		}

		int kThNode = node.data;

		return kThNode;

	}

	// 26. Get Kth node from End of Linked List By Reverse a LinkedList O(n)
	// Complexity : O(n+n)
	// This is Bad Approach
	public int getKthNodeFromEndInLinkedListByReversing(Node node, int k) {
		Node reversedNode = reverseLinkedListUsingRecursion(node);
		return getKthNodeFromStartInLinkedList(reversedNode, k);
	}

	// 27. Get Kth node from End of Linked List By find total no of elements
	// Complexity : O(n)
	// This is Bad Approach
	public int getKthNodeFromEndInLinkedList(Node node, int k) {
		if (node == null) {
			System.out.println("LinkedList is Empty");
			return -1;
		}

		Node ptr1, ptr2;
		ptr1 = ptr2 = node;
		for (int i = 1; i < k; i++) {
			ptr2 = ptr2.next;
			if (ptr2 == null) {
				System.out.println("k is greater than total node present in list");
				return -1;
			}
		}

		while (ptr2.next != null) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}

		return ptr1.data;
	}

	// 28. Check if Loop is present in LinkedList
	public boolean ifLoopPresent(Node node) {
		if (node == null) {
			System.out.println("LinkedList is Empty");
			return false;
		}

		Node slowPointer = node;
		Node fastPointer = node;

		while (fastPointer.next != null && fastPointer.next.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if (slowPointer.data == fastPointer.data) {
				return true;
			}
		}
		return false;
	}

	// 29. Find Length of Loop
	public int getLengthOfLoop(Node head) {
		if (head == null) {
			System.out.println("LinkedList is Empty");
			return -1;
		}

		Node slowPointer = head;
		Node fastPointer = head;
		int lengthOfLoop = 0;

		while (fastPointer.next != null && fastPointer.next.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if (slowPointer.data == fastPointer.data) {
				break;
			}
		}

		if (slowPointer == fastPointer) {
			while (slowPointer.next != fastPointer) {
				slowPointer = slowPointer.next;
				lengthOfLoop++;
			}
			lengthOfLoop++;
		}
		return lengthOfLoop;
	}

	// 30. Detect and Remove Loop in LinkedList
	// Complexity : O(n+n)
	public void detectAndRemoveLoopPresent(Node head) {
		if (head == null) {
			System.out.println("LinkedList is Empty");
			return;
		}

		Node slowPointer = head;
		Node fastPointer = head;

		while (fastPointer.next != null && fastPointer.next.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if (slowPointer.data == fastPointer.data) {
				break;
			}
		}

		if (slowPointer == fastPointer) {
			if (fastPointer == head) {
				while (slowPointer.next != fastPointer) {
					slowPointer = slowPointer.next;
				}
				slowPointer.next = null;
			} else {
				slowPointer = head;
				while (slowPointer.next != fastPointer.next) {
					slowPointer = slowPointer.next;
				}
				fastPointer.next = null;
			}
		}
		return;
	}

	// 31. Delete Middle Node in LinkedList
	public Node deleteMiddleNodeInLinkedList(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node slowPointer = node;
		Node fastPointer = node;
		Node previousPointer = node;

		while (fastPointer != null && fastPointer.next != null) {
			previousPointer = slowPointer;
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}

		previousPointer.next = slowPointer.next;
		return node;
	}

}
