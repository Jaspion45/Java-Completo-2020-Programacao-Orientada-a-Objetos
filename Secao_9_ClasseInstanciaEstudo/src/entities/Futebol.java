package entities;

public class Futebol {

	private String nomeTime; // var de instancia, O NOME DO TIME VAI SER DIFERENTE PARA CADA OBJETO
	private static String nomeSeLecao; // var de classe, O VALOR DELA É O MESMO PRA TODOS MUNDO 'static'
	
	// set vai ser usado para configurar o nome do time.
	public void setTime(String meuTime) {
		nomeTime = meuTime;
	}
	
	// get vai ser usado para ler o nome do time. 
	public String getTime() {
		return nomeTime;
	}
	
	public void setSelecao(String selecao) {
		nomeSeLecao = selecao;
	}
	
	public String getSelecao() {
		return nomeSeLecao;
	}
	
	public void mostraTime() {
		System.out.printf("Seu time do coração é %s\n", getTime());
	}
	
	public void mostraSelecao() {
		System.out.printf("Sua Seleção é %s\n", getSelecao());
	}
	
}
