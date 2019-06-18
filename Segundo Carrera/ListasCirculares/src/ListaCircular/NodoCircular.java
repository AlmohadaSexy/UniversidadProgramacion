package ListaCircular;

public class NodoCircular {
	public NodoCircular puntSig;
	public int dato;

	public NodoCircular(int dato) {
		this.dato = dato;
		this.puntSig = this;
	}
}
