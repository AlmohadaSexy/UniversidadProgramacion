package examen;

public class Lista {
	Nodo puntInicio, puntFin; // Los dos punteros auxiliares que se usan en la lista
	int size;

	/**
	 * Este es el constructor de la Lista
	 */
	public Lista() {
		puntInicio = null;
		puntFin = null;
	}

	/**
	 * Este metodo añade los valores a los dos campos del nodo tanto
	 * <code>valorDato</code> y <code>valorDatoString</code> en orden por la derecha
	 * 
	 * @param valorDato       int
	 * @param valorDatoString String
	 */
	public void agregarNodo(int valorDato, String valorDatoString) {
		Nodo nodoCD = new Nodo(valorDato, valorDatoString, null, null);

		// Se nombran todos los punteros necesarios para enlazar toda la lista
		if (puntInicio == null) {
			nodoCD.puntSig = nodoCD;
			nodoCD.puntAnt = nodoCD;
			puntInicio = nodoCD;
			puntFin = puntInicio;
		} else {
			nodoCD.puntAnt = puntFin;
			puntFin.puntSig = nodoCD;
			puntInicio.puntAnt = nodoCD;
			nodoCD.puntSig = puntInicio;
			puntFin = nodoCD;
		}
	}

	/**
	 * Este metodo añade al nodo si el valor del int es Par o Impar añadiendo P o I
	 */
	public void definirParOImpar() {
		Nodo puntRecorrer = puntInicio;
		do {
			if ((puntRecorrer.dato % 2) == 0) {
				puntRecorrer.datoString = "P";
			} else {
				puntRecorrer.datoString = "I";
			}
			puntRecorrer = puntRecorrer.puntSig;
		} while (puntRecorrer.puntSig != puntInicio.puntSig);

	}

	/**
	 * Este metodo recorre la lista desde el primero hacia la izquierda hasta el
	 * segundo
	 * 
	 * @return
	 */
	public String recorrerLista() {
		Nodo puntRecorrer = puntInicio;
		System.out.print("[ " + puntInicio.dato + " - " + puntRecorrer.datoString + " ]<---->");
		puntRecorrer = puntInicio.puntAnt;
		while (puntRecorrer.puntAnt != puntInicio) {
			System.out.print("[ " + puntRecorrer.dato + " - " + puntRecorrer.datoString + " ]<---->");
			puntRecorrer = puntRecorrer.puntAnt;
		}
		System.out.print("[ " + puntRecorrer.dato + " - " + puntRecorrer.datoString + " ]");
		return "";
	}
}
