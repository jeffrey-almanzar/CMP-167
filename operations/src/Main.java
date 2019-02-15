//Write a program that asks the user for three integers (firstInt, secondInt, thirdInt). Perform the following operations and output the results:
//
//firstResult = Add firstInt and secondInt then divide the result by thirdInt
//secondResult = Multiply secondInt by thirdInt and divide result by the sum of secondInt and firstInt
//thirdResult = Multiply firstInt by thirdInt and find the remainder of dividing the result by secondInt


import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int firstInt = 1;
		int secondInt = 1;
		int thirdInt = 1;
		Scanner scnr = new Scanner(System.in);
				
		System.out.println("Enter firstInt: ");
		scnr.nextInt();
		System.out.println("Enter secondtInt: ");
		scnr.nextInt();
		System.out.println("Enter thirdInt: ");
		scnr.nextInt();
		
		double firstResult = (double)(firstInt + secondInt)/thirdInt;
		double secondResult = (double)(secondInt * thirdInt)/(firstInt + secondInt);
		int thirdResult = (firstInt *thirdInt )% secondInt;
		scnr.close();
		
		System.out.println("First result = "+firstResult);
		System.out.println("Second result = "+secondResult);
		System.out.println("Third result = "+thirdResult);
		
	}
}
