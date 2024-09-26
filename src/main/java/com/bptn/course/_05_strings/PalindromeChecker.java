package com.bptn.course._05_strings;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        //Receive input from user
        System.out.println("Enter the string to check for palindrome: ");

        //Instantiate the Scanner Object
        Scanner scanner = new Scanner(System.in);

        //Store user input in this variable
        String input = scanner.nextLine();

        //Declare and initialize an empty string
        String reverseInput = "";

        //Loop through the length of the input and store the characters in the string from the last to the first (reversed)
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseInput += input.charAt(i);
        }

        //Check if the user input in lower case equals the reverse input in lower case as well
        //Print out corresponding messages for the above condition check
        if (input.toLowerCase().equals(reverseInput.toLowerCase())) {
            System.out.println("Input string is palindrome");
        } else {
            System.out.println("Input string is not palindrome");
        }
    }
}


