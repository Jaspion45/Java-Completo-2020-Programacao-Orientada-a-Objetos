package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		CurrencyConverter converter = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		converter.dollarPrice = sc.nextDouble();
		System.out.print("How Many dollars will be bought? ");
		converter.buyDollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", converter.result());
		
		sc.close();

	}

}
