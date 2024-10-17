package com.bptn.course.exercises;

public class FibonacciRecursion {

	// Recursive method to calculate the nth Fibonacci number
	public static int calculateFibonacci(int number) {
		int result = 0;
		// Base case 1: Fibonacci(0) is 0
		if (number <= 0) {
			return 0;
		}

		// Base case 2: Fibonacci(1) is 1
		if (number == 1) {
			return 1;
		}

		// For other values of n, calculate Fibonacci(n) recursively
		if (number > 1) {

			// Calculate Fibonacci(n - 1) using recursion
			int previousValue = calculateFibonacci(number - 1);

			// Calculate Fibonacci(n - 2) using recursion
			int nextValue = calculateFibonacci(number - 2);

			// Calculate Fibonacci(n) by summing the above two values
			result = previousValue + nextValue;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("First 10 Fibonacci Numbers:");

		// Loop to calculate and print the first 10 Fibonacci numbers
		for (int i = 0; i < 10; i++) {
			int result = calculateFibonacci(i);
			System.out.println("Fibonacci(" + i + ") = " + result);
		}
	}
}
