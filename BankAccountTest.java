package com.dhang.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount(75.00,75.00);
		BankAccount account2 = new BankAccount(100.00,100.00);
		
		
		System.out.println(BankAccount.totalAccounts);

		System.out.println(account1.getAccountNum());
		System.out.println(account2.getAccountNum());

		account1.deposit("checking", 300.00);
		System.out.println(account1.getCheckingBalance());
		account1.deposit("savings", 200.00);
		System.out.println(account2.getSavingsBalance());
		
		System.out.println("Checking: " + account1.getCheckingBalance());
		System.out.println("Savings: " + account2.getSavingsBalance());
		
		account1.withdraw("checking", 1000.00);
		account1.withdraw("savings", 50.00);
		
		
	}

}
