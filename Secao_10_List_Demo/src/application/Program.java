package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		
		//<String> significa qual vai ser o tipo da lista nesse caso uma String.
		//List<String> list, list � o nome que foi dado a lista.
		//import java.util.List; esse � o import da List
		//A List diferente do vetor, n�o aceita tipos primitivos como int double etc, no caso de int seria Integer e no caso double seria Double. 'List<int> errado'
		//<> esse simbolo de menor e maior � o generics, e tipo Integer s�o tipos primitivos vers�o classes.
		//s� List<String> list n�o � possivel instanciar a List, e pra funcionar � necessario instanciar
		//new ArrayList<>(); essa � a forma para instanciar o tipo List, List � um tipo interface, e ArrayList<>(); � uma classe que implementa a interface List.
		//ArrayList pega tanto as qualidades de um vetor comum como as qualidades de uma List.
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		//isso mostra o tamanho da list.
		System.out.println(list.size());
		
		//for percorrendo o list, traduzindo para cada String x ' : percorrendo ' list imprimir na tela o valor de (x).
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		//list.removeIf(x -> x.charAt(0) == 'M'); remove elementos que sejam predicados, nessa situa��o vai eliminar tudo que come�ar com 'M'
		//traducao list.removeIf(quero remover todo Sting x tal que -> x.charAt(0) seja igual == a 'M');
		//x -> x.charAt(0) == 'M' isso � uma fun��o lambda, essa fun��o lambeda em particular se chama predicado, � uma fun��o que vai me retornar true ou false.
		//traducao (pega um valor x tipo string -> e me retorna se esse x.charAt(0) � igual a == 'M' essa reposta vai me retornar verdadeiro ou falso);
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		//encontrar a posi��o de um elemento list.indexOf(nome do elemento que quer encontrar no caso o Bob)
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		//se o indexOf n�o encontrar o elemento ele n�o vai retornar a posi��o que ele est�, ele vai retornar -1.
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		//Filtrar uma lista s� com os elementos que come�am com A
		//o nome dessa nova lista � result e est� filtrando os nomes e vai devolver apenas os elementos que come�ar com A.
		//Traducao List<String> result = list. converte a list para um stream() esse tipo stream � especial ele aceita lambda e apartir desse stram 
		//se aplica o filter que aceita um predicado que � x -> x.charAt(0) == 'A' pelo fato de stream n�o ser compativel com list ent�o
		//.collect(Collectors.toList()); � usado para converter o stream e retornar a lista.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		//traduzindo ele vai pegar o primeiro elemento que tenha o J se o elemento n�o existir ele vai retornar nulo.
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
	
	/*� Tamanho da lista: size()
      � Obter o elemento de uma posi��o: get(position)
      � Inserir elemento na lista: add(obj), add(int, obj)
      � Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
      � Encontrar posi��o de elemento: indexOf(obj), lastIndexOf(obj)
      � Filtrar lista com base em predicado:
        List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
      � Encontrar primeira ocorr�ncia com base em predicado:
        Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
      � Assuntos pendentes:
      � interfaces
      � generics
      � predicados (lambda)*/
	
}
