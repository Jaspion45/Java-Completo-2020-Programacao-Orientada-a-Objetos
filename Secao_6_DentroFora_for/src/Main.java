import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "dentro_fora" Leia um valor inteiro N. Este valor será a quantidade
		 * de valores inteiros X que serão lidos em seguida. Mostre quantos destes
		 * valores X estão dentro do intervalo [10,20] e quantos estão fora do
		 * intervalo, conforme exemplo
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, num, dentro, fora;

		dentro = 0;
		fora = 0;

		System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			num = sc.nextInt();
			if (num >= 10 && num <= 20) {
				dentro += 1;
			}
			else {
				fora += 1;
			}
		}

		System.out.printf("%d DENTRO%n", dentro);
		System.out.printf("%d FORA%n", fora);

		sc.close();

	}

}
