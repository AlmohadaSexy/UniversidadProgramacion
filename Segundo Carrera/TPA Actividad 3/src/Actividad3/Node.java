package Actividad3;
public class Node {
	String data;
	Node left;
	Node right;

	Node(String val) {
		this.data = val;
		right = null;
		left = null;
	}

	Node(String val, Node left, Node right) {
		this.data = val;
		this.right = right;
		this.left = left;
	}

	Node getLeft() {
		return left;
	}

	void setLeft(Node left) {
		this.left = left;
	}

	Node getRight() {
		return right;
	}

	void setRight(Node right) {
		this.right = right;
	}
	public String toString() {
		return "[" + data + "]";
	}
}