//Jeffrey Almanzar

import java.util.Scanner;
import java.util.ArrayList;


public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String mode;
		double result = 0.0;
		char continueProgram;
		
		while(true) {
			
			mode = getMode(input); //passing Scanner object
			
			if (mode.equals("Standard")) {
				System.out.println("The calculator will operate in standard mode.");
				result = Calculate(input, mode); 
				
			}else if(mode.equals("Scientific")) {
				System.out.println("The calculator will operate in scientific mode.");
				result = Calculate(input, mode);	 
			}
			
			System.out.println("Result: "+result);
			
			System.out.println("Do you want to start over? (Y/N)");
			
			continueProgram = input.next().charAt(0);
			
			if (continueProgram =='N' || continueProgram =='n') {
				break;
			}
		}
		
		System.out.println("Goodbye");
	input.close();
	}
	
//################
//	HELPER METHODS
//################	
	
	//prints the available operations
	public static void printInstructions(String mode) {
		
		if (mode.equals("Standard")) {
			System.out.println("Enter '+' for addition, '-' "
					+ "for subtractions, '*' for multiplication, "
					+ "'/' for division");
			
		}else if(mode.equals("Scientific")) {
			System.out.println("Enter '+' for addition, '-' "
					+ "for subtractions, '*' for multiplication, "
					+ "'/' for division, 'sin' for sin x, 'cos' for"
					+ " cos x, 'tan' for tan x:");	 
		}
	}
	
	//gets claculator's mode
	public static String getMode(Scanner input) {
		String mode;
		String message= "Enter the calculator mode: Standard/Scientific?";
		
		
		while(true) {
			System.out.println(message);
			mode = input.next();
			if (mode.equals("Standard") || mode.equals("Scientific")) {
				break;
			}
			message = "Invalid mode. Try again.";
			
		}
		
		return mode;
	}
	
	//get x numbers from the user and returns them in a ArrayList
	public static ArrayList<Double> getNumbers(int size, Scanner input) {
			ArrayList<Double> numbers= new ArrayList<Double>();
			System.out.println("Enter "+size+" numbers");
			
			while(size>0) {
				numbers.add(input.nextDouble());
				size--;
			}
			

			return numbers;
		}
	
	//performs the indicated operations
	public static Double Calculate(Scanner input, String mode) {
		ArrayList<Double> numbersList;
		ArrayList<Character> operationsSuported = new ArrayList<Character>();
		int numbers;
		char operation;
		Double trigNumber;
		Double result = 0.0;
		
		operationsSuported.add('+');
		operationsSuported.add('-');
		operationsSuported.add('*');
		operationsSuported.add('/');
		operationsSuported.add('s');
		operationsSuported.add('c');
		operationsSuported.add('t');
		
		printInstructions(mode);
		operation = input.next().charAt(0);
		
		while(!(operationsSuported.contains(operation))) { //until a valid operation is enteredS
			System.out.println("Invalid operation entered");
			System.out.println("");
			printInstructions(mode);
			operation = input.next().charAt(0);
		}
		
		
		switch(operation){
			case '+':
				System.out.println("How many numbers do you want to add?");
				numbers = input.nextInt();
				numbersList = getNumbers(numbers,input);
				result = add(numbersList);
				break;
				
			case '-':
				System.out.println("How many numbers do you want to subtract?");
				numbers = input.nextInt();
				numbersList = getNumbers(numbers,input);
				result = sub(numbersList);
				break;
				
			case '*':
				System.out.println("How many numbers do you want to multiply?");
				numbers = input.nextInt();
				numbersList = getNumbers(numbers, input);
				result = multiply(numbersList);
				break;
				
			case '/':
				System.out.println("How many numbers do you want to divide?");
				numbers = input.nextInt();
				numbersList = getNumbers(numbers, input);
				result = divide(numbersList);
				break;
			
			case 's':
				System.out.println("Enter number in radians to find sin:");
				trigNumber = input.nextDouble();
				result = sin(trigNumber);
				break;
				
			case 'c':
				System.out.println("Enter number in radians to find cos:");
				trigNumber = input.nextDouble();
				result = cos(trigNumber);
				break;
				
			case 't':
				System.out.println("Enter number in radians to find tan:");
				trigNumber = input.nextDouble();
				result = tan(trigNumber);
				break;
				
				
		}

		return result;
	}
	
	
	
//################
//	OPERATIONS
//################
	
	//Addition
	public static Double add(ArrayList<Double> array) {
		
		Double result = 0.0;
		
		for (int i =0; i<array.size(); i++) {
			result += array.get(i);
		}
		
		return result;
	}
	
	//Subtraction
	public static Double sub (ArrayList<Double> array) {
		
		Double result = array.get(0); //getting and removing the first number in the list.
		array.remove(0);
		
		for (int i =0; i<array.size(); i++) {
			result -= array.get(i);
		}
		
		return result;
	}
	
	//Division
	public static Double divide (ArrayList<Double> array) {
		
		Double result = array.get(0); //getting and removing the first number in the list.
		array.remove(0);
		
		for (int i =0; i<array.size(); i++) {
			Double num = array.get(i);
			if (num ==0) {
				System.out.println("You're dividing by 0, expect a wrong answer.");
				result = -1.0;
			}
			result /= num;
		}
		
		return result;
	}
	
	//Multiplication
	public static Double multiply (ArrayList<Double> array) {
		
		Double result = 1.0;
		
		for (int i =0; i<array.size(); i++) {
			result *= array.get(i);
		}
		
		return result;
	}
	
	//Sin
	public static Double sin(Double x) {
		return Math.sin(x);
	}
	
	//Cos
	public static Double cos(Double x) {
		return Math.cos(x);
	}
	
	//Tan
	public static Double tan(Double x) {
		return Math.tan(x);
	}

}
