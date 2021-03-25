import java.util.Scanner;

public class FuncoesSintaxe {

	public static void main(String[] args) {
		
		/*Fun��es
          � Representam um processamento que possui um significado
          � Math.sqrt(double)
          � System.out.println(string)
          � Principais vantagens: modulariza��o, delega��o e reaproveitamento
          � Dados de entrada e sa�da
          � Fun��es podem receber dados de entrada (par�metros ou argumentos)
          � Fun��es podem ou n�o retornar uma sa�da
          � Em orienta��o a objetos, fun��es em classes recebem o nome de "m�todos"*/
		
		/*Problema exemplo
          Fazer um programa para ler tr�s n�meros inteiros e mostrar na tela o maior deles.
          Exemplo:
          Enter three numbers:
          5
          8
          3
          Higher = 8*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a, b, c);
		showResult(higher);
		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} 
		else if (y > z) {
			aux = y;
		} 
		else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
