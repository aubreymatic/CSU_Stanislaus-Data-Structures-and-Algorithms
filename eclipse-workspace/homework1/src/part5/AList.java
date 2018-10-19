package part5;

public class  AList<T> implements List<T> {
	
	private T listArray[];
	private static final int DEFAULT_SIZE = 10;
	private int maxSize;
	private int listSize; // # of elements
	private int curr;	  // current position
	
	@SuppressWarnings("unchecked")
	public AList(int maxSize) {
		this.maxSize = maxSize;
		listSize = 0;
		curr = -1;
		listArray = (T[])new Object[maxSize];
	}
	
	public AList() {
		this(DEFAULT_SIZE);
	}

	@Override
	public void clear() {
		listSize = 0;
		curr = -1;
	}

	@Override
	public boolean insert(T it) {
		if (listSize >= maxSize) {
			return false;
	}
	for (int i=listSize-1; i >= curr; i--) {
		listArray[i+1] = listArray[i];
	}
	listArray[curr] = it;
	listSize++;
	return false;
	}

	@Override
	public boolean append(T it) {
		if (listSize >= maxSize) {
			return false;
	}
	listArray[listSize++] = it;
	return true;
	}

	@Override
	public T remove() {
		if (curr < 0 || curr > listSize-1) {
			return null;
		}
		T it = listArray[curr];
		for (int i=curr+1; i<listSize;i++) {
			listArray[i-1] = listArray[i];
		}
		listSize--;
		return it;
	}

	@Override
	public void moveToStart() {
		curr = 0;
	}

	@Override
	public void moveToEnd() {
		curr = listSize-1;
	}

	@Override
	public void prev() {
		if (curr > 0) {
			curr--;
		}
	}

	@Override
	public void next() {
		if (curr < listSize-1) {
			curr++;
		}
	}

	@Override
	public int length() {
		return listSize;
	}

	@Override
	public int currPos() {
		return curr;
	}

	@Override
	public boolean moveToPos(int pos) {
		if (pos < 0 || pos > listSize-1) {
			return false;
		}
		curr = pos;
		return true;
	}

	@Override
	public boolean isAtEnd() {
		return curr == (listSize-1);
	}

	@Override
	public T getValue() {
		if (curr < 0 || curr > listSize-1) {
			return null;
		}
		return listArray[curr];
	}

	@Override
	public void show() {
		for (int i=0; i < listSize; i++) {
			System.out.print(listArray[i] + " ");
		}
		System.out.println();
	}

	@Override
	public void showAll() {
	int i;
	for (moveToStart(), i=0; i < listSize; next(), i++) {
		System.out.print(getValue() + " ");
		}
		System.out.println();
	}

	@Override
	public boolean find(T k) {
	int i;
	for (moveToStart(), i=0; i < listSize; next(), i++) {
		if (getValue() == k ) {
			return true;
		}
	}
	return false;
	}
}