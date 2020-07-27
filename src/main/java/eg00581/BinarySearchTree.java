package eg00581;

public class BinarySearchTree {

	public Node node;

	public BinarySearchTree() {
	}

	public BinarySearchTree(int data) {
		this.node = new Node(data);
	}

	public Node insert(Node node, int data) {
		if (node == null) {
			return new Node(data);
		}

		if (data < node.data) {
			node.left = insert(node.left, data);
		} else if (data > node.data) {
			node.right = insert(node.right, data);
		}
		return node;
	}

	public void inOrderTraversal(Node node) {
		if (node != null) {
			inOrderTraversal(node.left);
			System.out.print(node.data + " ");
			inOrderTraversal(node.right);
		}
	}
	
	public void preOrderTraversal(Node node) {
		if (node != null) {
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
			System.out.print(node.data + " ");
		}
	}
	
	public void postOrderTraversal(Node node) {
		if (node != null) {
			System.out.print(node.data + " ");
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
		}
	}

	class Node {
		private int data;
		private Node left;
		private Node right;

		public Node() {
		}

		public Node(int data) {
			super();
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}
}
