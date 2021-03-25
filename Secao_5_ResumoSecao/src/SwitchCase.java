import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		/*
		 * Estrutura switch-case Quando se tem várias opções de fluxo a serem tratadas
		 * com base no valor de uma variável, ao invés de várias estruturas if-else
		 * encadeadas, alguns preferem utilizar a estrutura switch-case.
		 */

		/*
		 * Problema exemplo Fazer um programa para ler um valor inteiro de 1 a 7
		 * representando um dia da semana (sendo 1=domingo, 2=segunda, e assim por
		 * diante). Escrever na tela o dia da semana correspondente, conforme exemplos.
		 * Entrada Saída 1 Dia da semana: domingo Entrada Saída 4 Dia da semana: quarta
		 * Entrada Saída 9 Dia da semana: valor inválido
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		String dia;
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		
		sc.close();

	}

}
