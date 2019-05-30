package com.revaure.util;

import java.io.ObjectInputStream.GetField;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class BubbleSortDriver {

	private static final boolean PRINT = false;
	private static final boolean QUICK = true;
	private static final boolean BUBBLE = true;
	private static final int SIZE = 100000;

	public static void main(String[] args) {

		// QuickSort
		if (QUICK) {
			int[] arr = generateArr(SIZE);
			System.out.println("Starting arr: ");
			if (PRINT)
				printArr(arr);
			LocalDateTime start = LocalDateTime.now();
			Sorter.quickSort(arr);
			LocalDateTime end = LocalDateTime.now();
			System.out.println("Quick Sorted arr: ");
			if (PRINT)
				printArr(arr);
			System.out.println("QuickSort Completed in: " + Duration.between(start, end).toMillis());
		}
		// BubbleSort
		if (BUBBLE) {
			int[] arr = generateArr(SIZE);
			System.out.println("Starting arr: ");
			if (PRINT)
				printArr(arr);
			LocalDateTime start = LocalDateTime.now();
			Sorter.BubbleSort(arr);
			LocalDateTime end = LocalDateTime.now();
			System.out.println("Bubble Sorted arr: ");
			if (PRINT)
				printArr(arr);
			System.out.println("BubbleSort Completed in: " + Duration.between(start, end).toMillis());
		}
		System.out.println("done");
	}

	private static int[] generateArr(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((Math.random() * 200) - 100);
		}
		return arr;
	}

	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

}
