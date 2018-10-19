package part2;

public class Part2Driver {

	public static void main(String[] args) {
		
		int[] nums = { 1, 2, 3, 4, 5};
		
		// User created array
		//int[] nums1 = { 10, 15, 25, 50, 75, 100, 125, 150, 175, 200};
		
		// Set key depending on which or none of the numbers in the specific arrays.
		int key = 2;
		
		System.out.println("Linear search method that uses nums array");
		System.out.println("Position of " + key + ":" 
				+ Part2.linearSearch(nums, key));
		
		// Must change the set array name depending on which do you want to search.
		int left = 0;
		int right = nums.length-1;
		System.out.println("Binary search method that uses nums array");
		System.out.println("Position of " + key + ":"
				+ Part2.binarySearch(nums, key, left, right));
	}
}
