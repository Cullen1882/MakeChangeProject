package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		welcome();
		System.out.print("Please enter the cost of the item being purchased: ");
		double itemPrice = scan.nextDouble();
		System.out.print("Please enter the amount tendered by the customer: ");
		double payment = scan.nextDouble();
		double changeToCust = change(itemPrice, payment);
		System.out.println("Your change is: " + changeToCust);

	}

	public static void welcome() {
		System.out.println("*****************************");
		System.out.println("******* CASH REGISTER *******");
		System.out.println("*****************************");
		System.out.println("*****************************");
		System.out.println("*****************************");
		System.out.println("*****************************");
		System.out.println("*****************************");
		System.out.println("***** ALWAYS MAKE SURE ******");
		System.out.println("********* TO COUNT **********");
		System.out.println("******** YOUR DRAWER ********");
		System.out.println("*****************************");
	}

	public static double change(double cost, double payAmount) {
		double changeToCust = 0.0;
		double changeBreakdown = 0.0;
		int tens = 0, fives = 0, ones = 0, quarters = 0, dimes = 0, nickels = 0, pennies = 0;

		if (cost < payAmount) {
			changeToCust = payAmount - cost;
			changeBreakdown = (changeToCust * 100);
			while (changeBreakdown > 0.0) {
				if (changeBreakdown % 1000 != changeBreakdown) {
					tens += 1;
					changeBreakdown -= 1000;
				}
				else if (changeBreakdown % 500 != changeBreakdown) {
					fives += 1;
					changeBreakdown -= 500;
					}
				else if (changeBreakdown % 100 != changeBreakdown) {
					ones += 1;
					changeBreakdown -= 100;
					}
				else if (changeBreakdown % 25 != changeBreakdown) {
					quarters += 1;
					changeBreakdown -= 25;
					}
				else if (changeBreakdown % 10 != changeBreakdown) {
					dimes += 1;
					changeBreakdown -= 10;
					}
				else if (changeBreakdown % 5 != changeBreakdown) {
					nickels += 1;
					changeBreakdown -= 5;
					}
				else if (changeBreakdown % 1 != changeBreakdown) {
					pennies += 1;
					changeBreakdown -= 1;
					}
			}
		}
		 else if (payAmount == cost) {
			changeToCust = cost - payAmount;
			System.out.println("You've tendered the exact amount. Thank You");
		} else {
			System.out.println("You didn't pay enough, put more money in my hand.");
		}
		while (tens != 0 || fives != 0 || ones != 0 || quarters != 0 
				|| dimes != 0 || nickels != 0 || pennies != 0) {
			
		
			if (tens > 0) {
				System.out.println(tens + ": $10 bill(s)");
				tens -= 1;
		}
			else if (fives > 0) {
				System.out.println(fives + ": $5 bill(s)");
				fives -= 1;
		}
			else if (ones > 0) {
				System.out.println(ones + ": $1 bill(s)");
				ones -= 1;
		}
			else if (quarters > 0) {
				System.out.println(quarters + ": Quarter(s)");
				quarters -= 1;
		}
			else if (dimes > 0) {
				System.out.println(dimes + ": Dime(s)");
				dimes -= 1;
		}
			else if (nickels > 0) {
				System.out.println(nickels + ": Nickel(s)");
				nickels -= 1;
		}		
			else if (pennies > 0) {
				System.out.println(pennies + ": Pennies");
				pennies -= 1;
		}
		}
		return changeToCust;
	}

}
