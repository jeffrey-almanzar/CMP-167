//Write a Java program that asks the user for a date entered as 4 integers: dayNumber monthNumber date year. Where:
//
//dayNumber
//An integer from 1-7, where 1 = Sunday, 2 = Monday, ..., 7 = Saturday
//monthNumber
//An integer from 1-12, where 1 = January, 2 = February, ..., 12 = December
//date
//An integer from 1-31 representing the date.
//year
//An integer representing the year.



import java.util.Scanner;
public class DateConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dayNumber;
		int monthNumber;
		int yearNumber;
		int dateNumber;
		
		System.out.println("Enter 4 integers representing dayNumber monthNumber date year:");
		dayNumber = input.nextInt();
		monthNumber = input.nextInt();
		dateNumber = input.nextInt();
		yearNumber = input.nextInt();
		input.close();
		
		String[] months = {"January",
		"February",		
		"March",
		"April",
		"May",
		"June",
		"July",
		"August",
		"September",
		"October",
		"November",
		"December"
		};
		
		String [] days= {
		"Sunday",
		"Monday",
		"Tuesday",
		"Wednesday",
		"Thursday",
		"Friday",
		"Saturday"
		
		
		};
		
		String monthName="";
		String dayName="";
		
		for (int i=0; i<12; i++) {
			if (monthNumber ==i+1) {
				monthName = months[i];
			}
			
		}
		
		for (int i=0; i<7; i++) {
			if (dayNumber ==i+1) {
				dayName = days[i];
			}
			
		}
		
		
		boolean noLeapYear = (yearNumber == 1900)||(yearNumber==2100) || (yearNumber % 4 != 0);
		boolean validDate = (dateNumber>=30 && monthNumber ==2) || (dateNumber>30 && (monthNumber==4 ||monthNumber==6 || monthNumber==9 || monthNumber==11));
		
		if (!(dayNumber>=1 && dayNumber<=7)) {
			System.out.println("Invalid day number: "+dayNumber+", please enter a number from 1..7.");
		
		}else if(!(monthNumber>=1 && monthNumber<=12)) {
			System.out.println("Invalid month number: "+monthNumber+", please enter a number from 1..12.");
		
		}else if(!(dateNumber>=1 && dateNumber<=31)) {
			System.out.println("Invalid day number: "+dateNumber+", please enter a number from 1..31.");
		
		}else if(monthNumber==2 && dateNumber==29 && noLeapYear ) {
			System.out.println("Invalid date: "+yearNumber+" is not a leap year, February does not have "+dateNumber+" days, please enter a valid date.");
			
		
		}else if(validDate) {
			System.out.println("Invalid date: "+monthName+", does not have "+dateNumber+" days, please enter a valid date.");
		
		}else {
			
			System.out.println(dayNumber +" "+ monthNumber+" "+ dateNumber +" "+yearNumber+" is "+dayName+" "+ monthName+" "+ dateNumber+", "+ yearNumber);
		}
	}
	
	
}

