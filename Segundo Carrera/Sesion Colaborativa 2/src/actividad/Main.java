package actividad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int total = 0;
	public static ArrayList<Integer> camiones;
	public static int[] granjas;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Apartado 1 o 2?");
		int apartado = sc.nextInt();
		switch (apartado) {
		case 1:
			int dato;
			System.out.print("Cuantos numeros quieres sumar: ");
			int tamano = sc.nextInt();
			int[] vector = new int[tamano];
			int jj = 0;
			do {
				System.out.print("Introduzca un dato: ");
				dato = sc.nextInt();
				vector[jj] = dato;
				jj++;
			} while (jj < tamano);
			recursividad1(vector, 0);
			break;
		case 2:
			camiones = new ArrayList<Integer>();
			granjas = new int[10];
			for (int ii = 0; ii < 10; ii++) {
				granjas[ii] = (int) (Math.random() * 100); // Hasta 100 Kg por granja
			}
			System.out.println();
			for (int ii = 0; ii < 10; ii++) {
				System.out.print(granjas[ii] + " | ");
			}
			System.out.println();
			camiones.add(0);
			llenadoCamion(granjas, camiones, 0, 0);

			for (int ii = 0; ii < 10; ii++) {
				System.out.print(granjas[ii] + " | ");
			}
			System.out.println();
			System.out.println(camiones.toString());
			break;
		}
		sc.close();
	}

	/**
	 * Apartado 1
	 * 
	 * El metodo se llama a si mismo hasta que se queda sin numeros. Al final del
	 * todo imprime la suma de todos los numeros del array.
	 * 
	 * @param vector
	 * @param ii
	 */
	public static void recursividad1(int[] vector, int ii) {
		total += vector[ii];
		if (ii + 1 == vector.length) {
			System.out.println(total);
		} else {
			recursividad1(vector, ii + 1);
		}
	}

	/**
	 * 
	 * @param g  Array de las granjas con las que vamos a operar
	 * @param c  ArrayList de los camiones
	 * @param ii puntero para las granjas
	 * @param jj puntero para los camiones
	 */
	public static void llenadoCamion(int[] g, ArrayList<Integer> c, int ii, int jj) { // Limite de 20 kg por camion
		if (ii < 10) {
			if (g[ii] != 0 && c.get(jj) < 20) {
				if (g[ii] + c.get(jj) <= 20) {

					int aux = c.get(jj);
					aux += g[ii];
					c.set(jj, aux);
					g[ii] = 0;
					System.out.println("Granja " + ii + " tiene " + g[ii] + " kilos");
					System.out.println("Camion " + jj + " tiene " + c.get(jj) + " kilos");
					System.out.println();
					llenadoCamion(g, c, ii + 1, jj); // Aqui se vacia la granja y se avanza a la siguiente granja porque
														// el camion no esta lleno

				} else {
					int diferencia = 20 - c.get(jj);

					int aux = c.get(jj);
					aux += diferencia;
					c.set(jj, aux);
					g[ii] -= diferencia;

					System.out.println("Granja " + ii + " tiene " + g[ii] + " kilos");
					System.out.println("Camion " + jj + " tiene " + c.get(jj) + " kilos");
					System.out.println();
					if (ii + 1 != 10) {
						c.add(0);
					}
					llenadoCamion(g, c, ii + 1, jj + 1);// Aqui no se vacia la granja, sino que se llena el camion, por
														// lo que se avanza tanto a la siguiente granja como al
														// siguiente camion
				}
			} else if (g[ii] == 0) {
				System.out
						.println("Pasamos a la siguiente granja porque la granja " + ii + " tiene " + g[ii] + " kilos");
				llenadoCamion(g, c, ii + 1, jj);// Aqui pasamos a la siguiente granja porque la granja ya esta vacia

			} else if (c.get(jj) >= 20) {
				System.out.println(
						"Pasamos al siguiente camion porque el camion " + jj + " tiene " + c.get(jj) + " kilos");
				c.add(0);
				llenadoCamion(g, c, ii, jj + 1);// Aqui pasamos al siguiente camion porque el camion ya esta lleno
			}
		} else {
			// Aqui definimos los Array y ArrayList de la clase (static) para poder
			// imprimirlos fuera del metodo
			camiones = c;
			granjas = g;
		}
	}
}
