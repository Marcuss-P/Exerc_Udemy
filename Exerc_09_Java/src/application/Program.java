package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//lista para armazenar os dados
		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the numeber of employees: ");
		int n = sc.nextInt();

		//loop para percorrer a lista mais de uma vez se precisar, com o n
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourcecd (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			//Quebra de linha
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			//Se o funcionario for tercerizado
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				// Pode criar o Employee emp = new OutsourcedEmployee(...) TMB
				// Ou faze-lo da seguinte forma
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));

			} else {
				//Pode criar o Emplolyee emp = new Employee(...) TMB
				list.add(new Employee(name, hours, valuePerHour));
			}

		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		// (Funcionario emp) na minha lista (list)
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		sc.close();

	}

}
