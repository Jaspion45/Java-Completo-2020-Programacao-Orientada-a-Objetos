package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) { //vect.length é a quantidade do vetor, então tanto faz usar ele como o n.
			sc.nextLine();                      //é até melhor usar o length poís vc não fica atrelado a uma variavel que não está no vetor.
			String name = sc.nextLine();        //o proprio vetor sabe o tamanho dele.
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPrice();
		}
		
		double media = soma / vect.length;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", media);
		
		sc.close();

	}

}
