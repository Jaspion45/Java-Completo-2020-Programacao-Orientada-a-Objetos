import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "circulo" Fazer um programa para ler o valor "r" do raio de um
		 * c�rculo, e depois mostrar o valor da �rea do c�rculo com tr�s casas decimais.
		 * A f�rmula da �rea do c�rculo � a seguinte: area = pi. r2. Voc� pode usar o
		 * valor de pi fornecido pela biblioteca da sua linguagem de programa��o, ou
		 * ent�o, se preferir, use diretamente o valor 3.14159.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio, area;

		System.out.print("Digite o valor do raio do circulo: ");
		raio = sc.nextDouble();

		area = 3.14159 * Math.pow(raio, 2); // Math.pow � a raiz quadrada, com o raio elevado a 2

		System.out.printf("AREA = %.3f", area);

		sc.close();

	}

}
