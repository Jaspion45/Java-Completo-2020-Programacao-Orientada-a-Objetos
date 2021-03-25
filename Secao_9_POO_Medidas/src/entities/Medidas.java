package entities;

public class Medidas {

	private double a;
	private double b;
	private double c;

	public Medidas(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	private double  areaQuadrado() {
		return a * a;
	}
	
	private double areaTriangulo() {
		return a * a / 2;
	}
	
	private double areaTrapezio() {
		return (a + b) * c / 2;
	}
	
	public String toString() {
		return String.format("AREA DO QUADRADO = %.4f%n", areaQuadrado())
				+ String.format("AREA DO TRIANGULO = %.4f%n", areaTriangulo())
				+ String.format("AREA DO TRAPEZIO = %.4f%n", areaTrapezio());
	}

}
