package entities;

public class Duracao {

	public int duracao;
	
	public Duracao(int segundos) {
		this.duracao = segundos;
	}
	
	public int resto() {
		return duracao % 3600;
	}
	
	public int hora() {
		return duracao / 3600;
	}
	
	public int minuto() {
		return resto() / 60;
	}
	
	public int segundo() {
		return resto() % 60;
	}
	
	public String toString() {
		return String.format("%d:%d:%d", hora(), minuto(), segundo());
	}
	
}
