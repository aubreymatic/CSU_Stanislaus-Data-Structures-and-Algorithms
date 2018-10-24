package sorting;

public class SortingDriver {

	public static void main(String[] args) {
		Sorting<Integer> obj = new Sorting<Integer>();
		Integer[] nums = { 5, 1, 4, 2};
		
		obj.show(nums, "initial      ");
		
		// insertion sort
		obj.insertionSort(nums);
		obj.show(nums, "insertionSort");
	}

}
