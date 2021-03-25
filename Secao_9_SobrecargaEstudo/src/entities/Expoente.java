package entities;

public class Expoente {
	
	// Metodo que não calcula nada, e é um retorno void ou seja vazio.
	public static void elevar() {
		System.out.println("Este metodo não calcula nada!");
	}
	
	// Metodo que calcula o quadrado de i
	// Pelo fato de ser static não precisa criar o objeto
	public static double elevar(double i) {
		return i * i;
	}
	
	// Metodo que calcula i elevado a j
	// Pelo fato de ser static não precisa criar o objeto
	public static double elevar(double i, double j) {
		return Math.pow(i, j);
	}

}
