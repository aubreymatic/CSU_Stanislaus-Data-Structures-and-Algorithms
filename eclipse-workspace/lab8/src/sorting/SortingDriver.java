package sorting;

public class SortingDriver {

	public static void main(String[] args) {
		Sorting<Integer> obj = new Sorting<Integer>();
		Integer[] nums = { 5, 1, 4, 2};
		
		obj.show(nums, "initial      ");
		
		// insertion sort
		obj.insertionSort(nums);
		obj.show(nums, "insertionSort");
		
		// bubble sort
		nums = new Integer[] {5, 1, 4, 2};
		obj.bubbleSort(nums);
		obj.show(nums, "bubbleSort   ");
		
		// selection sort
		nums = new Integer[] {5, 1, 4, 2};
		obj.selectionSort(nums);
		obj.show(nums, "selectionSort");
		System.out.println();
		
		// shell sort
		nums = new Integer[] {12,5,9,4,3,1,2,7,8,10};
		obj.shellSort(nums);
		obj.show(nums, "shellSort    ");
		
		// heap sort
		nums = new Integer[] {5, 1, 4, 2};
		obj.heapSort(nums);
		obj.show(nums, "heapSort     ");
	}

}
