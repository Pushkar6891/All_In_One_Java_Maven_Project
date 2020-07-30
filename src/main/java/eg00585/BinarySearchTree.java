package eg00585;

public class BinarySearchTree {

	Node prev = null;
	
	public Node createNewNode(int data) {
		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;
		return node;
	}

	public Node insert(Node node, int value) {
		if (node == null) {
			return createNewNode(value);
		}

		if (value < node.data) {
			node.left = insert(node.left, value);
		} else if (value > node.data) {
			node.right = insert(node.right, value);
		}
		return node;
	}

	public boolean isTreeBST(Node node) {
		
		if (node == null) {
			return true;
		}

		if (!isTreeBST(node.left)) {
			return false;
		}

		if (prev != null && node.data < prev.data) {
			return false;
		}

		prev = node;

		return isTreeBST(node.right);
	}

}
