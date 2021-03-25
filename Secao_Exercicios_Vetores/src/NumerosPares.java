import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		
		int vect[] = new int[N];
		
		int cont = 0;
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.print("NUMEROS PARES:\n");
		
		for (int i = 0; i < N; i++) {
			if (vect[i] % 2 == 0) {
				cont += 1;
				System.out.printf("%d  ", vect[i]);
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.printf("QUANTIDADE DE PARES = %d", cont);
		
		sc.close();

	}

}
