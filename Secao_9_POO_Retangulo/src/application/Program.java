package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base do retangulo: ");
		double base = sc.nextDouble();
		System.out.print("Base do altura: ");
		double altura = sc.nextDouble();
		
		Retangulo retangulo = new Retangulo(base, altura);
		
		System.out.println(retangulo);
	
		/*Possivel imprimir dessa forma quando não usar o toString na outra classe.
		System.out.printf("AREA = %.4f%n", retangulo.calArea());
		System.out.printf("PERIMETRO = %.4f%n", retangulo.calPerimetro());
		System.out.printf("DIAGONAL = %.4f%n", retangulo.calDiagonal());*/
		
		sc.close();

	}

}
