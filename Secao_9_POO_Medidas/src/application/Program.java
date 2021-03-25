package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Medidas;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a medida A: ");
		double a = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		double b = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		double c = sc.nextDouble();
		
		Medidas areas = new Medidas(a, b, c);
		
		System.out.println(areas);
		
		sc.close();

	}

}
