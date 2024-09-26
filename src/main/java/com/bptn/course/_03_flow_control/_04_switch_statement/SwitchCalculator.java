package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		

		// 1. Allow multiple selections	
		// 2. Calculate total price for the order
		// 3. While exiting, show the total price	

		Scanner scanner = new Scanner(System.in);
		
		int choice;
		double totalPrice = 0.0;
		
		double[] priceList = {12.99, 8.99, 9.99, 6.99};
		
		do {
		System.out.println("Welcome to the menu!");
		System.out.println("1. Pizza - $" + priceList[0]);
		System.out.println("2. Burger - $" + priceList[1]);
		System.out.println("3. Pasta - $" + priceList[2]);
		System.out.println("4. Salad - $" + priceList[3]);
		System.out.println("5. Exit");
		System.out.println("Please choose an item from the list: ");
		
		choice = scanner.nextInt();	
				
		switch(choice) {
			case 1: System.out.println("You ordered Pizza!");
					totalPrice += priceList[0];
					break;
			case 2: System.out.println("You ordered Burger!");
					totalPrice += priceList[1];
					break;
			case 3: System.out.println("You ordered Pasta!");
					totalPrice += priceList[2];
					break;
			case 4: System.out.println("You ordered Salad!");
					totalPrice += priceList[3];
					break;
			case 5: 
				if(totalPrice > 0)
					System.out.println("Thank you for stopping by! Your total amount is: " + totalPrice);
				else
					System.out.println("Thank you for stopping by!");
					break;
			default:System.out.println("Invalid Choice!");
		}
		}
		while(choice != 5);
		
	}

}

