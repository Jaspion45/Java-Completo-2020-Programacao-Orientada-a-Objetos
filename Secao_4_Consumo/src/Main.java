import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "consumo" Fazer um programa para ler a distância total (em km)
		 * percorrida por um carro, bem como o total de combustível gasto por este carro
		 * ao percorrer tal distância. Seu programa deve mostrar o consumo médio do
		 * carro, com três casas decimais.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int distancia;
		double combustivel, media;

		System.out.print("Distancia percorrida: ");
		distancia = sc.nextInt();
		System.out.print("Combustível gasto: ");
		combustivel = sc.nextDouble();

		media = (double) distancia / combustivel;

		System.out.printf("Consumo medio = %.3f", media);

		sc.close();

	}

}
