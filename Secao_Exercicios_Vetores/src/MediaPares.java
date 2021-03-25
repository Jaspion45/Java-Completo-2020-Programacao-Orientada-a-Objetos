import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();

		int vect[] = new int[N];

		int soma = 0;
		int contPares = 0;
		double media = 0;

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			soma += vect[i];
			if (vect[i] % 2 == 0) {
				media = soma / N;
				contPares += 1;
			}
		}

		if (contPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} 
		else {
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		}

		sc.close();

	}

}
