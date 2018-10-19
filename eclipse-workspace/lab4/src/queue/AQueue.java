package queue;

public class AQueue<T> implements Queue<T> {
	
	private T[] queueArray;
	private static final int DEFAULT_SIZE = 10;
	private int maxSize;
	private int size;
	private int front;
	private int rear;
	
	@SuppressWarnings("unchecked")
	public AQueue(int maxSize) {
		queueArray = (T[])new Object[maxSize];
		this.maxSize = maxSize;
		size = 0;
		front = -1;
		rear = 0;
	}
	
	public AQueue() {
		this(DEFAULT_SIZE);
	}

	@Override
	public void clear() {
		size = 0;
		front = -1;
		rear = 0;
		
	}

	@Override
	public boolean enqueue(T it) {
		if (isFull()) {
			return false;
		}
		if (front == -1) {
			front = 0;
		}
		queueArray[rear()] = it;
		rear++;
		size++;
		return true;
	}

	@Override
	public T dequeue() {
		if (isEmpty()) {
			return null;
		}
		T it = queueArray[front()];
		front++;
		size--;
		return it;
	}

	@Override
	public T peek() {
		return queueArray[front()];
	}

	@Override
	public int length() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if (size == maxSize) {
			return true;
		}
		return false;
	}
	
	private int rear() {
		return rear % maxSize;
	}
	
	private int front() {
		return front % maxSize;
	}
	
	public void showAll() {
		System.out.print("queue ");
		System.out.print("(front:" + front() + ", ");
		System.out.print("rear:" + rear() + "): ");
		for (int i = front; i < rear; i++) {
			System.out.print(queueArray[i % maxSize] + " ");
		}
		System.out.println();
	}
}
