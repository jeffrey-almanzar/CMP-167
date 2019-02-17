//Jeffrey Almanzar
//Write a program that converts a temperature from Celsius to Fahrenheit. 

import java.util.Scanner;
public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double celsius;
		double fahrenheit;
		
		
		System.out.println("Enter the Celsius Temperature as a decimal:");
		celsius = scnr.nextDouble();
		
		fahrenheit = ((celsius *9) / 5 ) +32;
		
		System.out.printf(celsius+" C = %.1f F",fahrenheit);
		
	}

}
