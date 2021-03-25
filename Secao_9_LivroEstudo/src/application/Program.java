package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Livro;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Livro livro = new Livro();
		
		livro.nome = "B�son Linux";
		livro.descricao = "Livro sobre Linux da B�son!";
		livro.isbn = "97867186617";
		livro.preco = 45.95;
		livro.autor = "F�bio dos Reis";
		livro.dataPub = "20/04/2017";
		
		//Invoca��o do Metodo
		livro.dadosLivro();
		
		/*Resultado
		 Nome do livro: B�son Linux
         Pre�o: 45.95
         Autor: F�bio dos Reis
         Data de Publica��o: 20/04/2017*/
		
		sc.close();

	}

}
