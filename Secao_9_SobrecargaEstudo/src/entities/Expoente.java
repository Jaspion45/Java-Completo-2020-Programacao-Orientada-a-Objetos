package entities;

public class Expoente {
	
	// Metodo que n�o calcula nada, e � um retorno void ou seja vazio.
	public static void elevar() {
		System.out.println("Este metodo n�o calcula nada!");
	}
	
	// Metodo que calcula o quadrado de i
	// Pelo fato de ser static n�o precisa criar o objeto
	public static double elevar(double i) {
		return i * i;
	}
	
	// Metodo que calcula i elevado a j
	// Pelo fato de ser static n�o precisa criar o objeto
	public static double elevar(double i, double j) {
		return Math.pow(i, j);
	}

}
