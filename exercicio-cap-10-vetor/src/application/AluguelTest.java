package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;


public class AluguelTest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serao alugados? ");
		int n = sc.nextInt();
	
		Aluguel[] quartos = new Aluguel[11];
		
		
		
		for(int i=1; i<=n; i++) {
			
			System.out.println();
			System.out.println("Aluguel #" + i +":");
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("email: ");
			String email = sc.nextLine();
			
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
		
			quartos[quarto] = new Aluguel(nome, email);
			
		}
		
		System.out.println("Quartos ocupados:");
		
		for(int i=1; i<11; i++) {
			if (quartos[i] != null) {
				System.out.println(i+ ": " + quartos[i]);
			}
		}
		
		
		
		
		sc.close();

	}

}
