package dollar;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {

	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What  is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollar will be bought? ");
		double dollarAmount = sc.nextDouble();
		double result = CurrencyConverter.converter(dollarPrice, dollarAmount);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		
		sc.close();
	}
	
}
