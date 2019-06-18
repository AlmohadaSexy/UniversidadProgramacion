package actividad;

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
	 * Este método crea la pila con su capacidad máxima
	 * 
	 * @param max
	 */
	public Pila(int max) {
		this.max = max;
		tope = fondo = null;
	}

	/**
	 * Este método añade un dato encima de la pila
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
			System.out.println("La pila está llena.");
		}
	}

	/**
	 * Este método borra el último dato de la pila
	 */
	public void pop() {
		if (!estaVacio()) {
			tope = tope.puntSig;
			cuantos--;
		} else {
			System.out.println("La pila está vacía.");
		}
	}

	/**
	 * Este método muestra el último dato de la pila
	 */
	@SuppressWarnings("null")
	public int top() {
		if (!estaVacio()) {
			return tope.dato;
		} else {
			System.out.println("La pila está vacía.");
			return ((Integer) null);
		}
	}

	/**
	 * Este metodo devuelve si esta vacia la pila o no
	 * 
	 * @return
	 */
	public boolean estaVacio() {
		return max == 0;
	}

	/**
	 * Este metodo devuelve si esta llena la pila o no
	 * 
	 * @return
	 */
	public boolean estaLleno() {
		return cuantos < max;
	}

	public int getSize() {
		return cuantos;
	}

	/**
	 * Este metodo elimina el dato en la pila en la posicion <code>pos</code>
	 * 
	 * @param pos
	 * @param size
	 */
	public void eliminarEn(int pos, int size) {
		Pila aux = new Pila(size);
		int saltos = size - pos;
		for (int ii = 0; ii < saltos; ii++) {
			aux.push(this.top());
			this.pop();
		}
		this.pop();
		for (int jj = 0; jj < saltos; jj++) {
			this.push(aux.top());
			aux.pop();
		}
	}

	/**
	 * Este metodo cambia el dato en la posicion <code>pos</code> por el dato
	 * <code>dato</code>
	 * 
	 * @param pos
	 * @param dato
	 * @param size
	 */
	public void cambiarDatoEn(int pos, int dato, int size) {
		Pila aux = new Pila(size);
		int saltos = size - pos;
		for (int ii = 0; ii < saltos; ii++) {
			aux.push(this.top());
			this.pop();
		}
		this.pop();
		this.push(dato);
		for (int jj = 0; jj < saltos; jj++) {
			this.push(aux.top());
			aux.pop();
		}
	}

	/**
	 * Este metodo busca el numero <code>num</code> y lo elimina de la pila
	 * 
	 * @param num
	 * @param size
	 */
	public void eliminarNumero(int num, int size) {
		Pila aux = new Pila(size);
		int cont = 0;
		while (num != this.top()) {
			aux.push(this.top());
			this.pop();
			cont++;
		}
		this.pop();
		for (int jj = 0; jj < cont; jj++) {
			this.push(aux.top());
			// aux.pop();
		}
		aux.toString();
	}

	/**
	 * Este metodo busca el numero <code>num</code> en la pila y lo cambia por el
	 * dato <code>dato</code>
	 * 
	 * @param num
	 * @param dato
	 * @param size
	 */
	public void eliminarNumeroXPor(int num, int dato, int size) {
		Pila aux = new Pila(size);
		int cont = 0;
		while (num != this.top()) {
			aux.push(this.top());
			this.pop();
			cont++;
		}
		this.pop();
		this.push(dato);
		aux.toString();
		for (int jj = 0; jj < cont; jj++) {
			this.push(aux.top());
			aux.pop();
		}

	}

	/**
	 * Método toString()
	 */
	public String toString() {
		if (!estaVacio()) {
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
