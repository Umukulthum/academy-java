package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int input;
		double[] prices = {10.00, 30.00, 50.00, 70.00}; 
		
		System.out.println("Welcome to the Mobile Data Plan Selector!");
		System.out.println("Please select a data plan:");
		System.out.println("1. 1GB -$" + prices[0]);
		System.out.println("2. 5GB -$" + prices[1]);
		System.out.println("3. 10GB -$" + prices[2]);
		System.out.println("4. Unlimited -$" + prices[3]);
		System.out.println("5. Exit");
		
		System.out.print("Enter the number corresponding to your choice: ");

		input = scanner.nextInt();
		switch(input) {
		case 1:
			System.out.println("You have selected the 1GB plan");
			System.out.println("The total cost of your selected plan is: $" + prices[0]);
			break;
		case 2:
			System.out.println("You have selected the 5GB plan");
			System.out.println("The total cost of your selected plan is: $" + prices[1]);
			break;
		case 3:
			System.out.println("You have selected the 10GB plan");
			System.out.println("The total cost of your selected plan is: $" + prices[2]);
			break;
		case 4:
			System.out.println("You have selected the Unlimited plan");
			System.out.println("The total cost of your selected plan is: $" + prices[3]);
			break;
		case 5:
			System.out.print("See you soon!");
			break;
		default: System.out.print("Invalid input!");
		}

	}

}
