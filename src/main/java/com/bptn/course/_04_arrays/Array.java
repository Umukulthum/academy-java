package com.bptn.course._04_arrays;

public class Array {

	public static void main(String[] args) {
		//Given a 2D Array, find the maximum element in each row
		
		int maxValue = 0;
		int[][] numbers = {
				{85, 90},
				{88, 92},
				{70, 65}
		};
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (numbers[i][j] > maxValue)
					maxValue = numbers[i][j];
			}
			System.out.print("Maximum value on row " + i+1 + "is: " + maxValue);
			maxValue = 0;
		}
		
	}
}
