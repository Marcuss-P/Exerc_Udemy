package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		method1();
		System.out.println("End of program");
		
	}
	
	public static void method1() {
		System.out.println("**Start of method 1***");
		method2();
		System.out.println("**End of method 1***");
	}

	public static void method2() {
		System.out.println("**Start of method 2***");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			
			//Track the error 
			e.printStackTrace();
			
		} catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
		System.out.println("End of program");

		sc.close();
		System.out.println("**End of method 2***");
	}

}
