import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "validacao_de_nota" (adaptado de URI 1117) Fa�a um programa que leia
		 * as notas referentes �s duas avalia��es de um aluno. Calcule e imprima a m�dia
		 * semestral. Fa�a com que o algoritmo s� aceite notas v�lidas (uma nota v�lida
		 * deve pertencer ao intervalo [0,10]). Cada nota deve ser validada
		 * separadamente.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, media;

		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();

		while (nota1 < 0 || nota1 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			nota1 = sc.nextDouble();
		}

		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();

		while (nota2 < 0 || nota2 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			nota2 = sc.nextDouble();
		}

		media = (nota1 + nota2) / 2;
		System.out.printf("MEDIA = %.2f", media);

		sc.close();

	}

}
