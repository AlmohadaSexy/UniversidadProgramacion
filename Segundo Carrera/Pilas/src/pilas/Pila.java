package pilas;

import pilas.Nodo;

/**
 * 
 * @author Ignacio Triguero
 *
 */
public class Pila {
	Nodo tope, fondo;
	int dato, max;
	int cuantos = 0;

	/**
	 * Este m�todo crea la pila con su capacidad m�xima
	 * 
	 * @param max
	 */
	public Pila(int max) {
		this.max = max;
		tope = fondo = null;
	}

	/**
	 * Este m�todo a�ade un dato encima de la pila
	 * 
	 * @param dato
	 */
	public void push(int dato) {
		if (estaLleno()) {
			tope = new Nodo(dato, tope);
			if (fondo == null) {
				fondo = tope;
			}
			cuantos++;
		} else {
			System.out.println("La pila est� llena.");
		}
	}

	/**
	 * Este m�todo borra el �ltimo dato de la pila
	 */
	public void pop() {
		if (!estaVacio()) {
			tope = tope.puntSig;
			cuantos--;
		} else {
			System.out.println("La pila est� vac�a.");
		}
	}

	/**
	 * Este m�todo muestra el �ltimo dato de la pila
	 */
	public void top() {
		if (!estaVacio()) {
			System.out.println("|\t" + tope.dato + "\t|");
		} else {
			System.out.println("La pila est� vac�a.");
		}
	}

	/**
	 * Este metodo devuelve si esta vacia la pila o no
	 * 
	 * @return
	 */
	public boolean estaVacio() {
		return cuantos == 0;
	}

	/**
	 * Este metodo devuelve si esta llena la pila o no
	 * 
	 * @return
	 */
	public boolean estaLleno() {
		return cuantos < max;
	}

	/**
	 * M�todo toString()
	 */
	public String toString() {
		if (!estaVacio()) {
			for (Nodo aux = tope; aux != null; aux = aux.puntSig) {
				System.out.println("|\t" + aux.dato + "\t|");
			}
		} else {
			System.out.println("La pila est� vac�a.");
		}
		System.out.println();
		return "";
	}
}
