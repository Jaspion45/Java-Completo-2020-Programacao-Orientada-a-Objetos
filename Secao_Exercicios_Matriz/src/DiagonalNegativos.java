import java.util.Locale;
import java.util.Scanner;

public class DiagonalNegativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Qual a ordem da matriz? ");
		int N = sc.nextInt();

		int mat[][] = new int[N][N];
		
		int negativo = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.printf(+ mat[i][i] + " ");
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0) {
					negativo += 1;
				}
			}
		}
		
		System.out.println();
		System.out.printf("QUANTIDADE DE NEGATIVOS = %d", negativo);

		sc.close();

	}

}
