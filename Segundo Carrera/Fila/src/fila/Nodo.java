package fila;

/**
 * 
 * @author Ignacio Triguero
 *
 */
public class Nodo {
	int dato;// dato del nodo
	Nodo puntSig;// punteroSiguiente

	/**
	 * Constructor del Nodo
	 * 
	 * @param dato
	 * @param punt
	 */
	public Nodo(int dato, Nodo punt) {
		this.dato = dato;
		this.puntSig = punt;
	}
}
