package com.bptn.course._04_arrays;

public class TwoDimensionalArray {		
//		Given a 2D Array, find the maximum element in each row.

		public static void main(String[] args) {
			
//			int[] numbers = new int[3];
			int[][] numbers = new int[3][];
			
			int[][] grades = {
					{85, 90},
					{88, 92},
					{70, 65}
			};
			
			
//			System.out.print(grades[2][1]);
			
			for(int i=0; i<3; i++) {
				for(int j=0; j<2;j++) {
					grades[i][j]+=2;
				}
			}

			for(int i=0; i<3; i++) {
				for(int j=0; j<3;j++) {
					System.out.print(grades[i][j]);
					System.out.print("\t");
				}
				System.out.print("\n");
			}

	}

}

