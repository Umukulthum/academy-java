package com.bptn.course.exercises._01_big_coding;

import java.util.Scanner;

public class WordEncryption {
	public static void main(String[] args) {

		// Declare and Initialize variables
		String result = "";
		Scanner scanner = new Scanner(System.in);

		// Accept input from user
		System.out.println("Enter word to encrypt");
		String inputString = scanner.next();

		// Loop through the input string to break the string into characters
		for (int i = 0; i < inputString.length(); i++) {
			char character = inputString.charAt(i);

			// Condition for returning 'a' when character is 'z'
			if (character == 'z') {
				character = 'a';
			}
			// Condition for returning 'A' when character is 'Z'
			else if (character == 'Z') {
				character = 'A';
			}
			// Condition for checking if the character is a digit or special character
			else if (!Character.isLetter(character)) {
				character = character;
			} else {
				character++;
			}

			// Concatenate into result variable
			result += character;
		}

		// Print out encrypted result
		System.out.println("Encrypted word: " + result);

		// Close Scanner
		scanner.close();
	}
}
