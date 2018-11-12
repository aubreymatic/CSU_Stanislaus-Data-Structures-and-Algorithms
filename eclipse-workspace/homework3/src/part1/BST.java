package part1;

import java.util.*;

public class BST<K extends Comparable<K>, V> {
	
	private Node<K,V> root;
	private int numOfNodes;
	
	public BST() {
		root 	   = null;
		numOfNodes = 0;
	}
	
	public int numOfNodes() {
		return numOfNodes;
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
	
	public V find(K key) {
		return find(root, key);
	}
	
	private V find(Node<K,V> node, K key) {
		if (node == null) {
			return null;
		}
		
		if (lessThan(key, node.key())) {
			return find(node.left(), key);
		} else if (largerThan(key, node.key())) {
			return find(node.right(), key);
		} else {
			return node.value();
		}
	}
	
	public void insert(K key, V value) {
		root = insert(root, key, value);
		numOfNodes++;
	}
	
	private Node<K,V> insert(Node<K,V> node, K key, V value) {
		if (node == null) {
			return new Node<K,V>(key, value);
		}
		
		if (lessThan(key, node.key())) {
			node.setLeft(insert(node.left(), key, value));
		} else {
			node.setRight(insert(node.right(), key, value));
		}
		return node;
	}
	
	private Node<K,V> findMin(Node<K,V> node) {
		if (node == null) {
			return null;
		}
		if (node.left() == null) {
			return node;
		}
		return findMin(node.left());
	}
	
	private Node<K,V> findMax(Node<K,V> node) {
		if (node == null) {
			return null;
		}
		if (node.right() == null) {
			return node;
		}
		return findMax(node.right());
	}
	
	public void remove(K key) {
		remove(root, key);
	}
	
	public Node<K,V> remove(Node<K,V> node, K key) {
		if (node == null) { //not found
			return null;
		}
		
		if (lessThan(key, node.key())) {
			node.setLeft(remove(node.left(), key));
		} else if (largerThan(key, node.key())) {
			node.setRight(remove(node.right(), key));
		} else { // found
			if (node.left() == null) {
				return node.right();
			} else if (node.right() == null) {
				return node.left();
			} else { // two children
				Node<K,V> temp = findMax(node.left());
				node.setKey(temp.key());
				node.setValue(temp.value());
				node.setLeft(remove(node.left(), temp.key()));
			}
		}
		return node;
	}
	
	private void visit(Node<K,V> node) {
		System.out.println(node.value());
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
		visit(node);
		inOrder(node.right());
	}
	
	public void preOrder() {
		preOrder(root);
		System.out.println();
	}
	
	private void preOrder(Node<K,V> node) {
		if (node == null) {
			return;
		}
		visit(node);
		preOrder(node.left());
		preOrder(node.right());
	}
	
	public void postOrder() {
		postOrder(root);
		System.out.println();
	}
	
	private void postOrder(Node<K,V> node) {
		if (node == null) {
			return;
		}
		postOrder(node.left());
		postOrder(node.right());
		visit(node);
	}
	
	// range search
	public ArrayList<V> find(K smallest, K largest) {
		ArrayList<V> values = new ArrayList<V>();
		find(root, smallest, largest, values);
		return values;
	}
	
	private void find(Node<K,V> node, K smallest, 
			K largest, ArrayList<V> values) {
		
		if () {
			
		}
	}
	
}
