package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota = sc.nextDouble();
		Notas primeira = new Notas(nota);
		
		System.out.print("Digite a segunda nota: ");
		nota = sc.nextDouble();
		Notas segunda = new Notas(nota);
		
		double media = Notas.media(primeira, segunda);
		
		if (media >= 60.0) {
			System.out.printf("NOTA FINAL = %.1f", media);
		}
		else {
			System.out.printf("NOTA FINAL = %.1f%n", media);
			System.out.println("REPROVADO");
		}
		
		sc.close();

	}

}
