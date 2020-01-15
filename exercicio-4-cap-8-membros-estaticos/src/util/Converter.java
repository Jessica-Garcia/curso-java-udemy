package util;

public class Converter {

	public static final double IOF = 0.06;
	
	public static double dollarToReal(double amount, double dollarPrice) {
		return amount * dollarPrice + amount * dollarPrice * IOF;
	}
}
