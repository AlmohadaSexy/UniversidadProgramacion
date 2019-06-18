package Actividad;

public class Nodo {

	public int coeficiente;
	public int exponente;
	public double resultado;
	/**
	 * puntero para enlazar o enlace
	 */
	public Nodo punteroSiguiente;

	/**
	 * Constructor de la clase Nodo
	 * 
	 * @param coeficiente coeficiente del monomio
	 * @param exponente   exponente del monomio
	 * @param puntero     puntero que llega como parametro desde la clase principal
	 */
	public Nodo(int coeficiente, int exponente, Nodo puntero) {
		this.coeficiente = coeficiente;
		this.exponente = exponente;
		/**
		 * puntero que le llega como parametro desde la clase principal
		 */
		punteroSiguiente = puntero;
	}

}