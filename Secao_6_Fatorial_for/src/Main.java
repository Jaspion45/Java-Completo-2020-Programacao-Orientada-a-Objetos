import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "fatorial" Fazer um programa para ler um número natural N (valor
		 * máximo: 15), e depois calcular e mostrar o fatorial de N.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int fatorial = 1;

		System.out.print("Digite o valor de N: ");
		int N = sc.nextInt();

		for (int i = 2; i <= N; i++) {
			fatorial *= i;
		}

		System.out.printf("FATORIAL = %d", fatorial);

		sc.close();

	}

}
