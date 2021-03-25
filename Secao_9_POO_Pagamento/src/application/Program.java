package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pagamento;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Valor por hora: ");
		double valorH = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		int horaT = sc.nextInt();
		
		Pagamento pagamento = new Pagamento(nome, valorH, horaT);
		
		System.out.printf("O pagamento para %s deve ser %.2f", nome, pagamento.calculo());
		
		sc.close();

	}

}
