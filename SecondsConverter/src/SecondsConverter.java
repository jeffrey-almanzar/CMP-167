//Jeffrey Almanzar
//Write a program that converts a total number of seconds to hours, minutes, and seconds. 
import java.util.Scanner;
public class SecondsConverter {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int inseconds;
		int hours;
		int minutes;
		int totalMinutes;
		
		System.out.println("Enter the number of seconds:");
		inseconds = scnr.nextInt();
		totalMinutes = inseconds / 60;
		
		hours = totalMinutes /60;
		minutes = totalMinutes % 60;
		int outseconds = inseconds % 60;
		
		System.out.println(inseconds+" seconds = "+hours+" hours, "+ minutes+" minutes, and "+outseconds+" seconds");
		System.out.printf(inseconds+" seconds = %02dh:%02dm:%02ds", hours,minutes,outseconds);
		
	}
}
