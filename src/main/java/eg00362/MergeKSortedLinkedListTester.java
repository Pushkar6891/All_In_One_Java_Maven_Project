package eg00362;

public class MergeKSortedLinkedListTester {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		Node arr[] = new Node[5];

		arr[0] = list.getNewNode(1);
		arr[0].next = list.getNewNode(3);
		arr[0].next.next = list.getNewNode(5);
		arr[0].next.next.next = list.getNewNode(7);

		arr[1] = list.getNewNode(2);
		arr[1].next = list.getNewNode(4);
		arr[1].next.next = list.getNewNode(6);
		arr[1].next.next.next = list.getNewNode(8);

		arr[2] = list.getNewNode(0);
		arr[2].next = list.getNewNode(9);
		arr[2].next.next = list.getNewNode(10);
		arr[2].next.next.next = list.getNewNode(11);

		arr[3] = list.getNewNode(12);
		arr[3].next = list.getNewNode(14);
		arr[3].next.next = list.getNewNode(16);
		arr[3].next.next.next = list.getNewNode(18);

		arr[4] = list.getNewNode(0);
		arr[4].next = list.getNewNode(19);
		arr[4].next.next = list.getNewNode(20);
		arr[4].next.next.next = list.getNewNode(31);

		Node mergedList = list.mergeKSortedLists(arr, arr.length - 1);
		list.printLinkedList(mergedList);

	}

}
