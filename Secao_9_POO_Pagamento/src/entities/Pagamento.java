package entities;

public class Pagamento {
	
	public String nome;
	public double valorH;
	public int horaT;
	
	public Pagamento(String nome, double valorH, int horaT) {
		this.nome = nome;
		this.valorH = valorH;
		this.horaT = horaT;
	}
	
	public double calculo() {
		return horaT * valorH;
	}

}
