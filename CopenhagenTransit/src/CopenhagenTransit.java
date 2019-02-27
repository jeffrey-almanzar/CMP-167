//Write a program that computes the fare on the Copenhagen Transit system given two inputs from the user:
//
//The zone number.
//The passenger type.

import java.util.Scanner;
public class CopenhagenTransit {
	public static void main(String[] args) {
		Scanner sncr = new Scanner(System.in);
		
		System.out.println("Enter zone number :");
		int zoneNumber = sncr.nextInt();
		
		System.out.println("Enter adult or child :");
		String person = sncr.next();
		
		double fare = 0.0;
		if ((zoneNumber<=2) && person.equals("adult")) {
			fare = 23.0;
		}else if((zoneNumber<=2) && person.equals("child") ) {
			fare = 11.5;
		}else if ((zoneNumber==3) && person.equals("adult")) {
			fare = 34.5;
		}else if((zoneNumber==3 || zoneNumber==4) && person.equals("child")) {
			fare = 23.0;
		}else if((zoneNumber==4) && person.equals("adult")) {
			fare = 46.0;
		}else if (zoneNumber>4 ) {
			fare = -1.00;
		}
		
		System.out.println("The fare for "+person +" to zone number "+zoneNumber+" is "+ fare+".");
		
		
	}

}
