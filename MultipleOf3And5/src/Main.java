//Jeffrey almanzar
//Find the sum of all the multiples of 3 or 5 below 1000.

import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int totalSum = 0;
		
		
		for (int i = 1; i<1000; i++) {
			if (i%3==0 || i%5==0) {
				numbers.add(i);
			}
		}
		
		for (int i=0; i<numbers.size(); i++) {
			totalSum+= numbers.get(i);
		}
		
		System.out.println("Total sum is: "+ totalSum);
		
	}

}
