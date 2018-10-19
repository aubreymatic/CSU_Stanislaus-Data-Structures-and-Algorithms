package twothreetree;

public class TwoThreeTree<K extends Comparable<K>, V> {

	private Node<K,V> root;
	
	public TwoThreeTree() {
		root = null;
	}
	
	private boolean lessThan(K key1, K key2) {
		if (key1.compareTo(key2) < 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean largerThan(K key1, K key2) {
		if (key1.compareTo(key2) > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean equalTo(K key1, K key2) {
		if (key1.compareTo(key2) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private void visitLKey(Node<K,V> node) {
		System.out.print(node.lkey() + " ");
	}
	
	private void visitRKey(Node<K,V> node) {
		System.out.print(node.rkey() + " | ");
	}
	
	public void inOrder() {
		inOrder(root);
		System.out.println();
	}
	
	private void inOrder(Node<K,V> node) {
		if (node == null) {
			return;
		}
		
		inOrder(node.left());
		visitLKey(node);
		inOrder(node.middle());
		visitRKey(node);
		inOrder(node.right());
	}
}
