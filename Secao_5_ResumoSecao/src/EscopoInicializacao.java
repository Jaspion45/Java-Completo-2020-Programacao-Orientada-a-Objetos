
public class EscopoInicializacao {

	public static void main(String[] args) {

		/*
		 * double price = sc.nextDouble(); if (price > 100.0) { double discount = price
		 * * 0.1; }
		 * 
		 * System.out.println(discount);
		 */

		// � necessario inicial fora do if que seria o escopo
		// Pois � retirado da memoria ap�s seu processo
		// O certo seria no exemplo abaixo

		/*
		 * double discount; discount = 0; double price = sc.nextDouble(); if (price >
		 * 100.0) { double discount = price * 0.1; }
		 * 
		 * System.out.println(discount);
		 */

		// A mudan�a foi criar a variavel discount fora do if
		// Caso contr�rio ela vai pertencer apenas dentro da a��o do if, que � um escopo
		// E ele recebe 0 no exemplo para ter uma inicializa��o

	}

}
