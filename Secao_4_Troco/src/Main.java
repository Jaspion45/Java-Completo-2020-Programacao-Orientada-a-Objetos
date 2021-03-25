import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "troco" Fazer um programa para calcular o troco no processo de
		 * pagamento de um produto de uma mercearia. O programa deve ler o preço
		 * unitário do produto, a quantidade de unidades compradas deste produto, e o
		 * valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente).
		 * Seu programa deve mostrar o valor do troco a ser devolvido ao cliente.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double PrecoUni, DinRecebido, troco;
		int QuantComp;

		System.out.print("Preço unitário do produto: ");
		PrecoUni = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		QuantComp = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		DinRecebido = sc.nextDouble();

		troco = DinRecebido - QuantComp * PrecoUni;

		System.out.printf("TROCO = %.2f", troco);

		sc.close();

	}

}
