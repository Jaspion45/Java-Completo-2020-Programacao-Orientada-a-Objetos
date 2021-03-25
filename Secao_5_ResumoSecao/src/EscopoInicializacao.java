
public class EscopoInicializacao {

	public static void main(String[] args) {

		/*
		 * double price = sc.nextDouble(); if (price > 100.0) { double discount = price
		 * * 0.1; }
		 * 
		 * System.out.println(discount);
		 */

		// É necessario inicial fora do if que seria o escopo
		// Pois é retirado da memoria após seu processo
		// O certo seria no exemplo abaixo

		/*
		 * double discount; discount = 0; double price = sc.nextDouble(); if (price >
		 * 100.0) { double discount = price * 0.1; }
		 * 
		 * System.out.println(discount);
		 */

		// A mudança foi criar a variavel discount fora do if
		// Caso contrário ela vai pertencer apenas dentro da ação do if, que é um escopo
		// E ele recebe 0 no exemplo para ter uma inicialização

	}

}
