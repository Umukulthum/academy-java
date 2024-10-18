package com.bptn.course._29_sorting_algorithms;

import java.util.Arrays;

class MergeSort {

	public static void main(String args[]) {
		int[] arr = { 12, 11, 13, 5, 6, 7 };
		System.out.print("Printing original array: ");
		System.out.println(Arrays.toString(arr));

		// sort array
		mergeSort(arr, 0, arr.length - 1);

		System.out.print("Printing sorted array: ");
		System.out.println(Arrays.toString(arr));

	}

	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	static void merge(int arr[], int left, int middle, int right) {
		// Sizes of the two sub-arrays
		int n1 = middle - left + 1;
		int n2 = right - middle;

		// Temporary arrays to hold the two halves
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		// Copy data to temp arrays
		for (int i = 0; i < n1; i++) {
			leftArray[i] = arr[left + i];
		}
		for (int j = 0; j < n2; j++) {
			rightArray[j] = arr[middle + 1 + j];
		}

		// Initial indices for merging the two sub-arrays
		int i = 0, j = 0;
		int k = left; // Initial index of the merged sub-array

		// Merge the temp arrays back into arr[left..right]
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		// Copy any remaining elements of leftArray
		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		// Copy any remaining elements of rightArray
		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	static void mergeSort(int arr[], int left, int right) {
		// Add code here
		if (left < right) {
			// Find the middle point
			int middle = left + (right - left) / 2;

			// Recursively call mergesort to sort the first and second halves
			mergeSort(arr, left, middle);
			mergeSort(arr, middle + 1, right);

			// Merge the sorted halves
			merge(arr, left, middle, right);
		}
	}
}
