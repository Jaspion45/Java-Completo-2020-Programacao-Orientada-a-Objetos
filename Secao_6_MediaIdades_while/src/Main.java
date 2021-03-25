import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "media_idades" Fa�a um programa para ler um n�mero indeterminado de
		 * dados, contendo cada um, a idade de um indiv�duo. O �ltimo dado, que n�o
		 * entrar� nos c�lculos, cont�m um valor de idade negativa. Calcular e imprimir
		 * a idade m�dia deste grupo de indiv�duos. Se for entrado um valor negativo na
		 * primeira vez, mostrar a mensagem "IMPOSSIVEL CALCULAR".
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade, cont;
		double media, soma;

		soma = 0;
		cont = 0;

		System.out.println("Digite as idades:");
		idade = sc.nextInt();

		if (idade < 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		}

		while (idade >= 0) {
			cont += 1;
			soma += idade;
			idade = sc.nextInt();
		}

		media = soma / cont;

		if (media >= 0) {
			System.out.printf("MEDIA = %.2f", media);
		}

		sc.close();

	}

}
