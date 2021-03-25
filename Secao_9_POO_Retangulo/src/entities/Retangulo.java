package entities;

public class Retangulo {
	
	public double base;
	public double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	private double calArea() {
		return base * altura;
	}
	
	private double calPerimetro() {
		return (base + altura) * 2;
	}
	
	private double calDiagonal() {
		return Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
	}
	
	public String toString() {
		return String.format("AREA = %.4f%n", calArea())
				+ String.format("PERIMETRO = %.4f%n", calPerimetro())
				+ String.format("DIAGONAL = %.4f%n", calDiagonal());
	}

}
