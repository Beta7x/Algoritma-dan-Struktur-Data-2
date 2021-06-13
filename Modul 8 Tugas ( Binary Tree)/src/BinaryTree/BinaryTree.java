package BinaryTree;

public class BinaryTree {
	TreeNode root;
	 
	public boolean isEmpty(){
	    return (root == null);
	}
	
	//method insert data
	public void insert(TreeNode input) {
		if (isEmpty()) {
			root = input;
	    } else {
	    	// mencari parent yg sesuai pada posisi (kiri/kanan)
	    	TreeNode current = root; 
	    	TreeNode parent = null;
	    	boolean diKiri = true;
	    	while (current != null) {
	    		parent = current;
	    		// jika data yang akan diinputkan lebih besar, maka akan bergerak ke arah kanan
	    		if (current.data < input.data) { 
	    			current = current.right;
	    			diKiri = false;
	    			// else gerak ke kiri
	    		} else if(current.data > input.data){
	    			current = current.left;
	    			diKiri = true;
	    		} else{
	    			System.out.println("data "+input.data+" sudah ada ");
	    			break;
	    		}
	    	}
	    	
	    	if (diKiri) { // hubungkan ke parent
	    		parent.left = input;
	    	} else {
	    		parent.right = input;
	    	}
	    }
	}
	
	public void PreOrder(){
		preOrder(root);
	}
	
	public void InOrder(){
	    inOrder(root);
	}
	
	public void PostOrder(){
	    postOrder(root);
	}

	public void preOrder(TreeNode akar){
		if(akar != null){
			System.out.print(akar.data + " ");
	        preOrder(akar.left);
	        preOrder(akar.right);
		}
	}
	
	public void inOrder(TreeNode akar){
	    if(akar != null){
	        inOrder(akar.left);
	        System.out.print(akar.data+" ");
	        inOrder(akar.right);
	    }
	}
	
	public void postOrder(TreeNode akar){
	    if(akar != null){
	        postOrder(akar.left);
	        postOrder(akar.right);
	        System.out.print(akar.data+ " ");
	    }
	}
	 	
	//method mencari data
	public TreeNode search(int key) {
		TreeNode node = null;
	    TreeNode current = root;
	    while (current != null) { // lakukan pencarian selama current bukan null
	         if (current.data == key) {
	        	 return node;
	         } else {
	        	 if (current.data < key) {
	        		 current = current.right;
	        	 } else {
	        		 current = current.left;
	        	 }
	         }
	    }
	    return node;
	}
	
	public void InOrder(TreeNode akar) {
		if (akar != null) {
			System.out.println(akar.data + " ");
			inOrder(akar.left);
			inOrder(akar.right);
		}
	}
	
	public void PostOrder(TreeNode akar) {
		if (akar != null) {
			System.out.println(akar.data + " ");
			postOrder(akar.left);
			postOrder(akar.right);
		}
	}
	
	// method mencari data
	public TreeNode search(char key) {
		TreeNode node = null;
		TreeNode current = root;
		// melakukan pencarian selama current bukan null
		while (current != null) {
			if (current.data == key) {
				return node;
			} else {
				if (current.data < key) {
					current = current.right;
				} else {
					current = current.left;
				}
			}
		}
		return node;
	}
	
	public void address() {
		System.out.println("===========================");
		System.out.println("Nama : Widies Ade Priyanto" + "\n" + "NIM  : 20090126");
		System.out.println("===========================" + "\n");
	}
}
