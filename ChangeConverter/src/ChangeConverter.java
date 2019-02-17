//Jeffrey Almanzar
//Write a program that converts change into formatted dollars and cents.

import java.util.Scanner;
public class ChangeConverter {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int quaters;
		int dimes;
		int nickels;
		int pennies;
		
		System.out.println("Enter the number of quarters:");
		quaters = scnr.nextInt();
		
		System.out.println("Enter the number of dimes:");
		dimes = scnr.nextInt();
		
		System.out.println("Enter the number of nickels:");
		nickels = scnr.nextInt();
		
		System.out.println("Enter the number of pennies:");
		pennies = scnr.nextInt();
		
		System.out.println("You entered:");
		System.out.println("\t" + quaters + " quarters");
		System.out.println("\t" + dimes + " dimes");
		System.out.println("\t" + nickels + " nickels");
		System.out.println("\t" + pennies + " pennies");
		
		quaters*=25;
		dimes*=10;
		nickels*=5;
		
		int totalInput = quaters + dimes + nickels + pennies;
		double dollars = (double)totalInput/100;
		System.out.printf("The total in dollars is $%.2f",dollars);
	}

}
