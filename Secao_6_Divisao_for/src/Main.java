import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "divisao" (adaptado de URI 1116) Escreva um algoritmo que leia dois
		 * números e imprima o resultado da divisão do primeiro pelo segundo. Caso não
		 * for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, num, den;
		double resultado;

		System.out.print("Quantos casos voce vai digitar? ");
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.print("Entre com o numerador: ");
			num = sc.nextInt();
			System.out.print("Entre com o denominador: ");
			den = sc.nextInt();
			if (num < 0 && den == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			} 
			else {
				resultado = (double) num / den;
				System.out.printf("DIVISAO = %.2f%n", resultado);
			}
		}

		sc.close();

	}

}
