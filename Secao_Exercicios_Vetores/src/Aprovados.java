import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int N = sc.nextInt();
		
		String vectN[] = new String[N];
		double vectS1[] = new double[N];
		double vectS2[] = new double[N];
		
		double media = 0;
		
		for (int i = 0; i < N; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i + 1);
			sc.nextLine();
			vectN[i] = sc.nextLine();
			vectS1[i] = sc.nextDouble();
			vectS2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		
		for (int i = 0; i < N; i++) {
			media = (vectS1[i] + vectS2[i]) / 2;
			if (media >= 6.0) {
				System.out.printf("%s%n", vectN[i]);
			}
		}
		
		sc.close();

	}

}
