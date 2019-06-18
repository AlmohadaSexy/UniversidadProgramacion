package examen;

public class Nodo {
	public Nodo puntSig, puntAnt;
	public int dato;
	public String datoString;

	/**
	 * Constructor de Nodo
	 * 
	 * @param valorDato
	 * @param valorDatoString
	 * @param sig
	 * @param ant
	 */
	public Nodo(int valorDato, String valorDatoString, Nodo sig, Nodo ant) {
		dato = valorDato;
		datoString = valorDatoString;
		puntSig = sig;
		puntAnt = ant;
	}
}
