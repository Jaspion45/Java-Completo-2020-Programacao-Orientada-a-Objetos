package entities;

public class Bhaskara {

	public double a;
	public double b;
	public double c;
	
	public Bhaskara(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double calDelta() {
		return (b * b) - (4 * a * c);
	}
	
	public double calX1() {
		return (- b + Math.sqrt(calDelta())) / (2 * a);
	}
	
	public double calX2() {
		return (- b - Math.sqrt(calDelta())) / (2 * a);
	}

}
