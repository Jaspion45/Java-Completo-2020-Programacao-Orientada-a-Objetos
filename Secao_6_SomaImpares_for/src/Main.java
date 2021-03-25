import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "soma_impares" (adaptado de URI 1071) Leia 2 valores inteiros X e Y
		 * (em qualquer ordem). A seguir, calcule e mostre a soma dos números impares
		 * entre eles.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y, soma;

		soma = 0;

		System.out.println("Digite dois numeros:");
		x = sc.nextInt();
		y = sc.nextInt();

		if (x > y) {
			for (int i = x - 1; i > y; i--) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}

		else {
			for (int i = x; i < y; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}

		System.out.printf("SOMA DOS IMPARES = %d", soma);

		sc.close();

	}

}
