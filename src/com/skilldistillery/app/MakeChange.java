package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		welcome();
		System.out.println("Please enter the cost of the item being purchased: ");
		double itemPrice = scan.nextDouble();
		System.out.println("Please enter the amount tendered by the customer: ");
		double payment = scan.nextDouble();
		double changeToCust = change(itemPrice, payment);
		System.out.println(changeToCust);
		
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
		
		if (payAmount < cost) {
			System.out.println("Pay up sucka! You're a few coins short!");
		}
		else if (cost < 20 && cost > 10) {
			changeToCust = cost - payAmount;
			System.out.println("10 or less");
		}
		else if (cost >= 5.0) {
			changeToCust = cost - payAmount;
			System.out.println("5 or less");
		}
		else if (cost <= 1.0) {
			changeToCust = cost - payAmount;
			System.out.println("1 or less");
		}
		else {
			
		}
		
			
		
		
	
	
	
	return changeToCust;
	}
	
	
}
