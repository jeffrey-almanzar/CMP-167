//Write a program that asks the user for their age in days. The program will compute the person's age in years (you can assume that all years have 365 days) and then prints one of the following messages:
//
//If the user is 1 year old or younger, print: "You are an infant"
//If the user is over 1 year old and 3 years old or younger, print: "You are a toddler"
//If the user is over 3 years old and 12 years old or younger, print: "You are a child"
//If the user is over 12 years old and 19 years old or younger, print: "You are a teenager"
//If the user is over 19 years old and 21 years old or younger, print: "You are a young adult"
//If the user is over 21 years old and 50 years old or younger, print: "You are an adult"
//If the user is over 50 years old but 65 years old or younger, print: "You are middle aged"
//If the user is over 65 years, print: "You are a senior citizen"



import java.util.Scanner;
public class AgeLabel {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userAgeInDays;
		
		System.out.println("Enter an age in number of days :");
		userAgeInDays = scnr.nextInt();
		userAgeInDays = userAgeInDays/365;
		boolean infant = userAgeInDays <=1 ;
		boolean	toddler = userAgeInDays > 1 && userAgeInDays <=3;
		boolean child = userAgeInDays > 3 && userAgeInDays <=12;
		boolean teenager = userAgeInDays > 12 && userAgeInDays<=19;
		boolean youngAdult = userAgeInDays > 19 && userAgeInDays<=21;
		boolean adult = userAgeInDays > 21 && userAgeInDays<= 50;
		boolean middleAge = userAgeInDays > 50 && userAgeInDays<=65;
		
		
		if(infant){
			System.out.println("You are an infant");
		}else if(toddler) {
			System.out.println("You are a toddler");
		}else if (child) {
			System.out.println("You are a child");
		}else if (teenager) {
			System.out.println( "You are a teenager");
		}else if (youngAdult) {
			System.out.println("You are a young adult");
		}else if(adult) {
			System.out.println("You are an adult");
		}else if (middleAge) {
			System.out.println("You are middle aged");
		}else {
			System.out.println("You are a senior citizen");
		}
	}
}
