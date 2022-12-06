package com.bridgelabz.oopsprogram;
/*
 * Modify class Account to provide a method called debit that withdraws money from an Account. 
 * Ensure that the debit amount does not exceed the Account’s balance. If it does, the balance 
 * should be left unchanged and the method should print a message indicating ―Debit amount exceeded account balance.
Modify class AccountTest to test method debit.
 */
import java.util.Scanner;

public class Account {
	double balance;  //variables

	// Constructor
	public Account(double balance) {
		this.balance = balance;
	}

	// Debit method to check account balance and debit some amount
	public void debitMethod() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount for debit through account:");
		int debitAmount = scanner.nextInt();
		if (debitAmount < balance) {
			balance -= debitAmount;		//exceeded balance
			System.out.println("Debit amount is : " + debitAmount);
			System.out.println("Account balance after update : " + balance);
		} else {
			System.out.println("Debit amount exceeded Account balance");
			scanner.close();
		}
	}
	//main method
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the account balance : ");
		Account account = new Account(scanner.nextDouble());
		account.debitMethod();	//method calling
		scanner.close();
	}

}
