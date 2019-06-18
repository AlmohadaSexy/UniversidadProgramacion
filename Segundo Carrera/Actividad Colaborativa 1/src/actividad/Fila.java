package actividad;

import java.util.ArrayList;

/**
 * 
 * @author Ignacio Triguero
 *
 */
public class Fila {

	public Nodo primero;
	public Nodo ultimo;
	public int size = 0;

	/**
	 * Este m�todo crea la pila con su capacidad m�xima
	 * 
	 * @param max
	 */
	public Fila() {
		primero = null;
		ultimo = null;
	}

	/**
	 * Este metodo devuelve si esta vacia la fila o no
	 * 
	 * @return
	 */
	public boolean estaVacia() {
		return primero == null;
	}

	/**
	 * Este m�todo a�ade un dato encima de la pila
	 * 
	 * @param dato
	 */
	public void add(int dato) {
		Nodo aux = new Nodo(dato);

		if (estaVacia()) {
			primero = aux;
			ultimo = aux;
		}

		aux.puntSig = null;
		ultimo.puntSig = aux;
		ultimo = aux;
		size++;
	}

	/**
	 * Este m�todo borra el �ltimo dato de la pila
	 */
	public void quitarPrimero() {
		if (estaVacia() == false) {
			primero = primero.puntSig;
		}
		size--;
	}

	/**
	 * Este m�todo muestra el �ltimo dato de la fila
	 */
	public int devolverPrimero() {
		return primero.dato;
	}

	/**
	 * Este metodo devuelve el tama�o de la Fila
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * M�todo toString()
	 */
	public String toString() {
		ArrayList<Integer> datosCola = new ArrayList<>();
		String retStr = "";
		int size = getSize();
		for (int i = 0; i < size; i++) {
			datosCola.add(devolverPrimero());
			this.quitarPrimero();
		}

		for (Integer dato : datosCola) {
			retStr += "[ " + dato + " ]<----";
			this.add(dato);
		}
		retStr += " Fin de la cola";
		return retStr;
	}
}
