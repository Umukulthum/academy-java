package com.bptn.course._06_oop;

public class BankSystem {

	public static void main(String[] args) {

		BankAccount testAccount = new BankAccount("987654", 1200.00);
		testAccount.displayAccountInfo();

		BankAccount newTestAccount = new BankAccount("123456", 600.00);
		newTestAccount.displayAccountInfo();

		SavingsAccount mySavingsAccount = new SavingsAccount("SAVINGS123", 500.00, 1.00);
		mySavingsAccount.appyInterest();
		mySavingsAccount.displayAccountInfo();

		ChequingAccount chequing = new ChequingAccount("1234", 500, 200);
		chequing.withdraw(300);
		chequing.displayAccountInfo();
	}

}
