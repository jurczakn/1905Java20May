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
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					sorted = false;
				}
			}
			if (sorted) {

				System.out.println("Iterated " + (i + 1) + " times to sort.");
				break;
			}
		}
	}

}
