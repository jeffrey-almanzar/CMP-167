//Jeffrey Almanzar
//Write a program that asks the user for time in days and prints the number of years and days (assume that there are 365 days in a year).

package numDaysYears;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	      Scanner scnr = new Scanner(System.in);
	      int days = 0;
	      int numDays = 0;
	      int numYears = 0;
	      System.out.println("Enter number of days: ");
	      days = scnr.nextInt();
	      scnr.close();
	      numDays = days % 365;
	      numYears = days / 365;
	      
	      System.out.println(numYears +" years and "+ numDays +" days");
	       
	   }
}
