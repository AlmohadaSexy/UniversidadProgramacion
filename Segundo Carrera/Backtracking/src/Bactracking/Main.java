package Bactracking;

import java.util.Scanner;

public class Main {
	static int total = 0;
	static boolean solucion = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * // System.out.print("Intruduzca x1: "); // int x1 = sc.nextInt(); int x1 =
		 * (int) (Math.random()*8 + 1); // System.out.print("Intruduzca x2: "); // int
		 * x2 = sc.nextInt(); int x2 = (int) (Math.random()*8 + 1); //
		 * System.out.print("Intruduzca x3: "); // int x3 = sc.nextInt(); int x3 = (int)
		 * (Math.random()*8 + 1); System.out.println(x1 + " " + x2 + " "+ x3);
		 * System.out.print("Introduzca solucion: "); int sol = sc.nextInt();
		 * bactrackingNoRecursivo(x1, x2, x3, sol);
		 */

		int[] vector = new int[3];
		vector[0] = (int) (Math.random() * 6) + 1;
		vector[1] = (int) (Math.random() * 6) + 1;
		vector[2] = (int) (Math.random() * 6) + 1;
		System.out.println("index 0 = " + vector[0]);
		System.out.println("index 1 = " + vector[1]);
		System.out.println("index 2 = " + vector[2]);
		System.out.println("tiene que dar 8");
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				total = 0;
				buscarSubConjunto(8, vector, i, j);
			}
		}
		if (!solucion) {
			System.out.println("No hay solucion");
		}

	}

	public static int buscarSubConjunto(int sumaSubConjunto, int[] vector, int ii, int jj) {
		if (ii != vector.length) {
			if (jj != vector.length) {
				total = vector[ii] + vector[jj];
				if (sumaSubConjunto == total && ii != jj) {
					System.out.println("Primero: " + vector[ii] + "(index = " + ii + "), Segundo: " + vector[jj]
							+ "(index = " + jj + ")");
					solucion = true;
					buscarSubConjunto(sumaSubConjunto, vector, ii + 1, jj);
					return total;
				} else {
					buscarSubConjunto(sumaSubConjunto, vector, ii + 1, jj + 1);
					return total;
				}
			} else {
				buscarSubConjunto(sumaSubConjunto, vector, ii + 1, ii + 2);
			}
		}
		return 0;
	}

	public static void bactrackingNoRecursivo(int x1, int x2, int x3, int sol) {
		if (x1 == sol) {
			System.out.println("Solucion = x1");
		}
		if (x2 == sol) {
			System.out.println("Solucion = x2");
		}
		if (x3 == sol) {
			System.out.println("Solucion = x3");
		}
		if (x1 + x2 == sol) {
			System.out.println("Solucion = x1 + x2");
		}
		if (x1 + x3 == sol) {
			System.out.println("Solucion = x1 + x3");
		}
		if (x2 + x3 == sol) {
			System.out.println("Solucion = x2 + x3");
		}
		if (x1 + x2 + x3 == sol) {
			System.out.println("Solucion = x1 + x2 + x3");
		}
	}
}
