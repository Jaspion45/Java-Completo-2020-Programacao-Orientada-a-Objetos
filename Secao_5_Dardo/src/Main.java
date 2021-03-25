import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "dardo" No arremesso de dardo, o atleta tem três chances para lançar
		 * o dardo à maior distância que conseguir. Você deve criar um programa para,
		 * dadas as medidas das três tentativas de lançamento, informar qual foi a
		 * maior.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double distanciaA, distanciaB, distanciaC;

		System.out.println("Digite as tres distancias:");
		distanciaA = sc.nextDouble();
		distanciaB = sc.nextDouble();
		distanciaC = sc.nextDouble();

		if (distanciaA > distanciaB && distanciaA > distanciaC) {
			System.out.printf("MAIOR DISTANCIA = %.2f", distanciaA);
		} 
		else if (distanciaB > distanciaC) {
			System.out.printf("MAIOR DISTANCIA = %.2f", distanciaB);
		} 
		else {
			System.out.printf("MAIOR DISTANCIA = %.2f", distanciaC);
		}

		sc.close();

	}

}
