package actividad;

import java.util.ArrayList;
import java.util.Scanner;

public class MainActividadColaborativa {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Pila> pilas = new ArrayList<>();
		Fila fila1 = new Fila();
		Fila fila2 = new Fila();
		Pila pila1 = new Pila();
		Pila pila2 = new Pila();
		Pila pila3 = new Pila();
		Pila pila4 = new Pila();
		pilas.add(pila1);
		pilas.add(pila2);
		pilas.add(pila3);
		pilas.add(pila4);

		boolean dos = false;
		boolean bucle = true;

		while (bucle) {
			System.out.println();
			System.out.println("1.- Rellenar ambas filas y mostrarlas");
			System.out.println("2.- Sentar personas en las pilas y mostrarlas");
			System.out.println("3.- Acomodar pilas y mostrarlas");
			System.out.println("4.- Salir.");
			System.out.println();
			System.out.print("¿Qué quieres hacer? = ");
			int caso = sc.nextInt();
			System.out.println();
			switch (caso) {
			case 1:
				for (int ii = 0; ii < 10; ii++) {
					int random = (int) (Math.random() * 95 + 5);
					while (random <= 5 && random >= 99) {
						random = (int) (Math.random() * 95 + 5);
					}
					fila1.add(random);
				}
				for (int ii = 0; ii < 10; ii++) {
					int random = (int) (Math.random() * 95 + 5);
					while (random <= 5 && random >= 99) {
						random = (int) (Math.random() * 95 + 5);
					}
					fila2.add(random);
				}
				System.out.println(fila1);
				System.out.println(fila2);
				break;
			case 2:
				dos = true;
				for (int ii = 0; ii < 5; ii++) {
					pila1.push(fila1.devolverPrimero());
					fila1.quitarPrimero();
					pila2.push(fila2.devolverPrimero());
					fila2.quitarPrimero();
					pila3.push(fila1.devolverPrimero());
					fila1.quitarPrimero();
					pila4.push(fila2.devolverPrimero());
					fila2.quitarPrimero();
				}
				for (Pila pila : pilas) {
					System.out.println(pila);
				}
				break;
			case 3:
				if (dos) {
					for (Pila pila : pilas) {
						pila.ordenar();
						System.out.println(pila);
					}
				} else {
					System.out.println("Seleccione el 2 antes");
				}
				break;
			case 4:
				bucle = false;
				break;
			}
		}
	}
}