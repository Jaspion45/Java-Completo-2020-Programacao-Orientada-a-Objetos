import java.util.Locale;
import java.util.Scanner;

public class SomaVetor2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int N = sc.nextInt();
		
		int vectA[] = new int[N];
		int vectB[] = new int[N];
		int vectSoma[] = new int[N];
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < N; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < N; i++) {
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		
		for (int i = 0; i < N; i++) {
			vectSoma[i] = vectA[i] + vectB[i];
			System.out.printf("%d%n", vectSoma[i]);
		}
		
		sc.close();

	}

}
