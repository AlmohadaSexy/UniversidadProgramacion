/**
 * 
 */
package ListaCDobleEnlace;

/**
 * @author trigu
 *
 */
public class NodoCDobleEnlace {
	public NodoCDobleEnlace puntSig;
	public NodoCDobleEnlace puntAnt;
	public int dato;

	public NodoCDobleEnlace(int dato) {
		this.dato = dato;
	}

	public NodoCDobleEnlace(int valorDato, NodoCDobleEnlace sig, NodoCDobleEnlace ant) {
		dato = valorDato;
		puntSig = sig;
		puntAnt = ant;
	}
}
