package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		/*Discussão
         • Toda classe em Java é uma subclasse da classe Object
         • Object possui os seguintes métodos:
         • getClass- retorna o tipo do objeto
         • equals - compara se o objeto é igual a outro
         • hashCode - retorna um código hash do objeto
         • toString - converte o objeto para string*/
		
		/*Exemplo
		 Enter product data:
         Name: TV
         Price: 900.00
         Quantity in stock: 10
         Product data: TV, $ 900.00, 10 units, Total: $ 9000.00
         Enter the number of products to be added in stock: 5
         Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00
         Enter the number of products to be removed from stock: 3
         Updated data: TV, $ 900.00, 12 units, Total: $ 10800.00*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		System.out.println();
		
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
		
	}
	
}
