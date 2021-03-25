package entities;

public class MenorDeTres {

	int valor;
	
	public MenorDeTres(int valor) {
		this.valor = valor;
	}
	
	public static int cal(MenorDeTres primeiro, MenorDeTres segundo, MenorDeTres terceiro) {
		 if (primeiro.valor < segundo.valor && primeiro.valor < terceiro.valor) {
			return primeiro.valor;
		}
		else if (segundo.valor < terceiro.valor) {
			return segundo.valor;
		}
		else {
			return terceiro.valor;
		}
	
	}
	
}
