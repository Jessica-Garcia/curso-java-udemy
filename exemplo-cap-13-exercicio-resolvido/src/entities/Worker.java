package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	// Associações:
	
	// 1 Worker tem 1 departamento:
	
	private Department department;
	
	// 1 worker tem vários contratos então será representado com uma lista:
	
	private List<HourContract> contracts = new ArrayList<>();
	
	// colocar o construtor padão vazio:
	
	public Worker() {
	}

	// não incluir a lista no construtor com argumentos:
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	// nunca usar o set para listas e coleções
	
	// Apagar o setContracts() e usar os metodos para adicionar e remover contratos:

	public void addContract (HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract (HourContract contract) {
		contracts.remove(contract);
	}
	
	/* -calcular quanto a pessoa ganhou baseado em um ano e um mês
	  -somar o salario base mais o quanto ganhou nos contratos de um dado mês;
	-percorrer os contratos do funcionário testando quais contratos são 
	  do mês e do ano  acima, se sim entra na soma, 
	  -acumular na soma os valores dos contratos do trabalhador*/
	
	/* Declarar antes do for o calendário, e dentro do for para cada contrato c setar 
	 nesse calendário a data do contrato c chamando cal.setTime(c.getDate()) que é pegar 
	 a data do contrato e definir como data do calendário, o ano do contrato c
	 será o calendario cal.get(calendar.YEAR) e o mês será o 
	 1 + cal.get(calendar.MONTH)*/
	
	/* Depois testar se o ano e o mês informados como argumento forem iguais aos do 
	 contrato analisado o valor dele entrará na soma*/
	
	public double income(int year, int month) {
		
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		
		for(HourContract c : contracts) {
			
			cal.setTime(c.getDate());
			
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
			
		}
		return sum;
	}
}
