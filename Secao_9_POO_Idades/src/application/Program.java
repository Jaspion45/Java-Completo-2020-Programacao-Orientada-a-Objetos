package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Idades;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		
		Idades pessoa1 = new Idades(nome, idade);//pessoa1 � um objeto
		
		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		sc.nextLine();
		nome = sc.nextLine();
		System.out.print("Idade: ");
		idade = sc.nextInt();
		
		Idades pessoa2 = new Idades(nome, idade);//pessoa2 � um outro objeto
		
		double media = Idades.mediaIdades(pessoa1, pessoa2);
		System.out.printf("A idade m�dia de %s e %s � de %.2f anos", pessoa1.nome, pessoa2.nome, media);
		
		sc.close();

	}

}
