import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();

		String vectN[] = new String[N];
		int vectI[] = new int[N];
		double vectA[] = new double[N];

		double mediaA = 0;
		double soma = 0;
		int menorI = 0;

		for (int i = 0; i < N; i++) {
			System.out.printf("Dados da %da pessoa:%n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			vectN[i] = sc.nextLine();
			System.out.print("Idade: ");
			vectI[i] = sc.nextInt();
			System.out.print("Altura: ");
			vectA[i] = sc.nextDouble();
			soma += vectA[i];
		}
		mediaA = soma / N;

		for (int i = 0; i < N; i++) {
			if (vectI[i] < 16) {
				menorI += 1;
			}
		}
		int porcento = menorI * 100 / N;

		System.out.printf("Altura média: %.2f%n", mediaA);
		System.out.printf("Pessoas com menos de 16 anos: %.1f % %n", (double) porcento);

		for (int i = 0; i < N; i++) {
			if (vectI[i] < 16) {
				System.out.printf("%s%n", vectN[i]);
			}
		}

		sc.close();

	}

}
