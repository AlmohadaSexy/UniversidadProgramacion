package Actividad1;

public class BinaryTree {
	private Node root;
	private int num;

	public BinaryTree() {
		root = null;
	}

	public void insert(int data) {
		if (root == null)
			root = new Node(data, null, null);
		else
			insertRecursive(data, root);
		System.out.println(data + " inserted");
	}

	private void insertRecursive(int data, Node currNode) {
		if (currNode.data == data) {
			System.out.println("ya existe");
			return;
		}

		if (data < currNode.data) {
			if (currNode.left == null) {
				currNode.left = new Node(data, null, null);
				return;
			}

			insertRecursive(data, currNode.left);
		} else if (data > currNode.data) {
			if (currNode.right == null) {
				currNode.right = new Node(data, null, null);
				return;
			}

			insertRecursive(data, currNode.right);
		}
	}

	public int getNumberNodes() {
		num = 0;
		recorrer(root);
		return num;
	}

	/**
	 * Este metodo, al solo recorrer el arbol una vez hacia abajo pasando por todos
	 * los nodos, tendrá una complejidad de O(n), siendo n el numero de nodos que
	 * tiene el arbol.
	 * 
	 * @param curr
	 */
	private void recorrer(Node curr) {
		if (curr == null) {
			return;
		} else {
			num++;
			recorrer(curr.left);
			recorrer(curr.right);
		}
	}

	public String toString() {
		return "DLR " + toStringDLR(root) + "\nLDR " + toStringLDR(root) + "\nLRD " + toStringLRD(root);
	}

	private String toStringLDR(Node root) {
		String result = "";
		if (root == null)
			return "";
		result += toStringLDR(root.getLeft());
		result += root.data + ", ";
		result += toStringLDR(root.getRight());

		return result;
	}

	private String toStringLRD(Node node) {
		String result = "";
		if (node == null)
			return "";
		result += toStringLRD(node.getLeft());
		result += toStringLRD(node.getRight());
		result += node.data + ", ";

		return result;
	}

	private String toStringDLR(Node node) {
		String result = "";
		if (node == null)
			return "";
		result += node.data + ", ";
		result += toStringLRD(node.getLeft());
		result += toStringLRD(node.getRight());

		return result;
	}
}