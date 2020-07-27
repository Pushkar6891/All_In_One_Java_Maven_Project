package eg00583;

public class BinarySearchTree {

	public Node createNewNode(int k) {
		Node newNode = new Node();
		newNode.data = k;
		newNode.left = null;
		newNode.right = null;
		return newNode;
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

	// leaf with 0,1,2 children
	public Node delete(Node node, int value) {
		if (node == null) {
			return null;
		}
		// recursive call
		if (value < node.data) {
			node.left = delete(node.left, value);
		} else if (value > node.data) {
			node.right = delete(node.right, value);
		} else {
			if (node.left == null || node.right == null) {
				Node tempNode = null;
				tempNode = node.left == null ? node.right : node.left;
				if (tempNode == null)
					return null;
				else
					return tempNode;
			} else {
				Node successor = getSuccessor(node);
				node.data = successor.data;
				node.right = delete(node.right, value);
				return node;
			}
		}
		return node;
	}

	public Node getSuccessor(Node node) {
		if (node == null)
			return null;
		Node tempNode = node.right;
		while (tempNode != null) {
			tempNode = tempNode.left;
		}
		return tempNode;
	}

	public void inOrder(Node node) {
		if (node == null)
			return;

		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}

	public void preOrder(Node node) {
		if (node == null)
			return;

		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void postOrder(Node node) {
		if (node == null)
			return;

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");

	}

	public boolean ifNodePresent(Node node, int value) {
		boolean isPresent = false;

		if (node == null) {
			return false;
		}
		while (node != null) {
			if (value < node.data) {
				node = node.left;
			} else if (value > node.data) {
				node = node.right;
			} else {
				isPresent = true;
				break;
			}
		}
		return isPresent;
	}

	public Node getParentNode(Node node, int value) {
		if (node == null)
			return null;

		Node getParent = null;
		while (node != null) {
			if (value < node.data) {
				getParent = node;
				node = node.left;
			} else if (value > node.data) {
				getParent = node;
				node = node.right;
			} else {
				break;
			}
		}

		if (node != null)
			return getParent;
		else
			return null;
	}
}


