import java.util.Random;
import java.util.Scanner;
public class GuessValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		int user = 0;
		
		num = rand.nextInt(100)+1;
				
		System.out.println("Enter a number");
		
		user = input.nextInt();
		
		System.out.println("Your number: "+user);
		System.out.println("Your number: "+num);
		
		System.out.println("Your missed by :"+Math.abs((user-num)));
		input.close();
	}

}
