package binaryTree;

public class LBTree<T> implements BTree<T> {
	
	private Node<T> root;
	
	public LBTree() {
		root = null;
	}

	@Override
	public void add(T value) {
		if (root == null) {
			Node<T> node = new Node<T>(value);
			root = node;
			return;
		}
		add(root, value);
	}
	
	private void add(Node<T> node, T value) {
		if (node.left() == null) {
			Node<T> child = new Node<T>(value);
			node.setLeft(child);
		} else if (node.right() == null) {
			Node<T> child = new Node<T>(value);
			node.setRight(child);
		} else {
			node = node.left();
			add(node, value);
		}
	}
	
	private void visit(Node<T> node) {
		System.out.print(node.value() + " ");
	}

	@Override
	public void inOrder() {
		inOrder(root);
	}
	
	private void inOrder(Node<T> node) {
		if (node == null) {
			return;
		}
		inOrder(node.left());
		visit(node);
		inOrder(node.right());
	}

	@Override
	public void preOrder() {
		preOrder(root);
	}
	
	private void preOrder(Node<T> node) {
		if (node == null) {
			return;
		}
		visit(node);
		preOrder(node.left());
		preOrder(node.right());
	}

	@Override
	public void postOrder() {
		postOrder(root);
	}
	
	private void postOrder(Node<T> node) {
		if (node == null) {
			return;
		}
		postOrder(node.left());
		postOrder(node.right());
		visit(node);
	}

	@Override
	public int height() {

	    return height(root);
	}

	//[ Danny's]

	//private int height(Node<T> node) {
	    //if (node == null) {
	        //return 0;
	    //}
	    
	    //int leftHeight = height(node.left());
	    //int rightHeight = height(node.right());
	    //int height = leftHeight > rightHeight ? leftHeight : rightHeight;

	    //if (node == root) {
	        //return height;
	    //} else {
	        //return height + 1;
	    //}
	//}

	//[ Mekki's]

	private int height (Node<T> node) {
	    if (node.left() == null && node.right() == null)
	        return 0;
	     
	    int leftHeight = height(node.left()) + 1;
	    int rightHeight = height(node.right()) + 1;
	     
	    System.out.println(node.value() + " " + leftHeight + " " + rightHeight);
	     
	    if (rightHeight <= leftHeight)
	        return leftHeight;
	    else
	        return rightHeight;
	}

}
