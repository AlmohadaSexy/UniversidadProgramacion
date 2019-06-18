package ListaDobleEnlace;

public class ListaDobleEnlace {
	protected NodoDobleEnlace punteroInicio;// puntero para indicar el inicio del nodo
	protected NodoDobleEnlace punteroFin; // puntero para indicar el fin del nodo
	public int cont = 0;

	public ListaDobleEnlace() {
		punteroInicio = null;
		punteroFin = null;
	}

	public void agregarNodoAlPrincipio(int dato) {
		punteroInicio = new NodoDobleEnlace(null, dato, punteroInicio);

		if (punteroInicio.punteroSiguiente != null) {
			if (punteroInicio.punteroSiguiente.punteroAnterior == null) {
				punteroInicio.punteroSiguiente.punteroAnterior = punteroInicio;
			}
		}
		if (punteroFin == null) {
			punteroFin = punteroInicio;
		}
	}

	public void agregarNodoAlFinal(int dato) {
		punteroFin = new NodoDobleEnlace(punteroFin, dato, null);
		punteroFin.punteroAnterior.punteroSiguiente = punteroFin;

		if (punteroInicio == null) {
			punteroInicio = punteroFin;
		}
	}

	public NodoDobleEnlace recorrerListaDesdeInicio(int max) {

		while (true) {
			for (NodoDobleEnlace aux = punteroInicio; aux != null; aux = aux.punteroSiguiente) {
				if (cont == max) {
					System.out.println("Hola");
					System.out.println(aux.dato);
					return aux;
				}
				cont++;
			}
			cont--;
			for (NodoDobleEnlace aux = punteroFin; aux != null; aux = aux.punteroAnterior) {
				if (cont == max) {
					System.out.println("Hola");
					System.out.println(aux.dato);
					return aux;
				}
				cont++;
			}
			cont--;
		}
	}

	public NodoDobleEnlace recorrerListaDesdeFinal(int max) {

		while (true) {
			for (NodoDobleEnlace aux = punteroFin; aux != null; aux = aux.punteroAnterior) {
				if (cont == max) {
					System.out.println("Hola");
					System.out.println(aux.dato);
					return aux;
				}
				cont++;
			}
			cont--;
			for (NodoDobleEnlace aux = punteroInicio; aux != null; aux = aux.punteroSiguiente) {
				if (cont == max) {
					System.out.println("Hola");
					System.out.println(aux.dato);
					return aux;
				}
				cont++;
			}
			cont--;
		}
	}

	public void coincidenNodos(int rndmNumber) {
		cont = 0;
		NodoDobleEnlace nodo1 = recorrerListaDesdeInicio(rndmNumber);
		cont = 0;
		NodoDobleEnlace nodo2 = recorrerListaDesdeFinal(rndmNumber);
		if (nodo1.dato == nodo2.dato) {
			System.out.println("yujuy te coinciden!");
		}
	}

	public String toString() {
		for (NodoDobleEnlace aux = punteroInicio; aux != null; aux = aux.punteroSiguiente) {
			System.out.print("<---->[" + aux.dato + "] ");
		}
		return "";
	}
}
