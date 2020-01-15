package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		/* UPCASTING: pegar um objeto do tipo businessAccount(subclasse) e atribuí-lo a 
		   uma variavel do tipo Account(Superclasse).
		 */
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ann", 0.0, 0.01);
		
		//DOWNCASTING: converter um objeto da superclasse para a subclasse
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		/* Nem sempre o Downcasting dá certo para evitar erros testa-se primeiro 
		  se o objeto é realmente de certo tipo usando a palavara instaceof, por exemplo
		  se o que tiver na variável acc3 for um objeto que seja instância de 
		  BusinessAccount neste caso pode-se fazer o casting:
		 */
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Account ac1 = new Account(1010, "Jessica", 1000.0);
		ac1.withdraw(200.0);
		System.out.println(ac1.getBalance());
		
		//teste para ver se a sobreposição está funcionando:
		
		Account ac2 = new SavingsAccount(1012, "Maria", 1000.0, 0.01);
		ac2.withdraw(200.0);
		System.out.println(ac2.getBalance());

		Account ac3 = new BusinessAccount(1013, "Bob", 1000.0, 500.0);
		ac3.withdraw(200.0);
		System.out.println(ac3.getBalance());
		
		// testando polimorfismo:
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		System.out.println("----------------------------------------------");
		
		// totalizando saldo de todas as contas e depositando em todas as contas:
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1020, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1021, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1022, "Anna", 300.0, 0.01));
		list.add(new BusinessAccount(1023, "Bob", 500.0, 500.0));
		
		// totalizando o saldo:
		
		double sum = 0.0;
		
		for (Account ac : list) {
			sum += ac.getBalance();
		}
		
		System.out.printf("Total Balnce: %.2f%n", sum);
		
		// depositando 10.00 em cada conta
		
		for (Account ac : list) {
			ac.deposit(10.0);
		}
		
		for (Account ac : list) {
			System.out.printf("Updated balance for Account: %d: %.2f%n", ac.getNumber(), ac.getBalance());
		}
	}
	

}
