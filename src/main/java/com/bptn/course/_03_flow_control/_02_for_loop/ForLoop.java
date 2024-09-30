package com.bptn.course._03_flow_control._02_for_loop;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int count = 1;

		do {
			System.out.println("Enter a password: ");
			String passwordInput = scanner.nextLine();
			
			String password = "Password";
			if (password.equals(passwordInput)) {
				System.out.println("Access granted");
				break;
			}else {
				System.out.println("Access denied");
				count++;
			}
		} while (count <= 3);
		scanner.close();
	}
}
