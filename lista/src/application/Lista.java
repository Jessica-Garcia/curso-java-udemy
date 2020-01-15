package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Declarar e instânciar a lista, depois cntrl+shft+o para importar:

		List<String> list = new ArrayList<>();

		// Adicionando elementos na lista:

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		// adicionando elementos na posição 2 da lista:

		list.add(2, "Marco");

		// para imprimir o tamanho da lista:

		System.out.println(list.size());

		// imprimindo cada elemento da lista com for each:

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-----------------------------");

		// para remover um elemento da lista pelo valor:

		list.remove("Anna");

		// para remover um elemento da lista pela posição:

		list.remove(1);

		/*
		 * Para remover elementos que atendam a um predicado, por exemplo remover todos
		 * que começam com a letra M:
		 */
		list.removeIf(x -> x.charAt(0) == 'M');

		// para encontrar a posição de um elemento:

		System.out.println("Index of bob: " + list.indexOf("Bob"));

		// quando o index of não encontra o elemento ele retorna -1

		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		System.out.println("--------------------------------");

		// Adicionando elementos na lista:

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		// para deixar na lista apenas elementos que começam com A, por exemplo:

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		// imprimindo cada elemento da lista que começa com A:

		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("-----------------------------");
		
		// para encontrar o primeiro elemento que comece com a letra A por exemplo:
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		
		
		sc.close();

	}

}
