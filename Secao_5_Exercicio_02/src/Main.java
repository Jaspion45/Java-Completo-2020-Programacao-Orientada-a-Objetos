import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou
		 * �mpar.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrada");
		int x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}

		sc.close();

	}

}
