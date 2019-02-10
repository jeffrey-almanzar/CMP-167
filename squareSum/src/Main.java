//Jeffrey Almanzar
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.


import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> firstHundredSq = new ArrayList<Integer>();
		ArrayList<Integer> firstHundred= new ArrayList<Integer>();
		
		//first 100 numbers
		for (int i=1; i<101; i++) {
			firstHundred.add(i);
		}
		
		//first 100 numbers squared
		for (int i=1; i<101; i++) {
			int temp = i*i;
			firstHundredSq.add(temp);
		}
		
		//add the first 100 squared number
		int sumSq =0;
		for(int i=0; i<firstHundredSq.size(); i++) {
			sumSq += firstHundredSq.get(i);
		}
		
		
		//add the first 100 numbers
		int sum =0;
		for(int i=0; i<firstHundred.size(); i++) {
			sum += firstHundred.get(i);
		}
		
		sum = sum*sum; //square the the first 100 numbers
		
		int result = sum - sumSq;
		
		System.out.println(result);
		
		
		
	}

}
