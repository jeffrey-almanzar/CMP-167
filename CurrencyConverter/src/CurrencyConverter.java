import java.util.Scanner;
public class CurrencyConverter {
	
	public static void main(String[] args) {
		
		double mexicoCurrency;
		double guatemalaCurrency;
		double salvadoranCurrency;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of Mexican Pesos: ");
		mexicoCurrency = input.nextInt();
		
		System.out.println("Enter number of Guatemalan Quetzals: ");
		guatemalaCurrency = input.nextInt();
		
		System.out.println("Enter number of Salvadoran Colons: ");
		salvadoranCurrency = input.nextInt();
		
		input.close();
		
		System.out.println("");		
		System.out.println("The current exchange rates for these currencies is: ");
		System.out.println("");	
		System.out.println("\t1 Mexican Peso = 0.051 US $ ");
		System.out.println("\t1 Guatemalan Quetzal = 0.129 US $ ");
		System.out.println("\t1 Salvadoran Colon = 0.114 US $");
		System.out.println("");	
		
		System.out.println("Dollar conversions respectively:");
		System.out.println("");
		System.out.println("\tUS Dollars = "+(mexicoCurrency * 0.051) + "$");
		System.out.println("\tUS Dollars = "+(guatemalaCurrency * 0.129) + "$");
		System.out.println("\tUS Dollars = "+(salvadoranCurrency * 0.114) + "$");
		
	}

}
