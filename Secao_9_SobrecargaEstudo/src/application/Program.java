package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Expoente;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = 4;
		double b = 5;
		
		//Pelo fato de ser static na classe Expoente, n�o precisou criar o objeto
		//ao chamar o metodo foi feita a passagem de valor, colocando a variavel a no elevar do primeiro construtor
		//e colocar as variaveis a, b no segundo construtor elevar
		//isso � a sobrecarga, 3 metodos com nomes igual mas com parametros diferentes.
		System.out.printf("O quadrado de %.2f � %.2f\n", a, Expoente.elevar(a));
		System.out.printf("%.2f elevado a %.2f � %.2f\n", a, b, Expoente.elevar(a,b));
		
		//N�o precisa do sysout pois ele ja tem essa a��o dentro do metodo.
		Expoente.elevar();
		
		/*Resultado
		 O quadrado de 4.00 � 16.00
         4.00 elevado a 5.00 � 1024.00
         Este metodo n�o calcula nada!*/
		
		sc.close();

	}

}
