package test;

public class ClassA implements Calculation {

	@Override
	public double add(double num1, double num2) {
		return num1 + num2;
	}

	@Override
	public double subtract(double num1, double num2) {
		return num1 - num2;
	}

}
