package BinaryTree;

public class BinaryTreeApp {

	public static void main(String[] args) {
		System.out.println("Modul 8 Struktur Data Binary Tree" + "\n");
		BinaryTree tree = new BinaryTree();
		TreeNode node;
		
		node = new TreeNode('D');
		tree.insert(node);
		
		node = new TreeNode('B');
		tree.insert(node);
		
		node = new TreeNode('A');
		tree.insert(node);
		
		node = new TreeNode('C');
		tree.insert(node);
		
		node = new TreeNode('F');
		tree.insert(node);
		
		node = new TreeNode('E');
		tree.insert(node);
		
		node = new TreeNode('G');
		tree.insert(node);
		
		System.out.println("Traversal dengan PreOrder : ");
		tree.PreOrder();
		System.out.println( "\nTraversal dengan PostOrder : ");
		tree.PostOrder();
		System.out.println("\nTraversal dengan InOrder : ");
		tree.InOrder();
		System.out.println("\n");
		tree.address();
	}

}
