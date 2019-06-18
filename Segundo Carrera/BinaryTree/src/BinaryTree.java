
public class BinaryTree {

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

	public void delete(int data) {
		if (root != null)
			findRecursive(data, root, null);
		else
			System.out.println("Arbol vacío");
	}

	private void findRecursive(int data, Node currNode, Node lastNode) {
		if (currNode.data > data) {
			if (currNode.getLeft() != null) {
				findRecursive(data, currNode.getLeft(), currNode);
			} else {
				System.out.println("No existe ese dato en el árbol");
			}
		}
		if (currNode.data < data) {
			if (currNode.getRight() != null) {
				findRecursive(data, currNode.getRight(), currNode);
			} else {
				System.out.println("No existe ese dato en el árbol");
			}
		}
		if (currNode.data == data) {
			if(currNode != root) {
				System.out.println("He encontrado el dato");
				deleteRecursive(currNode, lastNode);
			} else {
				System.out.println("Encontrado, es raiz");
				deleteRecursive(currNode, null);
			}
		}
	}
	
	private void deleteRecursive(Node currNode, Node lastNode) {
		System.out.println(hasSon(currNode));
		if(!hasSon(currNode)) {
			System.out.println("somethinf");
			if(lastNode.getLeft() != null) {
				if(lastNode.getLeft().data == currNode.data) {
					lastNode.left = null;
					currNode = null;
				}
			} else if(lastNode.getRight() != null) {
				if(lastNode.getRight().data == currNode.data) {
					lastNode.right = null;
					currNode = null;
				}
			} 
		} else if (lastNode == null){
			System.out.println("something");
			Node higherLeft = getHigherLeft(currNode.getLeft());
			Node lowerRight = getLowerRight(currNode.getRight());
			if(currNode.data - higherLeft.data < lowerRight.data - currNode.data) {
				exchange(getHigherLeft(currNode.getLeft()), currNode);
			} else {
				exchange(getLowerRight(currNode.getRight()), currNode);
			}
			System.out.println(higherLeft.toString());
			System.out.println(lowerRight.toString());
		} else if(currNode.getLeft() == null) {
			Node lowerRight = getLowerRight(currNode.getRight());
			System.out.println(lowerRight.toString());
		} else if(currNode.getRight() == null) {
			Node higherLeft = getHigherLeft(currNode.getLeft());
			System.out.println(higherLeft.toString());
		} else {
			Node higherLeft = getHigherLeft(currNode.getLeft());
			Node lowerRight = getLowerRight(currNode.getRight());
			System.out.println(higherLeft.toString());
			System.out.println(lowerRight.toString());
		}
	}
	private void exchange(Node nodeAbajo, Node nodeBorrar) {
		nodeBorrar.data = nodeAbajo.data;
		nodeAbajo = null;
	}
	private Node getHigherLeft(Node curr) {
		if(curr.getRight() == null) {
			return curr;
		}
		return getHigherLeft(curr.getRight());
	}
	private Node getLowerRight(Node curr) {
		if(curr.getLeft() == null) {
			return curr;
		}
		return getLowerRight(curr.getLeft());
	}

	private boolean hasSon(Node node) {
		if(node.getLeft() != null || node.getRight() != null) 
			return true;
		return false;
	}
	public String toString() {
		return "DLR " + toStringDLR(root) + "\nLDR " + toStringLDR(root) +"\nLRD " + toStringLRD(root);
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