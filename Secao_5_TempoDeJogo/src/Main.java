import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "tempo_de_jogo" Leia a hora inicial e a hora final de um jogo. A
		 * seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia
		 * e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int Hinicial, Hfinal, tempo;

		System.out.print("Hora inicial: ");
		Hinicial = sc.nextInt();

		System.out.print("Hora final: ");
		Hfinal = sc.nextInt();

		if (Hinicial < Hfinal) {
			tempo = Hfinal - Hinicial;
		} 
		else {
			tempo = 24 - Hinicial + Hfinal;
		}

		System.out.printf("O JOGO DUROUS %d HORA(S)", tempo);

		sc.close();

	}

}
