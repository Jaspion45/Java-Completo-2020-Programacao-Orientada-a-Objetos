package entities;

public class Triangle {
	
	/*Classes, objetos, atributos
     • Classe: é a definição do tipo
     • Objetos: são instâncias da classe*/

	public double a;
	public double b;
	public double c;

	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
