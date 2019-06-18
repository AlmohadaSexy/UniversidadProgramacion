package ListaCDobleEnlace;

import ListaCDobleEnlace.NodoCDobleEnlace;

public class ListaCDobleEnlace {
	NodoCDobleEnlace puntInicio, puntFin, nodo1, nodoCD, puntRecorrer, puntRecorrerString;
	int size;

	public ListaCDobleEnlace() {
		puntInicio = null;
		puntFin = null;
		size = 0;
	}

	public void agregarNodo(int valorDato) {
		nodoCD = new NodoCDobleEnlace(valorDato, null, null);
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
		size++;
	}
	// Este codigo era para jugar con el codigo no merece la pena
//	public void play() {
//		puntRecorrer = puntInicio;
//	}
//	public void forward(ListaCDobleEnlace lista) {
//		puntRecorrer = puntRecorrer.puntSig;
//		int aux = puntRecorrer.dato;
//		puntRecorrer.dato = 999;
//		System.out.println(lista);
//		puntRecorrer.dato = aux;
//	}
//	
//	public void backwards(ListaCDobleEnlace lista) {
//		puntRecorrer = puntRecorrer.puntAnt;
//		int aux = puntRecorrer.dato;
//		puntRecorrer.dato = 999;
//		System.out.println(lista);
//		puntRecorrer.dato = aux;
//	}

	public String recorrerDesdeInicio() {
		System.out.print("[ " + puntInicio.dato + " ]<---->");
		puntRecorrerString = puntInicio.puntAnt;
		while (puntRecorrerString.puntAnt != puntInicio) {
			System.out.print("[ " + puntRecorrerString.dato + " ]<---->");
			puntRecorrerString = puntRecorrerString.puntAnt;
		}
		System.out.print("[ " + puntRecorrerString.dato + " ]");
		return "";
	}

	public String recorrerDesdeFinal() {
		System.out.print("[ " + puntFin.dato + " ]<---->");
		puntRecorrerString = puntFin.puntAnt;
		while (puntRecorrerString.puntAnt != puntFin) {
			System.out.print("[ " + puntRecorrerString.dato + " ]<---->");
			puntRecorrerString = puntRecorrerString.puntAnt;
		}
		System.out.print("[ " + puntRecorrerString.dato + " ]");
		return "";
	}

	public String toString() {
		puntRecorrerString = puntInicio;
		if (size == 0) {
			System.out.println("empty");
			return "";
		}
		if (puntInicio.puntSig == puntInicio) {
			System.out.print("[ " + puntInicio.dato + " ]<---->[ " + puntRecorrerString.dato + " ]");
			return "";
		}
		System.out.print("[ " + puntInicio.dato + " ]<---->");
		puntRecorrerString = puntInicio.puntSig;
		while (puntRecorrerString.puntSig != puntInicio) {
			System.out.print("[ " + puntRecorrerString.dato + " ]<---->");
			puntRecorrerString = puntRecorrerString.puntSig;
		}
		System.out.print("[ " + puntRecorrerString.dato + " ]");
		return "";
	}
}
