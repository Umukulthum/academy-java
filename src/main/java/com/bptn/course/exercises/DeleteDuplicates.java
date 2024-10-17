package com.bptn.course.exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteDuplicates {

	/*
	 * This method deletes duplicates from an unsorted ArrayList.
	 * 
	 * @param nums the sorted ArrayList with duplicates
	 * 
	 * @return a sorted ArrayList without duplicates
	 */
	public static List<Integer> deleteDuplicates(List<Integer> nums) {
		List<Integer> newList = new ArrayList<>();
		// Check if the list is null or empty, and return an empty list if so
		if (nums != null && nums.size() > 0) {

			// Implement the bigger details of your algorithm here...
			// First make the list unique by converting to a Hashset
			Set<Integer> uniqueSet = new HashSet<>(nums);

			// Convert the set back to a list
			newList = new ArrayList<>(uniqueSet);

			// Sort the list using Insertion Sort
			for (int j = 1; j < newList.size(); j++) {
				int temp = newList.get(j);
				int possibleIndex = j;
				while (possibleIndex > 0 && temp < newList.get(possibleIndex - 1)) {
					newList.set(possibleIndex, newList.get(possibleIndex - 1));
					possibleIndex--;
				}
				newList.set(possibleIndex, temp);
			}
		}
		// return sorted and unique Arraylist else an empty list will be returned if our
		// input list is empty
		return newList;
	}

	public static void main(String[] args) {
		// Initialize a sample sorted ArrayList with duplicate values
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(3);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(5);

		// Call the deleteDuplicates method with the sample list as argument
		List<Integer> result = deleteDuplicates(nums);

		// Print the result to the console
		System.out.println(result);
	}
}
