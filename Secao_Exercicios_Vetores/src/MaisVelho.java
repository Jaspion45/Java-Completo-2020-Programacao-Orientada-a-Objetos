import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int N = sc.nextInt();
		
		String vectN[] = new String[N];
		int vectI[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			System.out.printf("Dados da %da pessoa:%n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			vectN[i] = sc.nextLine();
			System.out.print("Idade: ");
			vectI[i] = sc.nextInt();
		}
		
		int maior = vectI[0];
		int posMaior = 0;
		
		for (int i = 0; i < N; i++) {
			if (vectI[i] > maior) {
				maior = vectI[i];
				posMaior = i;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s", vectN[posMaior]);
		
		sc.close();

	}

}
