package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class VendingMachineSimulation {
		public static void main(String[] args) {
			
			// Import Scanner
			Scanner scanner = new Scanner(System.in);
			
			// Declare Scanner and variables
			//customerOrder, amountToPay
			double amountToPay = 0.0;
			int customerChoice;
			boolean isRestart = false;
			String userInput;
			
			// Display List of Products
			System.out.println("Welcome to the Vending Machine!");
			System.out.println("Available Products: ");
			System.out.println("1. Sweets - $4.99");
			System.out.println("2. Candy - $1.00");
			System.out.println("3. Chocolate Bar - $2.00");
			
			do {
				System.out.print("What do you wish to order? ");
				customerChoice = scanner.nextInt();
				isRestart = false;
				switch(customerChoice) {
					case 1 : System.out.println("How much do you want to pay?");
						amountToPay = scanner.nextDouble();
						if(amountToPay >= 4.99) {
							System.out.println("Your change is: "+(amountToPay-4.99));	
						} else {
							System.out.println("Insufficient Amount");
							
						}
						System.out.print("Do you wish to continue? (y/n): ");
						userInput = scanner.next();
						if(userInput.equals("y")){
							isRestart = true;
						} else {
							isRestart = false;
						}
						isRestart = scanner.nextBoolean();
						break;
					case 2 : System.out.println("How much do you want to pay?");
						amountToPay = scanner.nextDouble();
						if(amountToPay >= 1.00) {
							System.out.println("Your change is: "+(amountToPay-1.00));	
						} else {
							System.out.println("Insufficient Amount");	
						}
						System.out.print("Do you wish to continue? (y/n): ");
						isRestart = scanner.nextBoolean();
						break;
					case 3 : System.out.println("How much do you want to pay?");
						amountToPay = scanner.nextDouble();
						if(amountToPay >= 2.00) {
							System.out.println("Your change is: "+(amountToPay-2.00));	
						} else {
							System.out.println("Insufficient Amount");
							
						}
						System.out.print("Do you wish to continue? (y/n): ");
						isRestart = scanner.nextBoolean();
						break;
					default:System.out.println("Invalid Choice!");
				}
			}while(isRestart);
			
			// Switch for different cases
			
			// Compare userAmount with productPrice
			

		}

	}
