package entities;

public class Circulo {

	public double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double calculo() {
		return 3.14159 * Math.pow(raio, 2);
	}
	
}
