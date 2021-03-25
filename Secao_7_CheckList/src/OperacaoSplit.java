
public class OperacaoSplit {

	public static void main(String[] args) {
		
		/*O Split pega o que tem espaço e coloca a palavra por palavra em vetores*/

		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.printf("", word1, word2, word3);

	}

}
