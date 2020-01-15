package application;

import java.util.Locale;
import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		/* para fazer um for each: palavra for:
		 * 1- O tipo dos elelmentos do vetor, 
		 * 2- Um apelido para cada elemento do vetor, 
		 * 3- Dois pontos(:) e 
		 * 4- A coleção que neste caso é vect
		 * 5- depois chamar o apelido*/
		
		for (String obj : vect) {
			System.out.println(obj);
		}
		
		/* a leitura fica assim: 
		 * "Para cada objeto 'obj(apelido)' contido em vect(coleção), faça..." */
		
		
		sc.close();
	}

}
