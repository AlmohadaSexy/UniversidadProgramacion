package pilas;

import java.util.Scanner;

/**
 * 
 * @author Ignacio Triguero
 *
 */
public class MainPilas {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Pila pila = new Pila(10);
		Scanner sc = new Scanner(System.in);
		boolean bucle = true;

		while (bucle) {
			System.out.println();
			System.out.println("1.- Añadir dato aleatorio.");
			System.out.println("2.- Quitar el último dato de la pila.");
			System.out.println("3.- Mostrar último dato de la pila.");
			System.out.println("4.- Mostrar todos los datos de la pila.");
			System.out.println("5.- Salir.");
			System.out.println();
			System.out.print("¿Qué quieres hacer? = ");
			int caso = sc.nextInt();
			System.out.println();
			switch (caso) {
			case 1:
				pila.push((int) (Math.random() * 100));
				break;
			case 2:
				pila.pop();
				break;
			case 3:
				pila.top();
				break;
			case 4:
				pila.toString();
				break;
			case 5:
				bucle = false;
				break;
			}
		}
	}
}