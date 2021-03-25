package entities;

public class Consumo {
	
	public int dist;
	public double gasto;
	
	public Consumo(int dist, double gasto) {
		this.dist = dist;
		this.gasto = gasto;
	}
	
	public double media() {
		return dist / gasto;
	}

}
