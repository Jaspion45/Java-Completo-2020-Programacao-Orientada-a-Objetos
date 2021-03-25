import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "idades" Fazer um programa para ler o nome e idade de duas pessoas.
		 * Ao final mostrar uma mensagem com os nomes e a idade m�dia entre essas
		 * pessoas, com uma casa decimal, conforme exemplo.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome1, nome2;
		int idade1, idade2;
		double media;

		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		nome1 = sc.nextLine();
		System.out.print("Idade: ");
		idade1 = sc.nextInt();

		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		sc.nextLine();
		nome2 = sc.nextLine();
		System.out.print("Idade: ");
		idade2 = sc.nextInt();

		media = ((double) idade1 + idade2) / 2;

		System.out.printf("A idade m�dia de %s e %s � de %.1f anos", nome1, nome2, media);

		sc.close();

	}

}
