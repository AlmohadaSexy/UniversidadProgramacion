package Actividad2;

import java.util.ArrayList;

public class BinaryTree {
	ArrayList<Integer> alturas = new ArrayList<Integer>();
	private Node root;

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

	/**
	 * Al igual que el ejercicio anterior, este metodo, al solo recorrer el arbol
	 * una vez hacia abajo pasando por todos los nodos, tendrá una complejidad de
	 * O(n), siendo n el numero de nodos que tiene el arbol. Aunque luego haya que
	 * comparar las alturas, quedaria siendo una complejidad de O(n+m), siendo n un
	 * numero mayor por lo que la complejidad seria de O(n) igualmente.
	 * 
	 * @param curr
	 */
	public int getHeight() {
		recorrer(root, 0);
		int altura = 0;
		for (Integer num : alturas) {
			if (num > altura) {
				altura = num;
			}
		}
		return altura;
	}

	private void recorrer(Node curr, int alt) {
		if (curr == null) {
			return;
		} else {
			if (hasNoSon(curr)) {
				alt++;
				alturas.add(alt);
			} else {
				alt++;
				recorrer(curr.left, alt);
				recorrer(curr.right, alt);
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