package actividad;

/**
 * 
 * @author Ignacio Triguero
 *
 */
public class Pila {
	Nodo tope, fondo;
	int dato;
	int size = 0;

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
		size++;
	}

	/**
	 * Este m�todo borra el �ltimo dato de la pila
	 */
	public void pop() {
		if (!estaVacio()) {
			tope = tope.puntSig;
			size--;
		} else {
			System.out.println("La pila est� vac�a.");
		}
	}

	/**
	 * Este m�todo muestra el �ltimo dato de la pila
	 */
	public int top() {
		if (!estaVacio()) {
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
	public boolean estaVacio() {
		return tope == null;
	}

	/**
	 * Este metodo devuelve el tama�o de la pila
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
		if (!estaVacio()) {
			Pila aux = new Pila();
			for (int ii = 0; ii < 5; ii++) {
				System.out.println("|\t" + top() + "\t|");
				aux.push(top());
				pop();
			}
			for (int ii = 0; ii < 5; ii++) {
				push(aux.top());
				aux.pop();
			}
			System.out.println();
		} else {
			System.out.println("La pila est� vac�a.");
		}
		return "";
	}

	/**
	 * Este metodo ordena las pilas con las condiciones especificadas
	 */
	public void ordenar() {
		Pila auxJ = new Pila();
		Pila auxV = new Pila();
		for (int k = 0; k < 5; k++) {
			if (top() < 50) {
				auxJ.push(top());
				pop();
			} else {
				auxV.push(top());
				pop();
			}
		}
		int auxJSize = auxJ.getSize();
		int auxVSize = auxV.getSize();
		for (int j = 0; j < auxVSize; j++) {
			push(auxV.top());
			auxV.pop();
		}
		for (int j = 0; j < auxJSize; j++) {
			push(auxJ.top());
			auxJ.pop();
		}
	}

	public void limpiar() {
		while (!estaVacio()) {
			pop();
		}
	}
}
