import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "consumo" Fazer um programa para ler a dist?ncia total (em km)
		 * percorrida por um carro, bem como o total de combust?vel gasto por este carro
		 * ao percorrer tal dist?ncia. Seu programa deve mostrar o consumo m?dio do
		 * carro, com tr?s casas decimais.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int distancia;
		double combustivel, media;

		System.out.print("Distancia percorrida: ");
		distancia = sc.nextInt();
		System.out.print("Combust?vel gasto: ");
		combustivel = sc.nextDouble();

		media = (double) distancia / combustivel;

		System.out.printf("Consumo medio = %.3f", media);

		sc.close();

	}

}
