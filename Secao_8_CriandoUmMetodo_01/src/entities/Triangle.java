package entities;

public class Triangle {
	
	/*Classes, objetos, atributos
     � Classe: � a defini��o do tipo
     � Objetos: s�o inst�ncias da classe*/

	public double a;
	public double b;
	public double c;

	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
