package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Terreno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		double mQuadrado = sc.nextDouble();
		
		Terreno terreno = new Terreno(largura, comprimento, mQuadrado);
		
		System.out.print(terreno);
		
		sc.close();

	}

}
