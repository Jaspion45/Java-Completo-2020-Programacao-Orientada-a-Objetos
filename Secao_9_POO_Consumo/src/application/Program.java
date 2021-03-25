package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Consumo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Distancia percorrida: ");
		int dist = sc.nextInt();
		System.out.print("Combustivel gasto: ");
		double gasto = sc.nextDouble();
		
		Consumo consumo = new Consumo(dist, gasto);
		
		System.out.printf("Distancia percorrida: %d%n", dist);
		System.out.printf("Distancia percorrida: %.2f%n", gasto);
		System.out.printf("Consumo medio = %.3f", consumo.media());
		
		sc.close();

	}

}
