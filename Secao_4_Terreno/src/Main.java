import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "terreno" Fazer um programa para ler as medidas da largura e
		 * comprimento de um terreno retangular com uma casa decimal, bem como o valor
		 * do metro quadrado do terreno com duas casas decimais. Em seguida, o programa
		 * deve mostrar o valor da �rea do terreno, bem como o valor do pre�o do
		 * terreno, ambos com duas casas decimais, conforme exemplo.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura, comprimento, valor, area, preco;

		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();

		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();

		System.out.print("Digite o valor do metro quadrado: ");
		valor = sc.nextDouble();

		area = largura * comprimento;
		preco = area * valor;

		System.out.printf("Area do terreno = %.2f", area);
		System.out.println();
		System.out.printf("Preco do terreno = %.2f", preco);

		sc.close();

	}

}
