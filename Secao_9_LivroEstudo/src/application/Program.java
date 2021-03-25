package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Livro;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Livro livro = new Livro();
		
		livro.nome = "Bóson Linux";
		livro.descricao = "Livro sobre Linux da Bóson!";
		livro.isbn = "97867186617";
		livro.preco = 45.95;
		livro.autor = "Fábio dos Reis";
		livro.dataPub = "20/04/2017";
		
		//Invocação do Metodo
		livro.dadosLivro();
		
		/*Resultado
		 Nome do livro: Bóson Linux
         Preço: 45.95
         Autor: Fábio dos Reis
         Data de Publicação: 20/04/2017*/
		
		sc.close();

	}

}
