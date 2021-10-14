package salario;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Empregado emp = new Empregado();

		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();

		System.out.println();
		System.out.print("Employee: " + emp);
		System.out.println();
		System.out.print("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);

		System.out.print("Updated data: " + emp);

		sc.close();
	}

}
