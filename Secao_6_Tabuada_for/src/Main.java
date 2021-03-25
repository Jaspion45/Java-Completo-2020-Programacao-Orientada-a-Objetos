import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "tabuada" Ler um número inteiro N, daí mostrar na tela a tabuada de
		 * N para 1 a 10, conforme exemplo.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, resultado;

		System.out.print("Deseja a tabuada para qual valor? ");
		x = sc.nextInt();

		for (int i = 1; i < 11; i++) {
			resultado = x * i;
			System.out.printf("%d x %d = %d%n", x, i, resultado);
		}

		sc.close();

	}

}
