package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Futebol;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String time;
		String selecao;
		
		Futebol torcida = new Futebol();
		
		System.out.println("Para qual time voc� torce? ");
		time = sc.nextLine();
		System.out.println("Para qual sele��o voce torce? ");
		selecao = sc.nextLine();
		
		torcida.setTime(time);
		torcida.setSelecao(selecao);
		torcida.mostraTime();
		torcida.mostraSelecao();
		
		Futebol torcida2 = new Futebol();
		
		torcida2.mostraTime();
		torcida2.mostraSelecao();
		
		//N�o importa que tipo de objeto a altera��o ocorra, na variavel de classe ele vai refletir para todos os objetos que derivam dessa classe.
		torcida2.setSelecao("japonesa");
		torcida.mostraSelecao();
		
		sc.close();

	}

}
