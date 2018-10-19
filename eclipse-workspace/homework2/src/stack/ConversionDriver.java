package stack;

public class ConversionDriver {

	public static void main(String[] args) {
		Conversion obj = new Conversion();
		
		String infix = "1 * 2 + 3";
		System.out.println("infix: " + infix);
		
		// convert infix to postfix
		String postfix = obj.infixToPostfix(infix);
		System.out.println("postfix: " + postfix);
		
		// evaluate postfix
		System.out.println("evaluation: " + obj.evaluate(postfix));
	}

}
