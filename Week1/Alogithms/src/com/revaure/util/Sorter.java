package com.revaure.util;

public class Sorter {

	public static void BubbleSort(int[] arr) {
		// iterate over the array at least n+1 times
		for (int i = 0; i < arr.length + 1; i++) {
			boolean sorted = true;
			// compare each element in the array with
			// its neighbor to the right
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap
					swap(arr, j, j+1);
					sorted = false;
				}
			}
			if (sorted) {

				System.out.println("Iterated " + (i + 1) + " times to sort.");
				break;
			}
		}
	}
	
	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	private static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			//Start by partitioning with entire array
			int index = partition(arr, start, end);
			//Recursively sort remaining halves of the array
			quickSort(arr, start, index - 1);
			quickSort(arr, index + 1, end);
		}
	}
	
	private static int partition (int[] arr, int start, int end) {
		
		int pivot = arr[end];
		int i = start - 1;
		
		for (int j = start; j < end; j++) {
			//if this number is smaller than the pivot, swap them
			if (arr[j] <= pivot) {
				i++; //move index over
				
				//swap arr[i] and arr[j]
				swap(arr, i, j);
				
			}
		}
		
		//swap last index with pivot (to place on left hand side)
		swap(arr, i + 1, end);
		
		return i + 1;
	}
	
	private static void swap (int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
