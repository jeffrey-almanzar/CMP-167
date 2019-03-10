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
		
			System.out.println("Enter the calculator mode: Standard/Scientific?");
			mode = input.nextLine();
			while(!(mode.equals("Standard") ||mode.equals("Scientific"))) {
				System.out.println("Invalid mode. Try again");
				mode = input.nextLine();
			}
			
			
			if (mode.equals("Standard")) {
				result = Calculate(input); //passing Scanner object
				
			}else if(mode.equals("Scientific")) {
				result = Calculate(input);	 //passing Scanner object
			}
			
			
			System.out.println("Result: "+result);
			
			System.out.println("Start over? Y/N");
			continueProgram = input.next().charAt(0);
			
			if (continueProgram =='N' || continueProgram =='n') {
				break;
			}
			
			
		}
		
	input.close();
	}
	
//################
//	HELPER METHODS
//################	
	
	//prints the available operations
	public static void printInstructions() {
		System.out.println("Enter '+' for addition, '-' "
				+ "for subtractions, '*' for multiplication, "
				+ "'/' for division, 'sin' for sin x, 'cos' for"
				+ " cos x, 'tan' for tan x:");
	}
	
	
	//performs the indicated operations
	public static Double Calculate(Scanner input) {
		ArrayList<Double> numbersList;
		int numbers;
		char operation;
		printInstructions();
		operation = input.next().charAt(0);
		
		Double result = 0.0;
		
		switch(operation){
			case '+':
				System.out.println("How many numbers do you want to add:");
				numbers = input.nextInt();
				numbersList = getNumbers(numbers,input);
				result = add(numbersList);
				break;
				
			case '-':
				System.out.println("How many numbers do you want to subtract:");
				numbers = input.nextInt();
				numbersList = getNumbers(numbers,input);
				result = sub(numbersList);
				break;
				
			case 'x':
				System.out.println("How many numbers do you want to multiply:");
				numbers = input.nextInt();
				numbersList = getNumbers(numbers, input);
				result = multiply(numbersList);
				break;
				
			case '/':
				System.out.println("How many numbers do you want to divide:");
				numbers = input.nextInt();
				numbersList = getNumbers(numbers, input);
				result = divide(numbersList);
				break;
				
		}

		return result;
	}
	
	//get x numbers from the user and returns them in a ArrayList
	public static ArrayList<Double> getNumbers(int size, Scanner input) {
		ArrayList<Double> numbers= new ArrayList<Double>();
		System.out.println("Enter "+size+" numbers:");
		
		while(size>0) {
			numbers.add(input.nextDouble());
			size--;
		}
		
		return numbers;
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
			result /= array.get(i);
		}
		
		return result;
	}
	
	//Multiplication
	public static Double multiply (ArrayList<Double> array) {
		
		Double result = 0.0;
		
		for (int i =0; i<array.size(); i++) {
			result /= array.get(i);
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
