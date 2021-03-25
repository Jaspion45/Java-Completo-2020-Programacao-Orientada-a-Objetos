import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "duracao" Fazer um programa para ler uma duração de tempo em
		 * segundos, daí imprimir na tela esta duração no formato
		 * horas:minutos:segundos.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int segundo, minuto, hora, duracao, resto;

		System.out.print("Digite a duracao em segundos: ");
		duracao = sc.nextInt();

		hora = duracao / 3600;
		resto = duracao % 3600;

		minuto = resto / 60;
		segundo = resto % 60;

		System.out.printf("%d:%d:%d", hora, minuto, segundo);

		sc.close();

	}

}
