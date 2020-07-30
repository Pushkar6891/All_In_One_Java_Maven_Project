package eg00585;

public class CheckIfBSTTester {

	public static void main(String[] args) {

		BinarySearchTree a = new BinarySearchTree();

//      Yes Binary Tree
		Node root = a.createNewNode(12);
		root.left = a.createNewNode(7);
		root.left.left = a.createNewNode(6);
		root.left.left.left = a.createNewNode(2);
		root.left.right = a.createNewNode(9);
		root.left.right.left = a.createNewNode(8);

//		No Binary Tree
//		Node root = a.createNewNode(3);
//		root.left = a.createNewNode(2);
//		root.right = a.createNewNode(5);
//		root.left.left = a.createNewNode(1);
//		root.left.right = a.createNewNode(4);

		System.out.println(a.isTreeBST(root));
	}

}
