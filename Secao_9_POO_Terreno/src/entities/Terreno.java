package entities;

public class Terreno {
	
	/*boas praticas, deixa seu código na seguinte ordem:
		Construtores
		Getters e setters
		Seus metodos*/

	public double largura;
	public double comprimento;
	public double mQuadrado;
	
	public Terreno(double largura, double comprimento, double mQuadrado) {
		this.largura = largura;
		this.comprimento = comprimento;
		this.mQuadrado = mQuadrado;
	}
	
	private double calArea() {
		return largura * comprimento;
	}
	
	private double calPreco() {
		return calArea() * mQuadrado;
	}
	
	public String toString() {
		return String.format("Area do terreno = %.2f\n", calArea()) + 
				String.format("Preco do Terreno = %.2f", calPreco());
			
	}

}
