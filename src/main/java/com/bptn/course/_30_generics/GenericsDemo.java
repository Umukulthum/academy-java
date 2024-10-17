package com.bptn.course._30_generics;

public class GenericsDemo {
	public static <T extends Comparable<T>> T findMaxGeneric(T num1, T num2) {
		return num1.compareTo(num2) > 0 ? num1 : num2;
	}

	// Find maximum between two numbers
	public static int findMax(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}

	public static void main(String[] args) {
		System.out.println("Max of 10 and 20: " + findMax(10, 20));
		System.out.println("Generic - Max of 10 and 20: " + findMaxGeneric(10, 20));
	}
}
