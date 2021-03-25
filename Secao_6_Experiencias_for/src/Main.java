import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "experiencias" Maria acabou de iniciar seu curso de graduação na
		 * faculdade de medicina e precisa de sua ajuda para organizar os experimentos
		 * de um laboratório o qual ela é responsável. Ela quer saber no final do ano,
		 * quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo
		 * de cobaia utilizada. Este laboratório em especial utiliza três tipos de
		 * cobaias: sapos, ratos e coelhos. Para obter estas informações, ela sabe
		 * exatamente o número de experimentos que foram realizados, o tipo de cobaia
		 * utilizada e a quantidade de cobaias utilizadas em cada experimento. Faça um
		 * programa que leia um valor inteiro N que indica os vários casos de teste que
		 * vem a seguir. Cada caso de teste contém um inteiro que representa a
		 * quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o
		 * tipo de cobaia (R:Rato S:Sapo C:Coelho). Apresente o total de cobaias
		 * utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada
		 * uma em relação ao total de cobaias utilizadas, sendo que o percentual deve
		 * ser apresentado com dois dígitos após o ponto.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N, quantidade, coelho, rato, sapo, totalCobaias;
		double percentualC, percentualR, percentualS;
		char tipo;

		quantidade = 0;
		coelho = 0;
		rato = 0;
		sapo = 0;

		System.out.print("Quantos casos de teste serao digitados? ");
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.print("Quantidade de cobaias: ");
			quantidade = sc.nextInt();
			System.out.print("Tipo de cobaia: ");
			tipo = sc.next().charAt(0);
			if (tipo == 'C') {
				coelho += quantidade;
			} 
			else if (tipo == 'R') {
				rato += quantidade;
			} 
			else if (tipo == 'S') {
				sapo += quantidade;
			}
		}

		totalCobaias = coelho + rato + sapo;
		percentualC = (double) coelho * 100 / totalCobaias;
		percentualR = (double) rato * 100 / totalCobaias;
		percentualS = (double) sapo * 100 / totalCobaias;

		System.out.println("RELATORIO FINAL:");
		System.out.printf("Total: %d cobaias%n", totalCobaias);
		System.out.printf("Total: de coelhos: %d%n", coelho);
		System.out.printf("Total: de ratos: %d%n", rato);
		System.out.printf("Total: de sapos: %d%n", sapo);

		System.out.printf("Percentual de coelhos: %.2f%n", percentualC);
		System.out.printf("Percentual de ratos: %.2f%n", percentualR);
		System.out.printf("Percentual de sapos: %.2f%n", percentualS);

		sc.close();

	}

}
