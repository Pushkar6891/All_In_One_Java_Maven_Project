package eg00581;

import java.util.Arrays;

public class BinarySearchTreeDemo {

	public static void main(String[] args) {

		int[] arr = { 100, 10, 20, 30, 120, 110, 105 };
		System.out.println(Arrays.toString(arr));
		BinarySearchTree bst = new BinarySearchTree(arr[0]);
		for (int data : arr) {
			bst.insert(bst.node, data);
		}

		System.out.println("Inorder: ");
		bst.inOrderTraversal(bst.node);
		System.out.println("\nPostorder: ");
		bst.preOrderTraversal(bst.node);
		System.out.println("\nPreorder: ");
		bst.postOrderTraversal(bst.node);
	}

}

// Binary Tree Traversal Techniques
// Inorder : L R' R
// Predorder : R' L R
// Postorder : R L R'
// Binary Search Tree has unique elements

//https://www.youtube.com/watch?v=nC7NWf1SnG4&list=PLzS3AYzXBoj92iF3moTjy2JsPlyhskjXY&index=8