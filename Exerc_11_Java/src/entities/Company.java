package entities;

public class Company extends TaxPayer{

	private int numberEmployee;

	public Company(String nome, Double anualIncome, int numberEmployee) {
		super(nome, anualIncome);
		this.numberEmployee = numberEmployee;
	}

	public int getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(int numberEmployee) {
		this.numberEmployee = numberEmployee;
	}
	
	public Double tax() {
		if(numberEmployee > 10) {
			return getAnualIncome() * 0.14;
		}
		else {
			return getAnualIncome() * 0.16;
		}
	}
	
}
