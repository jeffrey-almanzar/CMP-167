
import java.util.Scanner;
import java.util.ArrayList;
public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int userInput = 0;
		ArrayList<Integer> grades = new ArrayList<Integer>();
		int As = 0;
		int A_minus = 0;
		int Bs = 0;
		int B_plus =0;
		int B_minus = 0;
		int Cs = 0;
		int C_minus = 0;
		int C_plus = 0;
		int Ds = 0;
		int Es = 0;
		int Fs = 0;
		
		
		do {
			System.out.println("Enter a grade: ");
			userInput = scnr.nextInt();
			if(userInput > 0) {
				grades.add(userInput);
			}
		}while(userInput > 0);
		
		for (int i = 0; i<grades.size(); i++) {
			int grade = grades.get(i);
			if(grade>= 93 && grade<=100) {
				As++;
			}else if(grade>=90 && grade < 93) {
				A_minus++;
			}else if(grade>= 87 && grade <90 ) {
				B_plus++;
			}else if(grade >= 83 && grade< 87 ) {
				Bs++;
			}else if(grade >= 80 && grade< 83 ) {
				B_minus++;
			}else if(grade >= 77 && grade< 80 ) {
				C_plus++;
			}else if(grade >= 73 && grade< 77 ) {
				Cs++;
			}else if(grade >= 70 && grade< 73 ) {
				C_minus++;
			}else if(grade >= 60 && grade< 70 ){
				Ds++;
			}else {
				Fs++;
			}
			
		}
		
		System.out.println("Total number of grades = "+grades.size());
		System.out.println("Number of A's  = "+As);
		System.out.println("Number of A-'s = "+A_minus);
		System.out.println("Number of B+'s = "+B_plus);
		System.out.println("Number of B's  = "+Bs);
		System.out.println("Number of B-'s = "+B_minus);
		System.out.println("Number of C+'s = "+C_plus);
		System.out.println("Number of C's  = "+Cs);
		System.out.println("Number of C-'s = "+C_minus);
		System.out.println("Number of D's  = "+Ds);
		System.out.println("Number of F's  = "+Fs);
		
		scnr.close();
		
	}

	
}
