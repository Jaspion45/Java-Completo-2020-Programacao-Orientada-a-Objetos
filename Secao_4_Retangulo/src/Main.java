import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "retangulo" Fazer um programa para ler as medidas da base e altura
		 * de um retângulo. Em seguida, mostrar o valor da área, perímetro e diagonal
		 * deste retângulo, com quatro casas decimais, conforme exemplos.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double base, altura, area, perimetro, diagonal;

		System.out.print("Base do retangulo: ");
		base = sc.nextDouble();

		System.out.print("Altura do retangulo: ");
		altura = sc.nextDouble();

		area = base * altura;
		perimetro = (base + altura) * 2;
		diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0)); // Math.sqrt é a raiz quadrada do JAVA.
																			// Math.pow - base, 2.0 - base está sendo
																			// elevado a 2 ou base * base.

		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);

		sc.close();

	}

}
