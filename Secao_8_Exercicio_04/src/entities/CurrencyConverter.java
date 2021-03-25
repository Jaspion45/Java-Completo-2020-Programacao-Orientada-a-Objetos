package entities;

public class CurrencyConverter {
	
	public double dollarPrice;
	public double buyDollar;
	
	public static double IOF = 0.06;
	
	public double result() {
		return dollarPrice * buyDollar * (1.0 + IOF);
	}

}
