import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "experiencias" Maria acabou de iniciar seu curso de gradua��o na
		 * faculdade de medicina e precisa de sua ajuda para organizar os experimentos
		 * de um laborat�rio o qual ela � respons�vel. Ela quer saber no final do ano,
		 * quantas cobaias foram utilizadas no laborat�rio e o percentual de cada tipo
		 * de cobaia utilizada. Este laborat�rio em especial utiliza tr�s tipos de
		 * cobaias: sapos, ratos e coelhos. Para obter estas informa��es, ela sabe
		 * exatamente o n�mero de experimentos que foram realizados, o tipo de cobaia
		 * utilizada e a quantidade de cobaias utilizadas em cada experimento. Fa�a um
		 * programa que leia um valor inteiro N que indica os v�rios casos de teste que
		 * vem a seguir. Cada caso de teste cont�m um inteiro que representa a
		 * quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o
		 * tipo de cobaia (R:Rato S:Sapo C:Coelho). Apresente o total de cobaias
		 * utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada
		 * uma em rela��o ao total de cobaias utilizadas, sendo que o percentual deve
		 * ser apresentado com dois d�gitos ap�s o ponto.
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
