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
	}
	public static double change(double cost, double payAmount) {
		
		
	
	
	
	return ;
	}
	
	
}
