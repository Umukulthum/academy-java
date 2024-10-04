package com.bptn.course.exercises._01_big_coding;

import java.util.Scanner;

public class StringOperations {
	public static void main(String[] args) {

		// Declare variables
		boolean proceed = false;
		Scanner input = new Scanner(System.in);

		do {
			// Print statements
			System.out.println("String Menu");
			System.out.println("Press 1 for Palindrome Check");
			System.out.println("Press 2 to Reverse a String");
			System.out.println("Press 3 to Concatenate two Strings");
			System.out.println("Press 4 for String Comparison");
			System.out.println("Press 5 to Calculate the Length of a String");

			// Accept option input
			int option = input.nextInt();

			switch (option) {
			case 1:
				System.out.println("Palindrome Check");

				// Declare a variable
				String palindromeResult = "";

				// Accept string input
				System.out.println("Enter a String: ");
				String palindromeInput = input.next();

				// Loop through input string to get the reversed string
				for (int i = palindromeInput.length() - 1; i >= 0; i--) {
					palindromeResult += palindromeInput.charAt(i);
				}

				// Check if user input equals reversed string and print output corresponding to
				// result of condition
				if (palindromeResult.equalsIgnoreCase(palindromeInput)) {
					System.out.println(palindromeInput + " is a Palindrome");
				} else {
					System.out.println(palindromeInput + " is not a Palindrome");
				}
				break;

			case 2:
				System.out.println("Reverse a String");

				// Declare a variable
				String reverseResult = "";

				// Accept user input
				System.out.println("Enter a String: ");
				String reverseInput = input.next();

				// Loop through the input string from the last character and store into a
				// variable
				for (int i = reverseInput.length() - 1; i >= 0; i--) {
					reverseResult += reverseInput.charAt(i);
				}
				// Print result
				System.out.println("Reverse of " + reverseInput + " is " + reverseResult);
				break;

			case 3:
				System.out.println("Concatenate two Strings");

				// Accept user inputs
				System.out.println("Enter First string: ");
				String firstString = input.next();

				System.out.println("Enter Second string: ");
				String secondString = input.next();

				System.out.println(firstString + secondString);
				break;

			case 4:
				// Declare variable
				boolean isEqual = false;
				System.out.println("String Comparison");

				// Accept user inputs
				System.out.println("Enter First string: ");
				String firstInput = input.next();

				System.out.println("Enter Second string: ");
				String secondInput = input.next();

				// First compare the length of the two strings
				if (firstInput.length() == secondInput.length()) {
					// Loop through to check if each character in the string are the same
					for (int i = 0; i < firstInput.length(); i++) {
						// If we get to a point where a character in the first string isn't equal to the
						// equivalent index in the second string,
						// stop the loop and set isEqual to false. Else, the two strings are equal and
						// isEqual becomes true
						if (firstInput.charAt(i) != secondInput.charAt(i)) {
							isEqual = false;
							break;
						}
						isEqual = true;
					}
				}

				// Print message to user
				String message = isEqual == true ? "The entered strings are equal"
						: "The entered strings are not equal";
				System.out.println(message);
				break;

			case 5:
				System.out.println("Length of a string");

				// Accept user input
				System.out.println("Enter a string: ");
				String lengthString = input.next();

				System.out.println("The length of the entered string is: " + lengthString.length());
				break;

			default:
				System.out.println("Invalid choice! Please make a valid choice.");

			}
			System.out.println("To continue String operations Press 1, else press any other number to exit");
			proceed = input.nextInt() == 1 ? true : false;
		} while (proceed == true);

		input.close();
	}
}
