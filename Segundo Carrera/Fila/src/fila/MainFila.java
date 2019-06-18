package fila;

import java.util.Scanner;

/**
 * 
 * @author Ignacio Triguero
 *
 */
public class MainFila {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Fila pila = new Fila();
		Scanner sc = new Scanner(System.in);
		boolean bucle = true;

		while (bucle) {
			System.out.println();
			System.out.println("1.- Añadir dato aleatorio.");
			System.out.println("2.- Quitar el primer dato de la fila.");
			System.out.println("3.- Mostrar último dato de la fila.");
			System.out.println("4.- Mostrar primer dato de la fila.");
			System.out.println("5.- Mostrar todos los datos de la fila.");
			System.out.println("6.- Cuantos datos hay en la fila.");
			System.out.println("7.- Salir.");
			System.out.println();
			System.out.print("¿Qué quieres hacer? = ");
			int caso = sc.nextInt();
			System.out.println();
			switch (caso) {
			case 1:
				pila.anadir((int) (Math.random() * 100));
				break;
			case 2:
				pila.quitarPrimero();
				break;
			case 3:
				pila.mostrarUltimo();
				break;
			case 4:
				pila.mostrarPrimero();
				break;
			case 5:
				pila.toString();
				break;
			case 6:
				System.out.println("Hay " + pila.cuantos() + " elementos en la fila.");
				break;
			case 7:
				bucle = false;
				break;
			}
		}
	}
}