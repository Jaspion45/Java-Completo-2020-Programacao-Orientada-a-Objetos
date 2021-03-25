package entities;

public class Idades {
	
	/*
	 * Em Java ou qualquer outra linguagem, vale mais a lógica que a estrutura. A
	 * média pode ser para uma ou mas pessoas. Isso por si só caracteriza o uso de
	 * uma lista. Essa parte e dada pela estrutura de dados, algo que você vai
	 * precisar na maioria das entrevistas de emprego de grandes empresas
	 */
	
	public String nome;//atributo
	public int idade;//atributo

	public Idades(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}//Construtor pode-se criar varios objetos diferentes usando eles

	public static double mediaIdades(Idades pessoa1, Idades pessoa2) {
		return (pessoa1.idade + pessoa2.idade) / 2;
	}//Metodo

}
