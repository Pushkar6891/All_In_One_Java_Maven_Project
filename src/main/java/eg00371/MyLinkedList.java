package eg00371;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class MyLinkedList {

	// 1. Creating a new Node
	public Node getNewNode(int data) {
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

	// 32. Check if First and Second Half Matches in LinkedList
	// Complexity : O(n+n)
	public boolean ifFirstAndSecondHalfMatching(Node node) {
		if (node == null || node.next == null) {
			return true;
		}

		Node slowPointer = node;
		Node fastPointer = node;

		while (fastPointer.next != null && fastPointer.next.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}

		Node secondHalf = slowPointer.next;

		while (secondHalf != null) {
			if (node.data != secondHalf.data) {
				return false;
			}
			node = node.next;
			secondHalf = secondHalf.next;
		}
		return true;
	}

	// 33. Check if LinkedList is Palindrome
	public boolean ifPalindromeLinkedList(Node node) {
		if (node == null || node.next == null) {
			return true;
		}

		Node slowPointer = node;
		Node fastPointer = node;

		// Create a Stack to store slowPointer
		Stack<Node> stack = new Stack<>();
		stack.push(slowPointer);

		// Push first half into stack
		while (fastPointer.next != null && fastPointer.next.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;

			stack.push(slowPointer);
		}

		// odd nodes
		if (fastPointer.next == null) {
			stack.pop();
		}

		Node secondHalf = slowPointer.next;

		while (secondHalf != null) {
			if (stack.pop().data != secondHalf.data) {
				return false;
			}

			secondHalf = secondHalf.next;
		}
		return true;
	}

	// 34. Delete the LinkedList
	// Time Complexity : O(1)
	public Node deleteLinkedList(Node node) {
		// point linkedlist head to null and garbage collector will delete other nodes
		node = null;
		return node;
	}

	// 35. Delete Nodes which have greater values on RHS
	// Complexity : O(n)
	public Node deleteGreaterValuesOnRight(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		// 1. First Reverse the LinkedList
		Node reverse = reverseLinkedListUsingRecursion(node);
		Node tempNode = reverse;
		int max = tempNode.data;

		while (tempNode.next != null) {
			if (tempNode.next.data > max) {
				max = tempNode.next.data;
				tempNode = tempNode.next;
			} else {
				tempNode.next = tempNode.next.next;
			}
		}
		node = reverseLinkedListUsingRecursion(reverse);
		return node;
	}

	// 36. Are two LinkedList identical
	public boolean ifIdentical(Node node1, Node node2) {
		while (node1 != null && node2 != null) {
			if (node1.data != node2.data) {
				return false;
			}

			node1 = node1.next;
			node2 = node2.next;
		}

		if (node1 == null && node2 == null) {
			return true;
		} else {
			return false;
		}
	}

	// 37. Pairwise Swap Elements / Swap Alternate elements
	public Node swapAlternateElements(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node head = node;

		while (node != null && node.next != null) {
			// Swapping Elements
			int tempNode = node.data;
			node.data = node.next.data;
			node.next.data = tempNode;

			node = node.next.next;
		}
		return head;
	}

	// 38. Delete Alternate Nodes / Delete Alternate Elements
	public Node deleteAlternateNode(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node head = node;

		// jump by 2 nodes rather than 1
		while (node != null && node.next != null) {
			node.next = node.next.next;
			node = node.next;
		}
		return head;
	}

	// 39. Move Last Node to Front
	public Node moveLastNodeToFront(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node head = node;

		while (node.next.next != null) {
			node = node.next;
		}

		node.next.next = head;
		head = node.next;

		node.next = null;
		return head;
	}

	// 40. Get Count of value
	// Complexity : O(n)
	public int getCountOfValue(Node node, int value) {
		if (node == null) {
			return -1;
		}

		int count = 0;

		while (node != null) {
			if (node.data == value) {
				count++;
			}

			node = node.next;
		}
		return count;
	}

	// 41. Swap Nodes of given value without swapping in LinkedList
	public Node swapNodes(Node node, int a, int b) {
		if (node == null || node.next == null) {
			return node;
		}

		Node t1 = null;
		Node t2 = null;
		Node head = null;
		Node prev1 = null;
		Node prev2 = null;

		head = node;

		while (node != null) {
			if (node.data == a) {
				t1 = node;
				break;
			}
			prev1 = node;
			node = node.next;
		}

		node = head;

		while (node != null) {
			if (node.data == b) {
				t2 = node;
				break;
			}
			prev2 = node;
			node = node.next;
		}

		if (t1 == null || t2 == null) {
			return head;
		}

		if (prev1 != null) {
			prev1.next = t2;
		} else {
			head = t2;
		}

		if (prev2 != null) {
			prev2.next = t1;
		} else {
			head = t1;
		}

		Node tempNode = t1.next;
		t1.next = t2.next;
		t2.next = tempNode;

		return head;
	}

	// 42. Intersection of LinkedList
	// Complexity : O(n)
	public int getIntersectionOfLists(Node node1, Node node2) {
		if (node1 == null || node2 == null) {
			return -1;
		}

		Node head1 = node1, head2 = node2;

		int count1 = 0, count2 = 0;

		// Count No. of Elements in LinkedList 1
		while (node1 != null) {
			count1++;
			node1 = node1.next;
		}

		// Count No. of Elements in LinkedList 2
		while (node2 != null) {
			count2++;
			node2 = node2.next;
		}

		// Difference in count
		int v = count1 - count2;

		// if difference is greater than 0, List 1 is Longer
		while (v > 0) {
			head1 = head1.next;
			v--;
		}

		// if difference is lesser than 0, List 2 is Longer
		while (v < 0) {
			head2 = head2.next;
			v++;
		}

		// traverse both list1 and list2
		while (head1 != null && head2 != null) {
			if (head1.data == head2.data) {
				return head1.data;
			}

			head1 = head1.next;
			head2 = head2.next;
		}

		return -1;
	}

	// 43. Reverse LinkedList using Iteration
	// Complexity : O(n)
	public Node reverseLinkedListUsingIteration(Node node) {
		// Single Node
		if (node == null || node.next == null) {
			return node;
		}

		Node previous = null;
		Node next = null;

		while (node != null) {
			next = node.next;
			node.next = previous;
			previous = node;
			node = next;
		}
		return previous;
	}

	// 44. Reverse LinkedList in Group of K
	// Complexity : O(n)
	public Node reverseLinkedListInGroupOfK(Node head, int k) {
		Node prev, next;
		prev = next = null;

		Node node = head;

		int i = 0;

		while (node != null && i < k) {
			next = node.next;
			node.next = prev;
			prev = node;
			node = next;
			i++;
		}

		if (next != null) {
			head.next = reverseLinkedListInGroupOfK(next, k);
		}

		return prev;
	}

	// 45. Reverse LinkedList Alternatively in Group of K
	// Complexity : O(n)
	public Node reverseAlternativelyInGroup(Node head, int k) {
		if (k <= 1 || head == null || head.next == null) {
			return head;
		}
		Node prev, next;
		prev = next = null;

		Node node = head;

		int i = 0;

		while (node != null && i < k) {
			next = node.next;
			node.next = prev;
			prev = node;
			node = next;
			i++;
		}

		i = 0;
		if (next != null) {
			head.next = next;
			node = next;
			while (node != null && i < k - 1) {
				node = node.next;
				i++;
			}
			if (node != null) {
				node.next = reverseAlternativelyInGroup(node.next, k);
			}
		}

		return prev;
	}

	// 46. Separate Odd and Even Nodes
	// Complexity : O(n)
	public Node seperateOddEven(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node evenStartingNode, evenEndNode, oddStartingNode, oddEndNode;

		evenStartingNode = evenEndNode = oddStartingNode = oddEndNode = null;

		while (node != null) {
			if (node.data % 2 == 0) {
				if (evenStartingNode == null) {
					evenStartingNode = node;
					evenEndNode = evenStartingNode;
				} else {
					evenEndNode.next = node;
					evenEndNode = evenEndNode.next;
				}
			} else {
				if (oddStartingNode == null) {
					oddStartingNode = node;
					oddEndNode = oddStartingNode;
				} else {
					oddEndNode.next = node;
					oddEndNode = oddEndNode.next;
				}
			}

			node = node.next;
		}

		evenEndNode.next = oddStartingNode;
		oddEndNode.next = null;
		return evenStartingNode;
	}

	// 47. Split LinkedList Alternatively
	// Complexity : O(n)
	public Node[] alternateSplit(Node node) {
		Node firstHead = null;
		Node secondHead = null;

		Node[] nodes = new Node[2];
		nodes[0] = new Node();
		nodes[1] = new Node();

		if (node == null || node.next == null) {
			return nodes;
		}

		Node firstTemp;
		Node secondTemp;

		firstHead = firstTemp = node;
		secondHead = secondTemp = node.next;
		node = node.next.next;

		while (node != null && node.next != null) {
			firstTemp.next = node;
			secondTemp.next = node.next;

			firstTemp = firstTemp.next;
			secondTemp = secondTemp.next;

			node = node.next.next;
		}

		if (node != null) {
			firstTemp.next = node;
			firstTemp = firstTemp.next;
		}

		firstTemp.next = null;
		secondTemp.next = null;

		nodes[0] = firstHead;
		nodes[1] = secondHead;
		return nodes;
	}

	// 48. Swap Alternate Nodes / Swap Nodes Pairwise by calling existing function
	// which Reverses in Group of K
	public Node swapNodesPairwise(Node node) {
		int k = 2;
		return reverseLinkedListInGroupOfK(node, k);
	}

	// 49. Merge Two LinkedListAlternatively
	public Node[] mergeTwoLinkedListAlternatively(Node node1, Node node2) {
		Node node1next, node2next;
		Node firstHead = node1;
		Node secondHead = node2;

		Node[] nodes = new Node[2];
		nodes[0] = new Node();
		nodes[1] = new Node();

		while (node1 != null && node2 != null) {
			node1next = node1.next;
			node1.next = node2;
			node1 = node1next;

			node2next = node2.next;
			node2.next = node1next;
			node2 = node2next;
		}

		secondHead = node2;

		nodes[0] = firstHead;
		nodes[1] = secondHead;

		return nodes;
	}

	// 50. Sort List of 0, 1, 2
	public Node sortListOfZeroesOnesTwos(Node node) {

		if (node == null || node.next == null) {
			return node;
		}

		Node head = node;

		int count_0, count_1, count_2;

		count_0 = count_1 = count_2 = 0;

		while (node != null) {
			if (node.data == 0) {
				count_0++;
			} else if (node.data == 1) {
				count_1++;
			} else {
				count_2++;
			}

			node = node.next;
		}

		node = head;

		while (count_0 > 0) {
			node.data = 0;
			node = node.next;
			count_0--;
		}

		while (count_1 > 0) {
			node.data = 1;
			node = node.next;
			count_1--;
		}

		while (count_2 > 0) {
			node.data = 2;
			node = node.next;
			count_2--;
		}

		return head;
	}

	// 51. Add 1 to a number in LinkedList
	// Complexity : O(n)
	public Node addOne(Node node) {
		int c = addOneToLinkedList(node);

		if (c == 1) {
			Node head = this.getNewNode(1);
			head.next = node;
			return head;
		}
		return node;
	}

	public int addOneToLinkedList(Node node) {
		if (node == null) {
			return 1;
		}

		int res = node.data + addOneToLinkedList(node.next);

		node.data = res % 10;

		return res / 10;
	}

	// 52. Check if Triplets Exist in 3 Unsorted Linked List
	public boolean isTripletExistForSum(Node node1, Node node2, Node node3, int val) {

		Node head2, head3;
		head2 = node2;
		head3 = node3;

		while (node1 != null) {
			while (node2 != null && node3 != null) {

				int s = node1.data + node2.data + node3.data;

				if (s == val) {
					System.out.println("\n\nTriplet : " + node1.data + " " + node2.data + " " + node3.data);
					return true;
				} else if (s > val) {
					node3 = node3.next;
				} else {
					node2 = node2.next;
				}
			}

			node1 = node1.next;
			node2 = head2;
			node3 = head3;
		}

		return false;
	}

	// 53. Add Two Linked List Numbers which are presented as single digit element
	// using reverse
	public Node addTwoNumbersUsingReverse(Node node1, Node node2) {
		node1 = this.reverseLinkedListUsingRecursion(node1);
		node2 = this.reverseLinkedListUsingRecursion(node2);

		Node newListHead = null;
		Node prev = null;
		int sum, c = 0;

		while (node1 != null || node2 != null) {
			sum = c + (node1 != null ? node1.data : 0) + (node2 != null ? node2.data : 0);

			c = sum / 10;

			Node node = getNewNode(sum % 10);
			if (newListHead == null) {
				newListHead = node;
			} else {
				prev.next = node;
			}

			prev = node;

			if (node1 != null) {
				node1 = node1.next;
			}

			if (node2 != null) {
				node2 = node2.next;
			}
		}

		if (c != 0) {
			prev.next = getNewNode(c);
		}

		newListHead = this.reverseLinkedListUsingRecursion(newListHead);

		return newListHead;
	}

	// 54. Subtract Two LinkedList Numbers
	public Node subtractTwoNumbers(Node node1, Node node2) {
		Node head1 = node1;
		Node head2 = node2;

		int count1 = 0, count2 = 0;

		while (node1 != null) {
			node1 = node1.next;
			count1++;
		}

		while (node2 != null) {
			node2 = node2.next;
			count2++;
		}

		node1 = head1;
		node2 = head2;

		if ((count1 < count2) || (count1 == count2 && node2 == getBiggerList(node1, node2))) {
			Node t = node1;
			node1 = node2;
			node2 = t;
		}

		node1 = this.reverse(node1);
		node2 = this.reverse(node2);

		Node newListHead = null;
		Node prev = null;
		int diff;
		boolean borrow = false;

		while (node1 != null || node2 != null) {
			if (borrow) {
				node1.data = node1.data - 1;
				borrow = false;
			}

			if (node1 != null && node2 != null && node1.data < node2.data) {
				node1.data = node1.data + 10;
				borrow = true;
			}

			diff = (node1 != null ? node1.data : 0) - (node2 != null ? node2.data : 0);

			Node node = getNewNode(diff);
			if (newListHead == null) {
				newListHead = node;
			} else {
				prev.next = node;
			}

			prev = node;

			if (node1 != null) {
				node1 = node1.next;
			}

			if (node2 != null) {
				node2 = node2.next;
			}
		}

		newListHead = this.reverse(newListHead);

		return newListHead;
	}

	// It gives the bigger node list
	public Node getBiggerList(Node node1, Node node2) {
		Node head1 = node1;
		Node head2 = node2;
		while (node1 != null) {
			if (node1.data > node2.data) {
				return head1;
			} else if (node1.data < node2.data) {
				return head2;
			}

			node1 = node1.next;
			node2 = node2.next;
		}

		return head1;
	}

	public Node reverse(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node temp = reverse(node.next);
		node.next.next = node;
		node.next = null;

		return temp;
	}

	// 55. Make Middle Node Head
	public Node makeMiddleNodeHead(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node slow, fast, head, prev;
		slow = fast = head = prev = node;

		while (fast.next != null && fast.next.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		prev.next = slow.next;
		slow.next = head;
		head = slow;

		return head;
	}

	// 56. Insert new node in middle node in Linked list
	public Node insertNodeInMiddle(Node node, int val) {
		if (node == null) {
			return node;
		}

		Node slow, fast, head;
		slow = fast = head = node;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Node newNode = getNewNode(val);
		newNode.next = slow.next;
		slow.next = newNode;

		return head;
	}

	// 57. Counts rotations in Sorted & Rotated in Linked list
	public int countRotationInSortedRotatedList(Node node) {
		if (node == null || node.next == null) {
			return 0;
		}

		int count = 0;
		while (node.next != null) {
			if (node.data < node.next.data) {
				count++;
			} else {
				break;
			}

			node = node.next;
		}

		if (node.next == null) {
			return 0;
		} else {
			return count + 1;
		}

	}

	// 58. It merges the k sorted linked lists
	public Node mergeKSortedLists(Node[] arr, int last) {
		while (last != 0) {
			int i = 0;
			int j = last;

			while (i < j) {
				arr[i] = mergeTwoSortedLinkedList(arr[i], arr[j]);

				i++;
				j--;

				if (i >= j) {
					last = j;
					break;
				}
			}
		}

		return arr[0];
	}

	// 59. Merge Two Sorted LinkedList
	public Node mergeTwoSortedLinkedList(Node node1, Node node2) {
		if (node1 == null && node2 == null) {
			return null;
		}

		if (node1 == null || node2 == null) {
			return node1 != null ? node1 : node2;
		}

		return mergeTwoList(node1, node2);
	}

	// 60. Helper function to merge two sorted linked list
	public Node mergeTwoList(Node first, Node second) {
		if (first == null && second == null) {
			return null;
		}

		Node tmp = new Node();
		Node finalList = tmp;
		while (first != null && second != null) {
			if (first.data < second.data) {
				tmp.next = first;
				first = first.next;
			} else {
				tmp.next = second;
				second = second.next;
			}

			tmp = tmp.next;
		}

		tmp.next = (first != null) ? first : second;

		return finalList.next;
	}

	// 61. It returns union of two linked lists
	public Node getUnionOfTwoLinkedListUsingHashing(Node node1, Node node2) {
		if (node1 == null && node2 == null) {
			return null;
		}

		if (node1 == null || node2 == null) {
			return node1 != null ? node1 : node2;
		}

		Set<Integer> s = new HashSet<>();

		Node temp = new Node();
		Node result = temp;

		while (node1 != null) {
			if (!s.contains(node1.data)) {
				temp.next = node1;
				temp = temp.next;
				s.add(node1.data);
			}
			node1 = node1.next;
		}

		while (node2 != null) {
			if (!s.contains(node2.data)) {
				temp.next = node2;
				temp = temp.next;
				s.add(node2.data);
			}
			node2 = node2.next;
		}
		temp.next = null;

		return result.next;
	}

	// 62. It returns intersections of two linked lists
	public Node getIntersectionOfTwoLinkedListUsingHashing(Node node1, Node node2) {
		if (node1 == null || node2 == null) {
			return null;
		}

		Set<Integer> s = new HashSet<>();

		Node temp = new Node();
		Node result = temp;

		while (node1 != null) {
			s.add(node1.data);
			node1 = node1.next;
		}

		while (node2 != null) {
			if (s.contains(node2.data)) {
				temp.next = node2;
				temp = temp.next;
			}
			node2 = node2.next;
		}

		temp.next = null;

		return result.next;
	}

	// 63. It counts sum of pairs in linked list
	public int getSumOfPairs(Node node1, Node node2, int sum) {
		if (node1 == null || node2 == null) {
			return 0;
		}

		HashSet<Integer> s = new HashSet<>();
		int countPairs = 0;

		while (node1 != null) {
			s.add(node1.data);
			node1 = node1.next;
		}

		while (node2 != null) {
			if (s.contains(sum - node2.data)) {
				countPairs++;
			}

			node2 = node2.next;
		}

		return countPairs;
	}

	// 64. It gets sum of nodes in linked list
	// Time Complexity : O(n)
	public int getSumOfNodes(Node node) {
		if (node == null) {
			return 0;
		}

		int sum = 0;
		while (node != null) {
			sum = sum + node.data;
			node = node.next;
		}

		return sum;
	}

	// 65. It gets sum of last n nodes in linked list
	// Time Complexity : O(n)
	public int getSumOfLastNNodes(Node node, int n) {
		if (node == null || n <= 0) {
			return 0;
		}

		int sum = 0;
		Node head = node;

		while (node != null && n > 0) {
			sum = sum + node.data;
			node = node.next;
			n--;
		}

		if (node == null) {
			if (n > 0) {
				System.out.println("N is greater than total nodes");
				return 0;
			} else {
				return sum;
			}
		}

		while (node.next != null) {
			node = node.next;
			head = head.next;
		}

		head = head.next;
		sum = 0;

		while (head != null) {
			sum = sum + head.data;
			head = head.next;
		}

		return sum;
	}

	// 66. It checks if linked list contains even nodes
	public boolean ifEvenNodes(Node node) {
		if (node == null) {
			return true;
		}

		Node temp = node;

		while (temp.next != null && temp.next.next != null) {
			temp = temp.next.next;
		}

		if (temp.next == null) {
			return false;
		} else {
			return true;
		}
	}

	// 67. It removes every Kth node in linked list
	public Node removeEveryKthNode(Node node, int k) {
		if (node == null || k <= 1) {
			return null;
		}

		if (node.next == null && k > 1) {
			System.out.println("Not a valid case");
			return node;
		}

		Node head = node;
		int i = 1;

		while (node != null && node.next != null) {
			if (i % (k - 1) == 0) {
				node.next = node.next.next;
			}

			node = node.next;
			i++;
		}

		return head;
	}

	// 68. It deletes the only given node in linked list
	public void deleteOnlyGivenNode(Node node) {
		if (node == null || node.next == null) {
			return;
		}

		node.data = node.next.data;
		node.next = node.next.next;
	}

	// 69. It deletes the last occurrence of an item in linked list
	public Node deleteLastOccurrenceOfItem(Node node, int val) {
		if (node == null) {
			return null;
		}

		Node head, temp;

		head = node;
		temp = null;

		while (node != null) {
			if (node.data == val) {
				temp = node;
			}

			node = node.next;
		}

		if (temp == null) {
			return head;
		}

		if (temp == head) {
			return head.next;
		}

		if (temp.next == null) {
			node = head;
			while (node.next.next != null) {
				node = node.next;
			}
			node.next = null;
			return head;
		}

		temp.data = temp.next.data;
		temp.next = temp.next.next;

		return head;
	}
}
