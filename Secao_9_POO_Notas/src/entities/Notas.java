package entities;

public class Notas {

	public double nota;
	
	public Notas(double nota) {
		this.nota = nota;
	}
	
	public static double media(Notas nota1, Notas nota2) {
		return nota1.nota + nota2.nota;
	}
	
}
