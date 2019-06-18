package ListaDobleEnlace;

public class NodoDobleEnlace {
	public int dato;
	// punteros para enlazar
	public NodoDobleEnlace punteroSiguiente, punteroAnterior;

	public NodoDobleEnlace(NodoDobleEnlace punteroAnterior, int dato, NodoDobleEnlace punteroSiguiente) {
		this.dato = dato;
		/**
		 * punteros que le llegan como parametro desde la clase principal
		 */
		this.punteroAnterior = punteroAnterior;
		this.punteroSiguiente = punteroSiguiente;
	}

}
