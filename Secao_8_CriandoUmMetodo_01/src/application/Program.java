package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		/*Classe
         � � um tipo estruturado que pode conter (membros):
         � Atributos (dados / campos)
         � M�todos (fun��es / opera��es)
         � A classe tamb�m pode prover muitos outros recursos, tais como:
         � Construtores
         � Sobrecarga
         � Encapsulamento
         � Heran�a
         � Polimorfismo
         � Exemplos:
         � Entidades: Produto, Cliente, Triangulo
         � Servi�os: ProdutoService, ClienteService, EmailService, StorageService
         � Controladores: ProdutoController, ClienteController
         � Utilit�rios: Calculadora, Compactador
         � Outros (views, reposit�rios, gerenciadores, etc.)*/
		
		/*Discuss�o
          Quais s�o os benef�cios de se calcular a �rea de um tri�ngulo por meio de um
          M�TODO dentro da CLASSE Triangle?
          1) Reaproveitamento de c�digo: n�s eliminamos o c�digo repetido (c�lculo
          das �reas dos tri�ngulos x e y) no programa principal.
          2) Delega��o de responsabilidades: quem deve ser respons�vel por saber
          como calcular a �rea de um tri�ngulo � o pr�prio tri�ngulo. A l�gica do c�lculo
          da �rea n�o deve estar em outro lugar.*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		sc.close();

	}

}
