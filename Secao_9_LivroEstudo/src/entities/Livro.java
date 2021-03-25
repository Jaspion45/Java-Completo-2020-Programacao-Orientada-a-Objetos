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
	
	// � void porque ele n�o retorna nada ele apenas aplica uma a��o
	// se fosse um calculo ou algo do tipo, retornaria um int ou um double etc.
	// ele n�o recebe nenhum parametro () como entrada, ele simplismente vai executar sem depender de dados externos.
	public void dadosLivro() {
		System.out.println("Nome do livro: " + nome);
		System.out.println("Pre�o: " + preco);
		System.out.println("Autor: " + autor);
		System.out.println("Data de Publica��o: " + dataPub + "\n");
	}
	
}
