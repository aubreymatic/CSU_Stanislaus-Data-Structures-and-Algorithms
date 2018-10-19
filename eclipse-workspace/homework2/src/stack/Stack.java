package stack;

public interface Stack<T> {
	
	void clear();
	
	boolean push(T it);
	
	T pop();
	
	// Checks the top value of the stack
	T peek();
	
	// Returns the length of the stack
	int length();
	
	boolean isEmpty();
	
}
