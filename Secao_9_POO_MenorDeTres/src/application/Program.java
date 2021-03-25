package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MenorDeTres;



public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primeiro valor: ");
		int valor = sc.nextInt();
		MenorDeTres primeiro = new MenorDeTres(valor);
		
		System.out.print("segundo valor: ");
		valor = sc.nextInt();
		MenorDeTres segundo = new MenorDeTres(valor);
		
		System.out.print("terceiro valor: ");
		valor = sc.nextInt();
		MenorDeTres terceiro = new MenorDeTres(valor);
		
		int resultado = MenorDeTres.cal(primeiro, segundo, terceiro);
		
		System.out.printf("MENOR = %d", resultado);
		
		sc.close();

	}

}
