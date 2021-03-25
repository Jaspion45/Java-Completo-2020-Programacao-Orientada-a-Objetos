import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "pagamento" Fazer um programa para ler o nome de um(a)
		 * funcion�rio(a), o valor que ele(a) recebe por hora, e a quantidade de horas
		 * trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcion�rio
		 * com uma mensagem explicativa, conforme exemplo.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		double valHora, pagamento;
		int hrsTrab;

		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Valor por hora: ");
		valHora = sc.nextDouble();
		System.out.print("Horas Trabalhadas: ");
		hrsTrab = sc.nextInt();

		pagamento = hrsTrab * valHora;

		System.out.printf("O pagamento para %s deve ser de %.2f", nome, pagamento);

		sc.close();

	}

}
