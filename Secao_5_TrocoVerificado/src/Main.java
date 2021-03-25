import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "troco_verificado" Fazer um programa para calcular o troco no
		 * processo de pagamento de um produto de uma mercearia. O programa deve ler o
		 * preço unitário do produto, a quantidade de unidades compradas deste produto,
		 * e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do
		 * troco a ser devolvido ao cliente. Se o dinheiro dado pelo cliente não for
		 * suficiente, mostrar uma mensagem informando o valor restante conforme
		 * exemplo.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double precoProduto, pagamento, troco, totalCompra;
		int quantidade;

		System.out.print("Preco unitario do produto: ");
		precoProduto = sc.nextDouble();

		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();

		System.out.print("Dinheiro recebido: ");
		pagamento = sc.nextDouble();

		totalCompra = quantidade * precoProduto;

		if (pagamento < totalCompra) {
			troco = totalCompra - pagamento;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", troco);
		} 
		else if (pagamento >= totalCompra) {
			troco = pagamento - totalCompra;
			System.out.printf("TROCO = %.2f", troco);
		}

		sc.close();

	}

}
