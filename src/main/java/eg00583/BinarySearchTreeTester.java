package eg00583;

public class BinarySearchTreeTester {

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		Node root = null;
		// Insert element in tree
		// 8,3,6,10,4,7,1,14,13
		root = binarySearchTree.insert(root, 8);
		root = binarySearchTree.insert(root, 3);
		root = binarySearchTree.insert(root, 6);
		root = binarySearchTree.insert(root, 10);
		root = binarySearchTree.insert(root, 4);
		root = binarySearchTree.insert(root, 7);
		root = binarySearchTree.insert(root, 1);
		root = binarySearchTree.insert(root, 14);
		root = binarySearchTree.insert(root, 13);

		Node parentNode = binarySearchTree.getParentNode(root, 14);
		if (parentNode != null) {
			System.out.println(parentNode.data);
		} else {
			System.out.println("Parent does not exist");
		}

	}

}
// Binary Search Tree
//				8
//		3				10
//	1		6				14
//		4		7		13
