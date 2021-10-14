package notas;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		
		std.aluno = sc.nextLine();
		std.notaUm = sc.nextDouble();
		std.notaDois = sc.nextDouble();
		std.notaTres = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", std.gradeFinal());
		
		if(std.gradeFinal() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f%n", std.aprovacao(), "POINTS");
		}else {
			System.out.println("PASS");
		}
		sc.close();
		
	}

}
