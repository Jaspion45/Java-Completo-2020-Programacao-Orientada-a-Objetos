package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Duracao;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a duracao em segundos: ");
		int segundos = sc.nextInt();
		
		Duracao duracao = new Duracao(segundos);
		
		System.out.println(duracao);
		
		sc.close();

	}

}
