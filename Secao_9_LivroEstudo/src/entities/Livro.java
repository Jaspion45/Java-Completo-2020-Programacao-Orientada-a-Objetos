package entities;

public class Livro {

	//Atributos
	public String nome;
	public String descricao;
	public String autor;
	public String isbn;
	public double preco;
	public String dataPub;
	
	//Metodos
	
	// é void porque ele não retorna nada ele apenas aplica uma ação
	// se fosse um calculo ou algo do tipo, retornaria um int ou um double etc.
	// ele não recebe nenhum parametro () como entrada, ele simplismente vai executar sem depender de dados externos.
	public void dadosLivro() {
		System.out.println("Nome do livro: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Autor: " + autor);
		System.out.println("Data de Publicação: " + dataPub + "\n");
	}
	
}
