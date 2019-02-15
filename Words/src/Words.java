//Write a Java program that asks the user for four words: word1 word2 word3 word4.
//
//Your prompts to the user must be:
//
//Enter 4 words:
//
//Output word1 and the length of word1 and the position of the character 'h' in word1 
//Output word2 and the length of word2 and the position of the character 'o' in word2 
//Output word3 and the length of word3 and the position of the substring "hi" in word3 
//Output word4 and the length of word4 and the position of the substring "low" in word4


import java.util.Scanner;
public class Words {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String word1;
		String word2;
		String word3;
		String word4;
		
		System.out.println("Enter 4 words: ");
		word1 = scnr.next();
		word2 = scnr.next();
		word3 = scnr.next();
		word4 = scnr.next();
		
		
		int posH = word1.indexOf('h');
		int posO = word2.indexOf('i');
		int posHi= word3.indexOf("hi");
		int posLow= word4.indexOf("bee");
		
		System.out.println("Word 1 = "+"\""+word1+"\"" +" Length = "+ word1.length()+" position of 'h' = "+posH);
		System.out.println("Word 2 = "+"\""+word2+"\""+" Length = "+ word2.length()+" position of 'i' = "+posO);
		System.out.println("Word 3 = "+"\""+word3+"\""+" Length = "+ word3.length()+" position of \"hi\" = "+posHi);
		System.out.println("Word 4 = "+"\""+word4+"\""+" Length = "+ word4.length()+" position of \"bee\" = "+posLow);
	}

}