package com.bptn.course._05_strings;

import java.util.Scanner;

public class ConsonantVowel {

	public static void main(String[] args) {
		//Read user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = scanner.nextLine();
		
		//Declare storage variables
		int vowelCount = 0;
		int consonantCount = 0;
		
		//Convert everything to lowercase
		String lowerCaseInput = input.toLowerCase();
		
		//Loop through each character in the string
		for(int i = 0; i < lowerCaseInput.length(); i++) {
			char ch = lowerCaseInput.charAt(i);
			if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') {
				vowelCount++;
			} else if (ch >= 'a' || ch <= 'z') {
				consonantCount++;
			} else {
				continue;
			}			
		}
		
		//Print out result
		System.out.println("Total number of vowels is " + vowelCount + " and the total number of consonants is " + consonantCount);
		
		scanner.close();
	}

}
