package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Troco;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preço unitário do produto: ");
		double precoPro = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		int quantidade = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		double dinRecebido = sc.nextDouble();
		
		Troco troco = new Troco(precoPro, quantidade, dinRecebido);
		
		System.out.printf("TROCO = %.2f", troco.conta());
		
		sc.close();

	}

}
