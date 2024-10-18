package com.bptn.course._29_sorting_algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 5, 3, -1, 7, 10, -2 };
		System.out.println("Before sort:" + Arrays.toString(data));

		SelectionSort.selectionSort(data);
		System.out.println("After sort:" + Arrays.toString(data));

	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int hold = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[hold]) {
					hold = j;
				}
			}
			int val = arr[hold];
			arr[hold] = arr[i];
			arr[i] = val;
		}
	}
}