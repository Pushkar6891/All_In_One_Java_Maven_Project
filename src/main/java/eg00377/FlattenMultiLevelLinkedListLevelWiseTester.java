package eg00377;

public class FlattenMultiLevelLinkedListLevelWiseTester {

	public static void main(String[] args) {

		MyLinkedList a = new MyLinkedList();

		Node root1, root2, root3, root4, root5;

		int arr1[] = new int[] { 1, 2, 3, 4, 5 };
		int arr2[] = new int[] { 6, 7, 8 };
		int arr3[] = new int[] { 9, 10 };
		int arr4[] = new int[] { 11 };
		int arr5[] = new int[] { 12 };

		root1 = a.createListForFlattenLevelwise(arr1);
		root2 = a.createListForFlattenLevelwise(arr2);
		root3 = a.createListForFlattenLevelwise(arr3);
		root4 = a.createListForFlattenLevelwise(arr4);
		root5 = a.createListForFlattenLevelwise(arr5);

		root1.child = root2;
		root1.next.next.next.child = root3;
		root2.next.child = root4;
		root3.child = root5;

		root1 = a.flattenEasyForFlattenLevelwise(root1);
		a.printLinkedList(root1);

	}

}