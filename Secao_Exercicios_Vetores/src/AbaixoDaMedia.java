import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();
		
		double vect[] = new double[N];
		
		double soma = 0;
		double media = 0;
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		media = soma / N;
		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for (int i = 0; i < N; i++) {
			if (vect[i] < media) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}
		
		sc.close();

	}

}
