import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
         seguir, calcule e mostre o valor da conta a pagar.
         CODIGO        PREÇO
         1             4.00
         2             4.50
         3             5.00
         4             2.00
         5             1.50*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double produto, total;
		
		produto = 0;
		
		System.out.print("Codigo: ");
		codigo = sc.nextInt();
		System.out.print("Quantidade: ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			produto = 4.0;
		}
		else if (codigo == 2) {
			produto = 4.5;
		}
		else if (codigo == 3) {
			produto = 5.0;
		}
		else if (codigo == 4) {
			produto = 2.0;
		}
		else if (codigo == 5) {
			produto = 1.5;
		}
		
		total = produto * quantidade;
		
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();

	}

}
