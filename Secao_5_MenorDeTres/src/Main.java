import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "menor_de_tres" Fazer um programa para ler três números inteiros. Em
		 * seguida, mostrar qual o menor dentre os três números lidos. Em caso de
		 * empate, mostrar apenas uma vez.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int p1, p2, p3, menor;

		System.out.print("Primeiro valor: ");
		p1 = sc.nextInt();
		System.out.print("Segundo valor: ");
		p2 = sc.nextInt();
		System.out.print("Terceiro valor: ");
		p3 = sc.nextInt();

		if (p1 < p2 && p1 < p3) {
			menor = p1;
		}
		else if (p2 < p3) {
			menor = p2;
		} 
		else {
			menor = p3;
		}

		System.out.printf("MENOR = %d", menor);

		sc.close();

	}

}
