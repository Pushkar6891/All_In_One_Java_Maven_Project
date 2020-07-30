package eg00592;

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

	/*
	 * public Node getSuccessor(Node node) { if (node == null) return null; Node
	 * tempNode = node.right; while (tempNode != null) { tempNode = tempNode.left; }
	 * return tempNode; }
	 */
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

	public Node getSiblingNode(Node node, int value) {
		if (node == null) {
			return null;
		}

		Node parentNode = null;
		while (node != null) {
			if (value < node.data) {
				parentNode = node;
				node = node.left;
			} else if (value > node.data) {
				parentNode = node;
				node = node.right;
			} else {
				break;
			}
		}

		if (parentNode.left != null && value == parentNode.left.data)
			return parentNode.right;
		else if (parentNode.right != null && value == parentNode.right.data)
			return parentNode.left;
		else
			return null;
	}

	// Print Elements in inorder sorted ascending in binary search tree
	public void inorder(Node node) {
		if (node == null) {
			return;
		}

		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}

	// Just get inorder succesor of a given value
	public Node getInorderSuccessor(Node node, int val) {
		if (node == null) {
			return null;
		}

		Node inorderSuccessor = null;

		while (node != null) {
			if (val < node.data) {
				inorderSuccessor = node;
				node = node.left;
			} else if (val > node.data) {
				node = node.right;
			} else {
				if (node.right != null) {
					inorderSuccessor = getSuccessor(node);
				}
				break;
			}
		}
		return node != null ? inorderSuccessor : null;
	}

	public Node getSuccessor(Node node) {
		if (node == null) {
			return null;
		}

		Node temp = node.right;

		while (temp.left != null) {
			temp = temp.left;
		}

		return temp;

	}

	// Complexity : O(n)
	public int getDifferenceEvenOddLevel(Node node) {
		if (node == null) {
			return 0;
		}

		return node.data - getDifferenceEvenOddLevel(node.left) - getDifferenceEvenOddLevel(node.right);
	}

	public int getMax(Node node) {
		if (node == null) {
			System.out.println("Tree is EMpty");
			return -1;
		}

		while (node.right != null) {
			node = node.right;
		}

		return node.data;
	}

	// Complexity : O(n)
	public int getMin(Node node) {
		if (node == null) {
			System.out.println("Tree is EMpty");
			return -1;
		}

		while (node.left != null) {
			node = node.left;
		}

		return node.data;
	}

}