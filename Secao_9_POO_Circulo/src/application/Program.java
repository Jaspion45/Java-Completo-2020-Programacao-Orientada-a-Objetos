package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio do circulo: ");
		double raio = sc.nextDouble();
		
		Circulo area = new Circulo(raio);
		
		System.out.printf("AREA = %.3f", area.calculo());
		
		sc.close();

	}

}
