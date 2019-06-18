
public class Main {

	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		bTree.insert(70);
		bTree.insert(38);
		bTree.insert(77);
		bTree.insert(36);
		bTree.insert(39);
		bTree.insert(74);
		bTree.insert(78);
		bTree.insert(73);
		bTree.insert(75);
		bTree.insert(37);
		System.out.println(bTree.toString());
		bTree.delete(70);
//		bTree.delete(75);
		System.out.println(bTree.toString());
//		bTree.delete(50);
		
		
	}
}
