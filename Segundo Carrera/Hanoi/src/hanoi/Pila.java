package hanoi;

/**
 * 
 * @author Ignacio Triguero
 *
 */
public class Pila {
	Nodo tope, fondo;
	int dato;
	int cuantos = 0;

	/**
	 * Este método crea la pila con su capacidad máxima
	 * 
	 * @param max
	 */
	public Pila() {
		tope = fondo = null;
	}

	/**
	 * Este método añade un dato encima de la pila
	 * 
	 * @param dato
	 */
	public void push(int dato) {
		tope = new Nodo(dato, tope);
		if (fondo == null) {
			fondo = tope;
		}
		cuantos++;
	}

	/**
	 * Este método borra el último dato de la pila
	 */
	public void pop() {
		if (!isEmpty()) {
			tope = tope.puntSig;
			cuantos--;
		} else {
			System.out.println("La pila está vacía.");
		}
	}

	/**
	 * Este método muestra el último dato de la pila
	 */
	public int top() {
		if (!isEmpty()) {
			return tope.dato;
		} else {
			return 0;
		}
	}

	/**
	 * Este metodo devuelve si esta vacia la pila o no
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return cuantos == 0;
	}

	/**
	 * Método toString()
	 */
	public String toString() {
		if (!isEmpty()) {
			for (Nodo aux = tope; aux != null; aux = aux.puntSig) {
				System.out.println("|\t" + aux.dato + "\t|");
			}
		} else {
			System.out.println("La pila está vacía.");
		}
		System.out.println();
		return "";
	}
}
