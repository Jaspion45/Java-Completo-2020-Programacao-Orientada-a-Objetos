import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "par_impar" (adaptado de URI 1074) Leia um valor inteiro N. Este
		 * valor será a quantidade de números inteiros que serão lidos em seguida. Para
		 * cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou
		 * IMPAR, e também se é POSITIVO ou NEGATIVO. No caso do valor ser igual a zero
		 * (0), seu programa deverá imprimir apenas NULO.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, num;

		System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			num = sc.nextInt();
			if (num % 2 != 0 && num < 0) {
				System.out.println("IMPAR NEGATIVO");
			} 
			else if (num % 2 == 0 && num > 0) {
				System.out.println("PAR POSITIVO");
			} 
			else if (num % 2 != 0 && num > 0) {
				System.out.println("IMPAR POSITIVO");
			} 
			else if (num % 2 == 0 && num < 0) {
				System.out.println("PAR NEGATIVO");
			}
			else if (num == 0) {
				System.out.println("NULO");
			}
		}

		sc.close();

	}

}
