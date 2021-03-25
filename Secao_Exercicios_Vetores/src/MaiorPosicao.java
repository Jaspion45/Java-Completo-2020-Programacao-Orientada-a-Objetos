import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();

		double vect[] = new double[N];

		double maior = 0;

		int posicao = 0;

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if (vect[i] > maior) {
				posicao = i;
				maior = vect[i];
			}
		}

		System.out.printf("MAIOR VALOR = %.1f%n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d", posicao);

		sc.close();

	}

}
