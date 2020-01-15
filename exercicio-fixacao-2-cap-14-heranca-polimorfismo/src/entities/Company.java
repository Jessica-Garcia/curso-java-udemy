package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployee;
	
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployee) {
		super(name, anualIncome);
		this.numberOfEmployee = numberOfEmployee;
	}
	
	public Integer getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public Double tax() {
		if(numberOfEmployee > 10) {
			return (anualIncome * 0.14);
		}
		else {
			return(anualIncome * 0.16);
		}
	}

}
