package com.bptn.course.exercises._01_big_coding;

import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		// Declare and initialize variables
		int targetNumber = 23;
		int guess = 0;
		Scanner input = new Scanner(System.in);

		// Run loop until target number and guess are equal
		do {
			// Accept user input
			System.out.println("Please enter a number between 1 and 100.");
			guess = input.nextInt();

			// Conditionals for comparing user input and target number
			if (guess < 1 || guess > 100) {
				System.out.println("Input out of expected range! Try again");
			} else if (targetNumber == guess) {
				System.out.println("Congratulations! You guessed the number correctly!");
			} else if (targetNumber < guess) {
				System.out.println("Too high! Try again.");
			} else {
				System.out.println("Too low! Try again.");
			}
		} while (targetNumber != guess);

		input.close();
	}
}