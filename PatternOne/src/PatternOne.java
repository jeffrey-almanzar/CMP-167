import java.util.Scanner;
public class PatternOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int userNum;
		
		System.out.println("Please enter a number 1...9 : ");
		userNum = in.nextInt();
		
		int n = 1;
		
		while(n<=userNum) {
			for(int i = 0; i < n; i++) {
				System.out.print((i+1)+" ");
			}
			System.out.println("");
			n++;
		}
			
		

	}

}
