package stack;

public class Conversion {
	
	private LStack<String> stack;
	private String output;
	
	public Conversion() {
		stack = new LStack<String>();
		output = "";
	}
	
	private boolean isOperator(String letter) {
		if (letter.equals("+") ||
			letter.equals("-") ||
			letter.equals("*") ||
			letter.equals("/")) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean isOperand(String letter) {
		return Character.isDigit(letter.charAt(0));
	}
	
	private int precedence(String letter) {
		if (letter.equals("+") ||
			letter.equals("-")) {
			return 0;
		} else if (letter.equals("*") ||
					letter.equals("/")) {
			return 1;
		}
		return -1;
	}
	
	private boolean isHigherOrEqual(String operator1, String operator2) {
		if (precedence(operator1) >= precedence(operator2)) {
			return true;
		} else {
			return false;
		}
	}
	
	private void sendOutput(String data) {
		output += data + " ";
	}
	
	private double doMath(String operator, double num1, double num2) {
		double result = 0;
		if (operator.equals("+")) {
			result = num1 + num2;
		} else if (operator.equals("-")) {
			result = num1 - num2;
		} else if (operator.equals("*")) {
			result = num1 * num2;
		} else if (operator.equals("/")) {
			result = num1 / num2;
		}
		return result;
	}
	
	public String infixToPostfix(String infix) {
		String[] tokens = infix.split(" ");
		
		for (String token: tokens) {
			if (isOperand(token)) {
				sendOutput(token);
				
			} else if (isOperator(token)) {
				
				while (stack.isEmpty() != true) {
					if (isHigherOrEqual(stack.peek(), token)) {
						sendOutput(stack.pop());
					}
				}
				stack.push(token);
			}
		}
		sendOutput(stack.pop());
		return output;
	}
	
	public double evaluate(String postfix) {
		
		
		return 0;
	}
}
