import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "media_idades" Faça um programa para ler um número indeterminado de
		 * dados, contendo cada um, a idade de um indivíduo. O último dado, que não
		 * entrará nos cálculos, contém um valor de idade negativa. Calcular e imprimir
		 * a idade média deste grupo de indivíduos. Se for entrado um valor negativo na
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
