package Actividad3;

public class BinaryTree {

	private Node root;

	public BinaryTree() {
		root = new Node("B");
		root.left = new Node("U");

		root.left.left = new Node("E");
		root.left.left.left = new Node("N");
		root.left.left.left.left = new Node("O");
		root.left.left.left.right = new Node("A");
		root.left.left.left.right.right = new Node("S");

		root.left.right = new Node("R");
		root.left.right.right = new Node("R");
		root.left.right.right.left = new Node("A");
		root.left.right.right.right = new Node("O");
		root.left.right.right.right.left = new Node("S");

		root.right = new Node("I");
		root.right.left = new Node("E");
		root.right.left.left = new Node("N");

		root.right.right = new Node("L");
		root.right.right.left = new Node("B");
		root.right.right.left.left = new Node("A");
		root.right.right.left.left.left = new Node("O");
	}

	public void sacarPalabras() {
		String impr = "";
		recorrer(root, impr);
	}

	private void recorrer(Node curr, String impr) {
		if (curr == null) {
			return;
		} else {
			if (hasNoSon(curr)) {
				impr += curr.data;
				System.out.println(impr);
			} else {
				impr += curr.data;
				recorrer(curr.left, impr);
				recorrer(curr.right, impr);
			}
		}
	}

	private boolean hasNoSon(Node node) {
		if (node.left == null && node.right == null)
			return true;
		return false;
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