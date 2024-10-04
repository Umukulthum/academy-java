package com.bptn.course.exercises._01_big_coding;

import java.util.Scanner;

public class PluralForm {
	public static void main(String[] args) {

		// Declare Variables
		Scanner scanner = new Scanner(System.in);
		String truncatedNoun;
		String result;

		// Accept Inputs
		System.out.println("Input item count: ");
		int count = scanner.nextInt();
		scanner.nextLine(); // This consumes the left over new line associated with nextInt()

		System.out.println("Input a singular noun: ");
		String noun = scanner.nextLine();

		// Check if count is 1
		if (count == 1) {
			System.out.println(count + " " + noun);
		}
		// Check if count is 0 or greater than 1
		else if (count >= 0) {
			// Get the last 2 characters from user input
			String nounEnd = noun.substring(noun.length() - 2);
			// Check for matching conditions
			// -fe
			if (nounEnd.equals("fe")) {
				// Get a part of the string excluding the last 2 characters
				truncatedNoun = noun.substring(0, noun.length() - 2);
				// Concatenate with "ves"
				result = truncatedNoun + "ves";
			}
			// -sh, -ch
			else if (nounEnd.equals("sh") || nounEnd.equals("ch")) {
				// Add "es" to the user input
				result = noun + "es";
			}
			// -us
			else if (nounEnd.equals("us")) {
				// Get a part of the string excluding the last 2 characters
				truncatedNoun = noun.substring(0, noun.length() - 2);
				// Concatenate with "i"
				result = truncatedNoun + "i";

			}
			// -ay, -oy, -ey, -uy
			else if (nounEnd.equals("ay") || nounEnd.equals("oy") || nounEnd.equals("ey") || nounEnd.equals("uy")) {
				// Add a 's' to the user input
				result = noun + "s";
			}
			// -y
			else if (noun.substring(noun.length() - 1).equals("y")) {
				// Get a part of the string excluding the last character
				truncatedNoun = noun.substring(0, noun.length() - 1);
				// Concatenate with "ies"
				result = truncatedNoun + "ies";

			}
			// All other cases
			else {
				// Add a 's' to the user input
				result = noun + "s";
			}
			System.out.println(count + " " + result);
		} else {
			System.out.println("Invalid input!");
		}

		// Close scanner
		scanner.close();
	}
}
