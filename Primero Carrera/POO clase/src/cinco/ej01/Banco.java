package cinco.ej01;

import java.util.Scanner;

public class Banco {
	
	public static void main(String[] args) {
		Cuenta c1 = new Cuenta();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int ii = 0;
		while (ii == 0) {
			System.out.println("Su saldo en la cuenta 1 es de " + c1.obtenerSaldo() + "€");
			System.out.println("¿Quieres añadir más dinero? (Sí => 1; No => 2) ");
			int jj = sc.nextInt();
			if(jj == 1) {
				System.out.print("Ingrese la cantidad de dinero que quieres ingresar: ");
				double addSaldo = sc.nextDouble();
				c1.añadirSaldo(addSaldo);
			} if (jj == 2) {
				ii++;
				System.out.println("Su saldo en la cuenta 1 es de " + c1.obtenerSaldo() + "€");
			} if (jj != 1 && jj != 2) {
				System.out.println("Presione 1 u 2, por favor.");
			}
		}
		
		Cuenta c2 = new Cuenta();
		
		ii = 0;
		while (ii == 0) {
			System.out.println("Su saldo en la cuenta 2 es de " + c2.obtenerSaldo() + "€");
			System.out.println("¿Quieres añadir más dinero? (Sí => 1; No => 2) ");
			int jj = sc.nextInt();
			if(jj == 1) {
				System.out.print("Ingrese la cantidad de dinero que quieres ingresar: ");
				double addSaldo = sc.nextDouble();
				c2.añadirSaldo(addSaldo);
			} if (jj == 2) {
				ii++;
				System.out.println("Su saldo en la cuenta 2 es de " + c2.obtenerSaldo() + "€");
			} else {
				System.out.println("Presione 1 u 2, por favor.");
			}
		}
		System.out.println();
		System.out.println("Su saldo en la cuenta 1 es de " + c1.obtenerSaldo() + "€");
		System.out.println("Su saldo en la cuenta 2 es de " + c2.obtenerSaldo() + "€");
		
	}
}