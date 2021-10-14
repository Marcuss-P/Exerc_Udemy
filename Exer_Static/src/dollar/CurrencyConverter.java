package dollar;

public class CurrencyConverter {

	public static double IOF = 0.06;
	
	public static double converter(double dollarPrice, double dollarAmount) {
		
		return dollarAmount *dollarPrice* (1.0 + IOF);
		
	}
	
}
