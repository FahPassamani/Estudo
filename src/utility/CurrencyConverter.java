package utility;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double dolarToReal(double dollarBought, double dollarPrice) {
		return dollarBought * dollarPrice * (1.0 + IOF);
	}

}
