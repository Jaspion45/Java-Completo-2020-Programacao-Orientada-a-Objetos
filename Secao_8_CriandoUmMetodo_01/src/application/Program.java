package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		/*Classe
         • É um tipo estruturado que pode conter (membros):
         • Atributos (dados / campos)
         • Métodos (funções / operações)
         • A classe também pode prover muitos outros recursos, tais como:
         • Construtores
         • Sobrecarga
         • Encapsulamento
         • Herança
         • Polimorfismo
         • Exemplos:
         • Entidades: Produto, Cliente, Triangulo
         • Serviços: ProdutoService, ClienteService, EmailService, StorageService
         • Controladores: ProdutoController, ClienteController
         • Utilitários: Calculadora, Compactador
         • Outros (views, repositórios, gerenciadores, etc.)*/
		
		/*Discussão
          Quais são os benefícios de se calcular a área de um triângulo por meio de um
          MÉTODO dentro da CLASSE Triangle?
          1) Reaproveitamento de código: nós eliminamos o código repetido (cálculo
          das áreas dos triângulos x e y) no programa principal.
          2) Delegação de responsabilidades: quem deve ser responsável por saber
          como calcular a área de um triângulo é o próprio triângulo. A lógica do cálculo
          da área não deve estar em outro lugar.*/

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
