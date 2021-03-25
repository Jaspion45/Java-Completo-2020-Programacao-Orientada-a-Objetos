import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Problema "glicose"
          Fazer um programa para ler a quantidade de glicose
          no sangue de uma pessoa e depois mostrar na tela a
          classifica��o desta glicose de acordo com a tabela de
          refer�ncia.
                     Classifica��o Glicose
                     Normal At� 100 mg/dl
                     Elevado Maior que 100 at� 140 mg/dl
                     Diabetes Maior de 140 mg/dl*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double glicose;
		
		System.out.print("Digite a medida da glicose: ");
		glicose = sc.nextDouble();
		
		if (glicose <= 100) {
			System.out.println("Classifica��o: normal");
		}
		else if (glicose > 100 && glicose <= 140) {
			System.out.println("Classifica��o: elevado");
		}
		else {
			System.out.println("Classifica��o: diabetes");
		}
		
		sc.close();

	}

}
