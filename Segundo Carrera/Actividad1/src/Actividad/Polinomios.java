package Actividad;

import Actividad.Nodo;

public class Polinomios {

	/**
	 * puntero para indicar el inicio del nodo
	 */
	protected Nodo punteroInicio;

	/**
	 * puntero para indicar el fin del nodo
	 */
	protected Nodo punteroFin;

	/**
	 * Constructor para inicializar punteros del la Lista--->Nodo
	 */
	public Polinomios() {
		punteroInicio = null;
		punteroFin = null;
	}

	/**
	 * Constructor para agregar los monomios
	 * 
	 * @param coeficiente Valor int del coeficiente del monomio
	 * @param exponente   Valor int del exponente del monomio
	 */
	public void agregarMonomio(int coeficiente, int exponente) {
		// Creo un nodo y lo enlazo asignadolo al puntero de inicio
		punteroInicio = new Nodo(coeficiente, exponente, punteroInicio);
		if (punteroFin == null) {
			punteroFin = punteroInicio;
		}
	}

	/**
	 * Constructor para agregar los resultados a cada Nodo una vez ya sabemos la x
	 * 
	 * @param x Valor int de x
	 */
	public void agregarResultados(int x) {
		for (Nodo aux = punteroInicio; aux != null; aux = aux.punteroSiguiente) {
			aux.resultado = aux.coeficiente * Math.pow(x, aux.exponente);
		}
	}

	/**
	 * Constructor para calcular el valor de todo el polinomio con los resultados de
	 * cada nodo
	 */
	public double calcularPolinomio() {
		double sum = 0;
		for (Nodo aux = punteroInicio; aux != null; aux = aux.punteroSiguiente) {
			sum = sum + aux.resultado;
		}
		return sum;
	}

	/**
	 * Constructor toString que realiza los monomios individualmente y luego los
	 * suma
	 * 
	 */
	public void toString(int x) {
		for (Nodo aux = punteroInicio; aux != null; aux = aux.punteroSiguiente) {
			System.out.println(aux.coeficiente + "*" + x + "^" + aux.exponente + " = " + aux.resultado);
		}
		System.out.print("El resultado: ");
		for (Nodo aux = punteroInicio; aux != null; aux = aux.punteroSiguiente) {
			if (aux.punteroSiguiente != null) {
				System.out.print(aux.resultado + " + ");
			} else {
				System.out.print(aux.resultado);
			}
		}
		System.out.println(" = " + calcularPolinomio());
	}
}