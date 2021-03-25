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
		
		System.out.println("Para qual time você torce? ");
		time = sc.nextLine();
		System.out.println("Para qual seleção voce torce? ");
		selecao = sc.nextLine();
		
		torcida.setTime(time);
		torcida.setSelecao(selecao);
		torcida.mostraTime();
		torcida.mostraSelecao();
		
		Futebol torcida2 = new Futebol();
		
		torcida2.mostraTime();
		torcida2.mostraSelecao();
		
		//Não importa que tipo de objeto a alteração ocorra, na variavel de classe ele vai refletir para todos os objetos que derivam dessa classe.
		torcida2.setSelecao("japonesa");
		torcida.mostraSelecao();
		
		sc.close();

	}

}
