package com.revaure.util;

import java.io.ObjectInputStream.GetField;

public class BubbleSortDriver {

	public static void main(String[] args) {
		int[] arr = generateArr(1000);
		System.out.println("Starting arr: ");
		//System.out.println("first element " + arr[0]);
		//System.out.println(arr);
		printArr(arr);
		Sorter.BubbleSort(arr);
		System.out.println("Sorted arr: ");
		//System.out.println(arr);
		printArr(arr);
		System.out.println("done");
	}
	
	private static int[] generateArr(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)((Math.random() * 200) - 100);
		}
		return arr;
	}
	
	private static void printArr(int[] arr) {
		String sb = "";
		for (int i = 0; i < arr.length; i++) {
			sb += (arr[i] + ", ");
		}
		System.out.println(sb);
	}

}
