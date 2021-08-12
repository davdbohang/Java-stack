package com.dhang.bankaccount;

import java.util.Random;

public class BankAccount {
	
	// Member Variables (attributes)
	private String accountNum;
	private double checkingBalance;
	private double savingsBalance;
	
	// Class Variables
	static int totalAccounts;
	private static double totalAmount;
	
	
	// Constructor
	// Empty Constructor
	public BankAccount() {
		totalAccounts++;
	}
	// Full Constructor
	public BankAccount(double checkingBalance, double savingsBalance) {
		super();
		this.accountNum = generateAccountNum();
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		totalAccounts++;
	}

	// Other Methods
	public void deposit(String accountType, double amount) {
		// Check which account type
		if (accountType == "checking") {
			System.out.println("Desposited in Checking");
			this.checkingBalance += amount;
		}
		else if (accountType == "savings") {
			System.out.println("Deposited in Savings");
			this.savingsBalance += amount;
		}
	}
	
	public void withdraw(String accountType, double amount) {
		if ( amount > this.getCheckingBalance() && accountType == "checking") {
			System.out.println("Insufficient funds in Checking");
		}
		else if ( amount > this.getSavingsBalance() && accountType == "savings") {
			System.out.println("Insufficient funds in Savings");
		}
		else if (amount < this.getCheckingBalance() && accountType == "checking") {
			System.out.println("Withdrew from Checking");
			this.checkingBalance -= amount;
		}
		else if (amount < this.getSavingsBalance() && accountType == "savings") {
			System.out.println("Withdrew from Savings: " + amount);
			this.savingsBalance -= amount;
		}


	}
	
	
	
	private String generateAccountNum() {
		// Generate Random Number
		Random generator = new Random();
		String accountNum = "";
		// Create a FOR LOOP
		for(int i = 0; i < 10; i++) {
			int num = generator.nextInt(10);
			accountNum += num;
		}
		return accountNum;
	}
	
	
	// Getters and Setters
	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static int getTotalAccounts() {
		return totalAccounts;
	}
	public static void setTotalAccounts(int totalAccounts) {
		BankAccount.totalAccounts = totalAccounts;
	}


	
}
