import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Problema "lanchonete"
          Uma lanchonete possui v�rios produtos. Cada produto possui um c�digo
          e um pre�o. Voc� deve fazer um programa para ler o c�digo e a
          quantidade comprada de um produto (suponha um c�digo v�lido), e da�
          informar qual o valor a ser pago, com duas casas decimais, conforme
                      tabela de produtos.
              C�digo do produto         Pre�o do produto
              1                         R$ 5.00
              2                         R$ 3.50
              3                         R$ 4.80
              4                         R$ 8.90
              5                         R$ 7.32 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double produto, total;
		
		produto = 0;
		
		System.out.print("Codigo do produto comprado: ");
		codigo = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		
		switch (codigo) {
		case 1:
			produto = 5.00;
			break;
		case 2:
			produto = 3.50;
			break;
		case 3:
			produto = 4.80;
			break;
		case 4:
			produto = 8.90;
			break;
		case 5:
			produto = 7.32;
			break;
		}
		
		total = quantidade * produto;
		System.out.printf("Valor a pagar: R$ %.2f", total);
		
		sc.close();

	}

}
