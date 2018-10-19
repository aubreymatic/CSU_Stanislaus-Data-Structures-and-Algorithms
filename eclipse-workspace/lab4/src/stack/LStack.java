package stack;

public class LStack<T> implements Stack<T> {
	
	private Node<T> top;
	private int size;
	
	public LStack() {
		top = null;
		size = 0;
	}

	@Override
	public void clear() {
		top = null;
		size = 0;
	}

	@Override
	public boolean push(T it) {
		Node<T> newNode = new Node<T>(it);
		if (top != null) {
			newNode.setNext(top);
		}
		top = newNode;
		size++;
		return true;
	}

	@Override
	public T pop() {
		if (top == null) {
			return null;
		}
		T it = top.value();
		top = top.next();
		size--;
		return it;
	}

	@Override
	public T peek() {
		if (top == null) {
			return null;
		}
		return top.value();
	}

	@Override
	public int length() {
		return size;
	}

}
