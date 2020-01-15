package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Tratando exce��es com o bloco try-catch:
		// no try coloca-se o programa que pode dar exce��o
		// no catch colaca-se a exce��o que pode ocorrer, um apelido para ela e o comando caso ela ocorra
		try {
		String[] vect = sc.nextLine().split(" ");//vetor de strings separados por espa�os em branco
		int position = sc.nextInt(); 
		System.out.println(vect[position]);
		
		}
		catch(ArrayIndexOutOfBoundsException e){ //exce��o que ocorre quando a posi��o do array n�o existe
			System.out.println("Invalid Position");
		}
		catch(InputMismatchException e) { //exce��o que ocorre quando � digitado um valor inv�lido
			System.out.println("Imput error");
		}	
		
		System.out.println("End of Program.");
		sc.close();

	}

}
