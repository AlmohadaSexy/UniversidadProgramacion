package ListaDobleEnlace;

public class ListaDobleEnlace {
	public NodoDobleEnlace nodo1, puntInicio, puntFin, nodo2;
	public int cont = 0;
	public boolean coinciden = false;

	public ListaDobleEnlace() {
		puntInicio = null;
		puntFin = null;
	}

	/**
	 * Este método agrega un <code>dato</code> a un nodo de la lista.
	 * 
	 * Se nombran todos los punteros correspondientes para que estén interconectados
	 * los nodos dentro de la lista.
	 * 
	 * @param dato del nodo
	 */
	public void agregarNodo(int dato) {
		puntInicio = new NodoDobleEnlace(null, dato, puntInicio);

		if (puntInicio.puntSig != null) {
			if (puntInicio.puntSig.puntAnt == null) {
				puntInicio.puntSig.puntAnt = puntInicio;
			}
		}
		if (puntFin == null) {
			puntFin = puntInicio;
		}
	}

	/**
	 * Este metodo llama a los métodos <code>recorrerListaDesdeInicio()</code> y
	 * <code>recorrerListaDesdeFinal()</code>
	 * 
	 * @param rndmNumber1
	 * @param rndmNumber2
	 * @param fallos
	 */
	public void coincidenNodos(int rndmNumber1, int rndmNumber2, int fallos) {
		nodo1 = recorrerListaDesdeInicio(rndmNumber1);
		nodo2 = recorrerListaDesdeFinal(rndmNumber2);
		// Este if compara los dos datos de los dos nodos en los que han caido tras
		// recorrerse
		if (nodo1.dato == nodo2.dato) {
			coinciden = true;
			nodo1.dato = fallos;
		}
	}

	/**
	 * Este metodo hace un while que solo termina cuando el contador
	 * <code>cont</code> llega al valor de <code>max</code>. Lo que hace es recorrer
	 * la lista desde el principio y volviendo para atras si termina la lista y
	 * devolver el nodo en el que cae.
	 *
	 * @param max el numero maximo de saltos
	 * @return Nodo donde cae tras recorrerse
	 */
	public NodoDobleEnlace recorrerListaDesdeInicio(int max) {
		cont = 0;
		while (true) {
			for (NodoDobleEnlace aux = puntInicio; aux != null; aux = aux.puntSig) {
				if (cont == max) {
					return aux;
				}
				cont++;
			}
			cont--;
			for (NodoDobleEnlace aux = puntFin; aux != null; aux = aux.puntAnt) {
				if (cont == max) {
					return aux;
				}
				cont++;
			}
			cont--;
		}
	}

	/**
	 * Este metodo hace un while que solo termina cuando el contador
	 * <code>cont</code> llega al valor de <code>max</code>. Lo que hace es recorrer
	 * la lista desde el final y volviendo para atras si termina la lista y devolver
	 * el nodo en el que cae.
	 *
	 * @param max el numero maximo de saltos
	 * @return Nodo donde cae tras recorrerse
	 */
	public NodoDobleEnlace recorrerListaDesdeFinal(int max) {
		cont = 0;
		while (true) {
			for (NodoDobleEnlace aux = puntFin; aux != null; aux = aux.puntAnt) {
				if (cont == max) {
					return aux;
				}
				cont++;
			}
			cont--;
			for (NodoDobleEnlace aux = puntInicio; aux != null; aux = aux.puntSig) {
				if (cont == max) {
					return aux;
				}
				cont++;
			}
			cont--;
		}
	}

	/**
	 * Metodo toString para escribir por consola la Lista completa.
	 */
	public String toString() {
		for (NodoDobleEnlace aux = puntInicio; aux != null; aux = aux.puntSig) {
			System.out.print(" [" + aux.dato + "] ");
			if (aux.puntSig != null) {
				System.out.print("<---->");
			}
		}
		System.out.println();
		return "";
	}
}
