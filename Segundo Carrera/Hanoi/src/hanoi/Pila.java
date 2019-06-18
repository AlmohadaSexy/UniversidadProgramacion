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
	 * Este m�todo crea la pila con su capacidad m�xima
	 * 
	 * @param max
	 */
	public Pila() {
		tope = fondo = null;
	}

	/**
	 * Este m�todo a�ade un dato encima de la pila
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
	 * Este m�todo borra el �ltimo dato de la pila
	 */
	public void pop() {
		if (!isEmpty()) {
			tope = tope.puntSig;
			cuantos--;
		} else {
			System.out.println("La pila est� vac�a.");
		}
	}

	/**
	 * Este m�todo muestra el �ltimo dato de la pila
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
	 * M�todo toString()
	 */
	public String toString() {
		if (!isEmpty()) {
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
