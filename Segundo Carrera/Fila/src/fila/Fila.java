package fila;

/**
 * 
 * @author Ignacio Triguero
 *
 */
public class Fila {
	Nodo ultimo, primero;
	int dato;
	int size = 0;

	/**
	 * Este método crea la pila con su capacidad máxima
	 * 
	 * @param max
	 */
	public Fila() {
		ultimo = primero = null;
	}

	/**
	 * Este método añade un dato encima de la pila
	 * 
	 * @param dato
	 */
	public void anadir(int dato) {
		ultimo = new Nodo(dato, ultimo);
		if (primero == null) {
			primero = ultimo;
		}
		size++;
	}

	/**
	 * Este método borra el último dato de la pila
	 */
	public void quitarPrimero() {
		if (!estaVacio()) {
			Nodo actual = ultimo;
			Nodo next = actual.puntSig;

			while (next != null) {
				actual = next;
				next = next.puntSig;
			}
			primero = actual;
			primero.puntSig = null;
			size--;
		} else {
			System.out.println("La fila está vacía.");
		}
	}

	/**
	 * Este método muestra el último dato de la fila
	 */
	public void mostrarPrimero() {
		if (!estaVacio()) {
			System.out.print("[ " + primero.dato + " ]");
		} else {
			System.out.println("La fila está vacía.");
		}
	}

	/**
	 * Este método muestra el último dato de la fila
	 */
	public void mostrarUltimo() {
		if (!estaVacio()) {
			System.out.print("[ " + ultimo.dato + " ]");
		} else {
			System.out.println("La fila está vacía.");
		}
	}

	/**
	 * Este metodo devuelve si esta vacia la fila o no
	 * 
	 * @return
	 */
	public boolean estaVacio() {
		return size == 0;
	}

	public double cuantos() {
		return size;
	}

	/**
	 * Método toString()
	 */
	public String toString() {
		if (!estaVacio()) {
			for (Nodo aux = ultimo; aux != null; aux = aux.puntSig) {
				System.out.print("[ " + aux.dato + " ]--->");
			}
		} else {
			System.out.println("La fila está vacía.");
		}
		System.out.println();
		return "";
	}
}
