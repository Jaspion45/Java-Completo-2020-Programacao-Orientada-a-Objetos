package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bhaskara;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Coeficiente a: ");
		double a = sc.nextDouble();
		System.out.print("Coeficiente b: ");
		double b = sc.nextDouble();
		System.out.print("Coeficiente c: ");
		double c = sc.nextDouble();
		
		Bhaskara raiz = new Bhaskara(a, b, c);
		
		if (raiz.calDelta() < 0) {
			System.out.println("Essa equacao nao possui raizes reais");
		}
		else {
			System.out.printf("X1 = %.4f%n", raiz.calX1());
			System.out.printf("X2 = %.4f%n", raiz.calX2());
		}
		
		sc.close();

	}

}
