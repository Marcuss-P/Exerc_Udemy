package triangulo;

import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo rect = new Retangulo();

		System.out.println("Enter rectangle width and height:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();

		System.out.printf("Area = %.2f%n",  rect.area());
		System.out.printf("Perimeter = %.2f%n",  rect.perimeter());
		System.out.printf("Diagonal = %.2f%n",  rect.diagonal());

		sc.close();
	}

}
