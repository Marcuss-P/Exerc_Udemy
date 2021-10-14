package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Rooms[] vect = new Rooms[10];
		System.out.println();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Rent #" + i + ":");
			System.out.println();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Email: ");
			sc.nextLine();
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			vect[room] = new Rooms(name,  email);
		}
		
		System.out.println("Bussy rooms: ");
		for(int i=0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		
		sc.close();
	}

}
