package com.bptn.course.exercises._01_big_coding;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		// Declare variables
		boolean proceed = false;
		Scanner scanner = new Scanner(System.in);

		do {
			// Print menu statements
			System.out.println("Calculator Menu");
			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for subtraction");
			System.out.println("Press 3 for multiplication");
			System.out.println("Press 4 for division");
			System.out.println("Press 5 to square a number");
			System.out.println("Press 6 to find a square root");
			System.out.println("Press 7 to find the reciprocal");

			// Accept operation input
			int operationType = scanner.nextInt();
			double result = 0.0;

			// Check for operationTypes requiring 2 operands
			if (operationType > 0 && operationType < 5) {

				// Accept number inputs
				System.out.print("Enter the First number: ");
				double firstNumber = scanner.nextDouble();

				System.out.print("\nEnter the Second number: ");
				double secondNumber = scanner.nextDouble();

				// Conditionals for operations requiurng 2 operands
				switch (operationType) {
				// Addition
				case 1:
					result = firstNumber + secondNumber;
					System.out.println(
							"The addition of the numbers " + firstNumber + " and " + secondNumber + " is = " + result);
					break;
				// Subtraction
				case 2:
					result = firstNumber - secondNumber;
					System.out
							.println("The subtraction of " + secondNumber + " from " + firstNumber + " is = " + result);
					break;
				// Multiplication
				case 3:
					result = firstNumber * secondNumber;
					System.out.println(
							"The product of the numbers " + firstNumber + " and " + secondNumber + " is = " + result);
					break;
				// Division
				case 4:
					result = (int) (firstNumber / secondNumber);
					double remainder = firstNumber % secondNumber;
					System.out
							.println("Dividing " + firstNumber + " by " + secondNumber + " the quotient is " + result);
					System.out.println("The remainder is " + remainder);
					break;
				default:
					System.out.println("Invalid choice! Please make a valid choice.");
				}
			}

			// Check for operationTypes requiring only 1 operand
			else if (operationType > 4 && operationType < 8) {

				double inputNumber = 0.0;
				// Conditionals for operations requiring onl 1 operand
				switch (operationType) {
				// Square
				case 5:
					System.out.println("Enter the number to find Square: ");
					inputNumber = scanner.nextDouble();
					result = inputNumber * inputNumber;
					System.out.println("The Square of the number " + inputNumber + " is = " + result);
					break;
				// Square root
				case 6:
					System.out.println("Enter the number to find the square root of: ");
					inputNumber = scanner.nextDouble();
					result = Math.sqrt(inputNumber);
					System.out.println("The Square root of the number " + inputNumber + " is = " + result);
					break;
				// Reciprocal
				case 7:
					System.out.println("Enter the number to find the reciprocal of: ");
					inputNumber = scanner.nextDouble();
					result = 1 / inputNumber;
					System.out.println("The Reciprocal of the number " + inputNumber + " is = " + result);
					break;
				default:
					System.out.println("Invalid choice! Please make a valid choice.");

				}
			}

			else {
				System.out.println("Invalid choice! Please make a valid choice.");
			}

			// Check to know if the user wants to contine
			System.out.println("To continue calculation Press 1, else press any other number to exit");
			proceed = scanner.nextInt() == 1 ? true : false;
		} while (proceed == true);

		// Close scanner
		scanner.close();
	}
}
