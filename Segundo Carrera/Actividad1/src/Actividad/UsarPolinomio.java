package Actividad;

import java.util.Scanner;

public class UsarPolinomio {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int coeficiente = -1;
		int exponente = 0;
		int x;
		Scanner sc = new Scanner(System.in);
		Polinomios polinomios = new Polinomios();

		// Este while sirve para pedir los datos de cada monomio y dando como valor de
		// coeficiente 0 sale del bucle para introducir x y calcular el valor de todo
		while (coeficiente != 0) {
			System.out.print("Introduzca el valor del coeficiente (0 para seguir): \t");
			coeficiente = sc.nextInt();
			if (coeficiente != 0) {
				System.out.print("Introduzca el valor del exponente: \t\t\t");
				exponente = sc.nextInt();
				polinomios.agregarMonomio(coeficiente, exponente);
			}
		}
		System.out.println();
		System.out.print("Introduzca el valor de x: \t\t\t\t");
		x = sc.nextInt();
		polinomios.agregarResultados(x);
		System.out.println();
		System.out.println("El resultado es " + polinomios.calcularPolinomio());
		System.out.println();
		polinomios.toString(x);
	}
}