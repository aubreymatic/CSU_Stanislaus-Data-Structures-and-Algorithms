package stack;

public class StackAppDriver {

	public static void main(String[] args) {
		int n = 5;
		int[] nums = { 3, 2, 5, 4};
		
		//int[] nums = { 3,7,8,2,4,10,1,23,13,9,5}; // Custom numbers
		
		StackApp obj = new StackApp();
		
		System.out.println("fact(" + n + "): " + obj.fact(n));
		System.out.println("sum(" + n + "): " + obj.sum(n));
		obj.reverse(nums);

	}

}
