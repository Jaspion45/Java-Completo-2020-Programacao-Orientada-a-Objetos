import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Problema "aumento" Uma empresa vai conceder um aumento percentual de salário
		 * aos seus funcionários dependendo de quanto cada pessoa ganha, conforme tabela
		 * ao lado. Fazer um programa para ler o salário de uma pessoa, daí mostrar qual
		 * o novo salário desta pessoa depois do aumento, quanto foi o aumento e qual
		 * foi a porcentagem de aumento. Salário atual Aumento Até R$ 1000.00 20% Acima
		 * de R$ 1000.00 até R$ 3000.00 15% Acima de R$ 3000.00 até R$ 8000.00 10% Acima
		 * de R$ 8000.00 5%
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, novoSalario, porcentagem;

		System.out.print("Digite o salario da pessoa: ");
		salario = sc.nextDouble();

		if (salario <= 1000) {
			porcentagem = salario * 20 / 100;
			novoSalario = salario + porcentagem;
			System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
			System.out.printf("Aumento = R$ %.2f%n", porcentagem);
			System.out.print("Porcentagem = 20%");
		} 
		else if (salario > 1000 && salario <= 3000) {
			porcentagem = salario * 15 / 100;
			novoSalario = salario + porcentagem;
			System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
			System.out.printf("Aumento = R$ %.2f%n", porcentagem);
			System.out.print("Porcentagem = 15%");
		}
		else if (salario > 3000 && salario <= 8000) {
			porcentagem = salario * 10 / 100;
			novoSalario = salario + porcentagem;
			System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
			System.out.printf("Aumento = R$ %.2f%n", porcentagem);
			System.out.print("Porcentagem = 10%");
		}
		else if (salario > 8000) {
			porcentagem = salario * 5 / 100;
			novoSalario = salario + porcentagem;
			System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
			System.out.printf("Aumento = R$ %.2f%n", porcentagem);
			System.out.print("Porcentagem = 5%");
		}

		sc.close();

	}

}
