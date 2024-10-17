package com.bptn.course._29_sorting_algorithms;

import java.util.Arrays;

public class InsertionSort {
	static void insertionSort(int[] array) {
		int size = array.length;
		// outer loop for each index
		for (int i = 1; i < size; i++) {
			int key = array[i];
			int j = i - 1;
			// inner loop to compare and swap
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

	public static void insertionSortTest(int[] elements) {
		for (int j = 1; j < elements.length; j++) { // line 1
			int temp = elements[j]; // line 2
			int possibleIndex = j; // line 3
			while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) { // line 4
				elements[possibleIndex] = elements[possibleIndex - 1]; // line 5
				possibleIndex--;
			}
			elements[possibleIndex] = temp;
		}
	}

	public static void main(String[] args) {
		int[] data = { 5, 3, -1, 7, 10, 2 };
		System.out.println("Before sort: " + Arrays.toString(data));

		// insertionSort(data);
		insertionSortTest(data);
		System.out.println("After sort: " + Arrays.toString(data));
	}
}
