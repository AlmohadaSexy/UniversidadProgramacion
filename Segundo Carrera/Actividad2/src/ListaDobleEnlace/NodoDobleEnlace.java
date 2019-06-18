package ListaDobleEnlace;

public class NodoDobleEnlace {
	public int dato;
	public NodoDobleEnlace puntSig;
	public NodoDobleEnlace puntAnt;

	public NodoDobleEnlace(NodoDobleEnlace punteroAnterior, int dato, NodoDobleEnlace punteroSiguiente) {
		this.dato = dato;
		this.puntAnt = punteroAnterior;
		this.puntSig = punteroSiguiente;
	}

}
