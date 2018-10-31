package sorting;

public class SortingDriver {

	public static void main(String[] args) {
		Sorting<Integer> obj = new Sorting<Integer>();
		Integer[] nums = { 5, 1, 4, 2};
		
		obj.show(nums, "initial     ");
		
		// insertion sort
		obj.insertionSort(nums);
		obj.show(nums, "insertionSort");
		
		// bubble sort
		nums = new Integer[] {5, 1, 4, 2};
		obj.bubbleSort(nums);
		obj.show(nums, "bubbleSort     ");
		
		// selection sort
		nums = new Integer[] {5, 1, 4, 2};
		obj.selectionSort(nums);
		obj.show(nums, "selectionSort");
		System.out.println();
		
		// heap sort
		nums = new Integer[] {5, 1, 4, 2};
		obj.heapSort(nums);
		obj.show(nums, "heapSort       ");
	}

}
