import java.util.Scanner;
public class TelephoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String userInput;
		
		System.out.println("Please enter a telephone number using letters : ");
		userInput = in.nextLine().toUpperCase();
		userInput = userInput.replaceAll("\\s","");
		
		
		String two ="ABC";
		String three ="DEF";
		String four ="GHI";
		String five ="JKL";
		String six ="MNO";
		String seven ="PQRS";
		String eight ="TUV";
		String nine ="WXYZ";
		
		String result= "";
		for (int i=0; i<7; i++) {
			
			if(two.contains(Character.toString(userInput.charAt(i)))){
				result+="2";
			}else if(three.contains(Character.toString(userInput.charAt(i)))){
				result+="3";
			}else if(four.contains(Character.toString(userInput.charAt(i)))){
				result+="4";
			}else if(five.contains(Character.toString(userInput.charAt(i)))){
				result+="5";
			}else if(six.contains(Character.toString(userInput.charAt(i)))){
				result+="6";
			}else if(seven.contains(Character.toString(userInput.charAt(i)))){
				result+="7";
			}else if(eight.contains(Character.toString(userInput.charAt(i)))){
				result+="8";
			}else if(nine.contains(Character.toString(userInput.charAt(i)))){
				result+="9";
			}
			if(result.length() ==3) {
				result+="-";
			}
			
			
		}
		System.out.println(result);
	}

}
