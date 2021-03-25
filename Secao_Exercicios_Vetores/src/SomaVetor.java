import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		
		double vect[] = new double[N];
		
		double soma = 0;
		int cont = 0;
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
			cont += 1;
		}
		
		System.out.print("VALORES = ");
		
		for (int i = 0; i < N; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		System.out.println();
		System.out.printf("SOMA = %.2f", soma);
		System.out.println();
		
		double media = soma / cont;
		System.out.printf("MEDIA = %.2f", media);
		
		sc.close();

	}

}
