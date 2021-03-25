package entities;

public class Troco {

	private double precoPro;
	private int quantidade;
	private double dinRecebido;
	
	public Troco(double precoPro, int quantidade, double dinRecebido) {
		this.precoPro = precoPro;
		this.quantidade = quantidade;
		this.dinRecebido = dinRecebido;
	}
	
	public double conta() {
		return dinRecebido - precoPro * quantidade;
	}
	
}
