package program1;

public class Program1{

public static int fib(int n) {
	if (n == 1 || n == 2) {
		return 1;
	}
	return fib(n-2) + fib(n-1);
}

public static int binarySearch(int[] nums, int key, int left, int right) {
	// base case
	if (left == right) {
		if (key == nums[left]) {
			return left;
		} else {
			return nums.length;
	}
}
// general recursive function
int mid = (left + right) / 2;
if (key > nums[mid]) {
	left = mid + 1;
} else if (key < nums[mid]) {
	right = mid -1;
} else {
	return mid;
}
return binarySearch(nums, key, left, right);
}

public static int sumIterative(int[] nums) {
	
	 
		int sum = 0;
		for (int i=0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
}

public static int sumRecursive(int[] nums, int n) {
	
	if (n == 1) {
		return nums[0];
	}
	return nums[n-1] + sumRecursive(nums, n-1);
}

}