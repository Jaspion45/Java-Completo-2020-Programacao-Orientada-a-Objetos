import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Problema "glicose"
          Fazer um programa para ler a quantidade de glicose
          no sangue de uma pessoa e depois mostrar na tela a
          classificação desta glicose de acordo com a tabela de
          referência.
                     Classificação Glicose
                     Normal Até 100 mg/dl
                     Elevado Maior que 100 até 140 mg/dl
                     Diabetes Maior de 140 mg/dl*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double glicose;
		
		System.out.print("Digite a medida da glicose: ");
		glicose = sc.nextDouble();
		
		if (glicose <= 100) {
			System.out.println("Classificação: normal");
		}
		else if (glicose > 100 && glicose <= 140) {
			System.out.println("Classificação: elevado");
		}
		else {
			System.out.println("Classificação: diabetes");
		}
		
		sc.close();

	}

}
