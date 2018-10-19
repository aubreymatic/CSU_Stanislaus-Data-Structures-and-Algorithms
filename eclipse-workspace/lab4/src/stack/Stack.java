package stack;

public interface Stack<T> {
	
	public void clear();
	
	public boolean push(T it);
	
	public T pop();
	
	// Checks the top value of the stack
	public T peek();
	
	// Returns the length of the stack
	public int length();
	
}
