package com.bptn.course.exercises;

public class CodeChallenge {

	public static void main(String[] args) {
		int[] arr = { 8, 7, 11, 2 };
		int target = 13;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("[" + i + ", " + j + "]");
					break;
				}
			}
		}
	}

}
