package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Tratando exceções com o bloco try-catch:
		// no try coloca-se o programa que pode dar exceção
		// no catch colaca-se a exceção que pode ocorrer, um apelido para ela e o comando caso ela ocorra
		try {
		String[] vect = sc.nextLine().split(" ");//vetor de strings separados por espaços em branco
		int position = sc.nextInt(); 
		System.out.println(vect[position]);
		
		}
		catch(ArrayIndexOutOfBoundsException e){ //exceção que ocorre quando a posição do array não existe
			System.out.println("Invalid Position");
		}
		catch(InputMismatchException e) { //exceção que ocorre quando é digitado um valor inválido
			System.out.println("Imput error");
		}	
		
		System.out.println("End of Program.");
		sc.close();

	}

}
