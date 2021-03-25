import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
		 * m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrada:");
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x % 2 == 0 && y % 2 == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		sc.close();

	}

}
