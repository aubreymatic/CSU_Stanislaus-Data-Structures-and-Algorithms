package stack;

public class LStackDriver {

	public static void main(String[] args) {
		LStack<Integer> stack = new LStack<Integer>();
		stack.push(2);
		stack.push(4);
		stack.push(6);
		System.out.println("stack size: " + stack.length());
		System.out.println("empty?: " + stack.isEmpty());
		
		System.out.println("peek top: " + stack.peek());
		
		System.out.println("pop: " + stack.pop());
		System.out.println("pop: " + stack.pop());
		System.out.println("pop: " + stack.pop());
		
		System.out.println("stack size: " + stack.length());
		System.out.println("empty?: " + stack.isEmpty());
	}

}
