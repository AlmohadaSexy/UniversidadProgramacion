package ListaCircular;

public class ListaCircular {
	NodoCircular puntActual, nodoC, puntRecorrer, puntRecorrerString;
	int size, contVueltas;

	public ListaCircular() {
		puntActual = null;
		size = 0;
	}

	public void agregarNodoAListaCircular(int valorDato) {
		nodoC = new NodoCircular(valorDato); // Creo aquí el Nodo
		if (puntActual != null) {
			nodoC.puntSig = puntActual.puntSig;
			puntActual.puntSig = nodoC;
		}
		puntActual = nodoC;
		size++;
	}

	public int size() {
		return size;
	}

	public boolean recorrerLista(int max, int numApuesta) {
		puntRecorrer = puntActual.puntSig;
		contVueltas = 0;
		System.out.println("Número de sorteo: " + max);
		do {
			puntRecorrer = puntRecorrer.puntSig;
			if (puntRecorrer == puntActual.puntSig) {
				contVueltas++;
			}
			max--;
		} while (max > 0);
		if (puntRecorrer.dato == numApuesta) {
			System.out.println("Número de vueltas: " + contVueltas);
			System.out.println("Ha caído en el número: " + puntRecorrer.dato);
			puntRecorrer.dato = contVueltas;
			return true;
		}
		System.out.println("Número de vueltas: " + contVueltas);
		System.out.println("Ha caido en el número: " + puntRecorrer.dato);
		return false;
	}

	public String toString() {
		puntRecorrerString = puntActual.puntSig;
		do {
			System.out.print("[ " + puntRecorrerString.dato + " ]");
			puntRecorrerString = puntRecorrerString.puntSig;
			if (puntRecorrerString != puntActual.puntSig) {
				System.out.print("---->");
			}
		} while (puntRecorrerString != puntActual.puntSig);
		return "";
	}
}
