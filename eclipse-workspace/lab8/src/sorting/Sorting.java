package sorting;

import priorityQueue.MinHeap;

public class Sorting<T extends Comparable<T>> {

	private boolean lessThan(T data1, T data2) {
		if (data1.compareTo(data2) < 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean largerThan(T data1, T data2) {
		if (data1.compareTo(data2) > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	@SuppressWarnings("unused")
	private boolean equalTo(T data1, T data2) {
		if (data1.compareTo(data2) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void swap(T[] arr, int index1, int index2) {
		T temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public void show(T[] arr, String whichSort) {
		System.out.print(whichSort + ": ");
		for (T data: arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	
	public void insertionSort(T[] arr) {
		for (int i=1; i < arr.length; i++) {
			for (int j=i; j > 0; j--) {
				if (lessThan(arr[j], arr[j-1])) {
					swap(arr, j, j-1);
				} else {
					break; // exit inner(j) for loop
						   // that is,
						   // stop moving to the left
				}
			}
			
		}
	}
	
	public void bubbleSort(T[] arr) {
		for (int i=0; i < arr.length; i++) {
			for (int j=0; j < arr.length-1-i; j++) {
				if (largerThan(arr[j], arr[j+1])) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	public void selectionSort(T[] arr) {
		int largestIndex = 0;
		for (int i=0; i < arr.length; i++) {
			largestIndex = 0;
			for (int j=1; j < arr.length-i; j++) {
				if (largerThan(arr[j], arr[largestIndex])) {
					largestIndex = j;
				}
			}
			swap(arr, largestIndex, arr.length-1-i);
		}
	}
	
	private int getMaxIncrement(T[] arr) {
		int base=2, exponent=0;
		while (Math.pow(base, exponent) < arr.length) {
			exponent++;
		}
		return (int)Math.pow(base, exponent-1);
	}
	
	public void shellSort(T[] arr) {
		System.out.println("max increment: " + getMaxIncrement(arr));
		for (int i=getMaxIncrement(arr); i >= 1; i /= 2) {
			System.out.println("increment    : " + i);
			insertionSort(arr, i);
		}
	}
	
	private void insertionSort(T[] arr, int incr) {
		for (int start=0; start < incr; start++) {
			insertionSort(arr, start, incr);
		}
		show(arr, "shellSort    ");
	}
	
	private void insertionSort(T[] arr, int start, int incr) {
		for (int i=start+incr; i < arr.length; i += incr) {
			for (int j=i; j > start; j -= incr) {
				if (lessThan(arr[j], arr[j-incr])) {
					swap(arr, j, j-incr);
				} else {
					break;
				}
			}
		}
	}
	
	public void heapSort(T[] arr) {
		// create a min heap after heapify
		MinHeap<T> heap = new MinHeap<T>(100, arr);
		
		/*
		 	get smallest values repeatedly,
		 	and put them back to array
		*/
		int index = 0;
		while (heap.size() > 0) {
			arr[index++] = heap.get();
		}
	}
}
