package com.bridgelabz.oopsprogram;
/*
 * Desc -> Write a program to read in Stock Names, Number of Share, Share Price.
Print a Stock Report with the total value of each Stock and the total value of
Stock.
b. I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of
Share, and Share Price
c. Logic -> Calculate the value of each stock and the total value
d. O/P -> Print the Stock Report.
e. Hint -> Create Stock and Stock Portfolio Class holding the list of Stocks read
from the input file. Have functions in the Class to calculate the value of each
stock and the value of total stocks.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class StockManagement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // scanner for take input from user
		StockPortfolio portfolio = new StockPortfolio();// constructor
		while (true) {
			System.out.println("1-Enter new stock \n2-Display Stock Report \n3-Exit");// display options
			System.out.println("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				portfolio.addStocks();
			}
				break;
			case 2: {
				portfolio.stockReport();
			}
				break;
			case 3: {
				System.out.println("Exited the Program !! ");
				System.exit(0);
			}
			default:
				System.out.println("Invalid Input");
				scanner.close();
			}
		}
	}
}

class Stock {
	ArrayList<String> stockName = new ArrayList<String>();// storing user i/p in arraylist
	ArrayList<Integer> numberOfShares = new ArrayList<Integer>();
	ArrayList<Integer> sharePrice = new ArrayList<Integer>();
	Scanner scanner = new Scanner(System.in);

	// method for adding stocks
	public void addStocks() {
		System.out.print("Enter the stock name: ");// stock name should be in string format.
		stockName.add(scanner.next());

		System.out.print("Enter number of shares present: ");
		numberOfShares.add(scanner.nextInt());

		System.out.print("Enter price of each share: ");
		sharePrice.add(scanner.nextInt());
	}
}

class StockPortfolio extends Stock {
	// create method for display stock report
	public void stockReport() {
		System.out.println("_________________STOCK REPORT_______________");
		for (int i = 0; i < stockName.size(); i++) {
			int total = (numberOfShares.get(i) * sharePrice.get(i));
			System.out.println("Stock name= " + stockName.get(i) + "\nNumber of Shares " + numberOfShares.get(i)
					+ "\nValue of each share= " + sharePrice.get(i) + "\nTotal value of share= " + total);
			System.out.println(" ");

		}

	}
}
