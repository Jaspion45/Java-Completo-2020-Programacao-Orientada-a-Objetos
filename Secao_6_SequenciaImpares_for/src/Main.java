import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "sequencia_impares" (adaptado de URI 1067) Leia um valor inteiro X.
		 * Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X,
		 * se for o caso.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 0;

		System.out.print("Digite o valor de X: ");
		x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			if (i % 2 != 0) {
				System.out.printf("%d%n", i);
			}
		}

		sc.close();

	}

}
