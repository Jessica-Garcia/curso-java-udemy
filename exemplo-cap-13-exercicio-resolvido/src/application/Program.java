package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		// instanciar o trabalhador:
		/* - workerLevel é um tipo enumerado e portanto se declara 
		workerLevel.valueOf(workerLevel).
		
		-o departamento é um outro objeto do tipo departamento 
		então é preciso instanciar o departamento passando o nome digitado 
		para fazer a associação do trabalhador com o departamento => 
		new Department(departmentName)*/
		
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),
				        baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		// para ler os dados do contrato é preciso iniciar um for:
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			
			/*ler uma variavel do tipo date recebendo o que o usuario digitar naquele 
			 formato acima, para isso é necessário criar um "simple date format" 
			 antes do for, e depois chamar o sdf.parse e o string contendo a data que será 
			 o que o usuário digitar:
			 */
			Date contractDate = sdf.parse(sc.next());
			
			System.out.print("Value per hour: ");
			double ValuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			// instanciar o contrato:
			
			HourContract contract = new HourContract(contractDate, ValuePerHour, hours);
			
			// associar esse contrato com o trabalhador:
			
			worker.addContract(contract);
		}
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		
		String monthAndYear = sc.next();
		
		/* recortando esse string pegando os dois primeiro caracteres convertendo para
		 inteiro e guardando em uma variavel mês e depois pegar os 4 últimos caracteres
		 converter para inteiro e guardar em uma variável ano (aula 57 cap 7)*/
		
		int month = Integer.parseInt(monthAndYear.substring(0, 2));// sempre informar um a mais do que o caracter onde vai parar
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + 
	                        String.format("%.2f", worker.income(year, month)));
		sc.close();

	}

}
