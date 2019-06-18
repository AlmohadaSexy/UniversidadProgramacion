package ClaseListasOct2018;

public class Lista {
	protected Nodo punteroInicio; // puntero para indicar el inicio del nodo
	protected Nodo punteroFin; // puntero para indicar el fin del nodo

	// Constructor para inicializar punteros del la Lista--->Nodo
	public Lista() {
		punteroInicio = null;
		punteroFin = null;
	}

	public void agregarNodoALaLista(int dato) {
		// Creo un nodo y lo enlazo asignadolo al puntero de inicio
		punteroFin = new Nodo(dato, punteroFin);

		if (punteroInicio == null) {
			punteroFin = punteroInicio;
		}
	}

	public String mostrarNodosDeLaLista() {
		Nodo punteroRecorrer = punteroInicio;
		System.out.println();
		while (punteroRecorrer != null) {
			System.out.print("[" + punteroRecorrer.dato + "]--->");
			punteroRecorrer = punteroRecorrer.punteroSiguiente;
		}
		return "";
	}

	public void borrarPrimerNodo() {
		if (!estaVacio()) {
			punteroInicio = punteroInicio.punteroSiguiente;
		}
	}

	public boolean estaVacio() {
		return punteroInicio == null;
	}

	public void borrarUltimo() {
		if (!estaVacio()) {
			Nodo actual = punteroInicio;
			Nodo next = actual.punteroSiguiente;

			while (next.punteroSiguiente != null) {
				actual = next;
				next = next.punteroSiguiente;
			}

			punteroFin = actual;
			punteroFin.punteroSiguiente = null;
		}
	}

	public void borrarElemento(int element) {
		if (!estaVacio()) {
			Nodo actual = punteroInicio;
			Nodo siguiente = actual.punteroSiguiente;

			while (siguiente.dato != element) {
				actual = siguiente;
				siguiente = siguiente.punteroSiguiente;
			}

			actual.punteroSiguiente = siguiente.punteroSiguiente;
		}
	}

	public void borrarElementoEn(int index) {
		Nodo nodoPrevio = null;
		int cont = 0;

		for (Nodo aux = punteroInicio; aux != null; aux = aux.punteroSiguiente) {
			if (cont == index) {
				if (nodoPrevio == null) {
					punteroInicio = aux.punteroSiguiente;
				} else if (aux.punteroSiguiente == null) {
					borrarUltimo();
				} else {
					nodoPrevio = aux.punteroSiguiente;
					aux.punteroSiguiente = null;
				}
			}
			cont++;
			nodoPrevio = aux;
		}
	}

	public void mostrarPrimerNodo() {
		System.out.println();
		System.out.println("El primer nodo contiene el dato \t" + punteroInicio.dato);
		System.out.println("El primer nodo contiene el enlace \t" + punteroInicio.punteroSiguiente);
		System.out.println("El segundo nodo contiene el dato \t" + punteroInicio.punteroSiguiente.dato);
		System.out.println("El segundo Nodo contiene el enlace \t" + punteroInicio.punteroSiguiente.punteroSiguiente);
		System.out.println("El tercer nodo contiene el dato \t" + punteroInicio.punteroSiguiente.punteroSiguiente.dato);
		System.out.println("El tercer Nodo contiene el enlace \t" + punteroFin.punteroSiguiente);
		System.out.println();

	}

	public int cuantosNodos() {
		int cont = 0;
		for (Nodo aux = punteroInicio; aux != null; aux = aux.punteroSiguiente) {
			cont++;
		}
		return cont;
	}

	public int mostrarNodoEnIndice(int index) {
		int cont = 1;
		for (Nodo aux = punteroInicio; aux != null; aux = aux.punteroSiguiente) {
			if (index == cont) {
				return aux.dato;
			}
			cont++;
		}
		return 0;
	}

	public String toString() {
		for (Nodo aux = punteroInicio; aux != null; aux = aux.punteroSiguiente) {
			System.out.print(aux.dato + " ");
		}
		return "";
	}
}