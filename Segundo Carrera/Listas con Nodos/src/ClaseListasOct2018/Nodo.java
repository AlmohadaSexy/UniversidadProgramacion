package ClaseListasOct2018;

public class Nodo {

	public int dato;
	/**
	 * puntero para enlazar o enlace
	 */
	public Nodo punteroSiguiente;

	public Nodo(int dato, Nodo puntero) {
		this.dato = dato;
		/**
		 * puntero que le llega como parametro desde la clase principal
		 */
		punteroSiguiente = puntero;
	}

}