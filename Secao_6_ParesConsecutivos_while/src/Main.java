import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "pares_consecutivos" (adaptado de URI 1159) O programa deve ler um
		 * valor inteiro X indefinidas vezes. (O programa irá parar quando o valor de X
		 * for igual a 0). Para cada X lido, imprima a soma dos 5 pares consecutivos a
		 * partir de X, inclusive o X, se for par. Se o valor de entrada for 4, por
		 * exemplo, a saída deve ser 40, que é o resultado da operação: 4+6+8+10+12,
		 * enquanto que se o valor de entrada for 11, por exempo, a saída deve ser 80,
		 * que é a soma de 12+14+16+18+20.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, num2, num3, num4, num5, total;

		System.out.print("Digite um numero inteiro: ");
		x = sc.nextInt();

		while (x != 0) {
			if (x % 2 == 0) {
				num2 = x + 2;
				num3 = x + 2 + 2;
				num4 = x + 2 + 2 + 2;
				num5 = x + 2 + 2 + 2 + 2;
				total = x + num2 + num3 + num4 + num5;
				System.out.printf("SOMA = %d%n", total);
				System.out.print("Digite um numero inteiro: ");
				x = sc.nextInt();
			}
			else if (x % 2 != 0) {
				x += +1;
				num2 = x + 2;
				num3 = x + 2 + 2;
				num4 = x + 2 + 2 + 2;
				num5 = x + 2 + 2 + 2 + 2;
				total = x + num2 + num3 + num4 + num5;
				System.out.printf("SOMA = %d%n", total);
				System.out.print("Digite um numero inteiro: ");
				x = sc.nextInt();
			}
		}

		sc.close();

	}

}
