package ListaCDobleEnlace;

/**
 * @author Ignacio Triguero
 *
 */
public class MainLCDE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListaCDobleEnlace lista = new ListaCDobleEnlace();
		lista.agregarNodo(20);
		lista.agregarNodo(25);
		lista.agregarNodo(30);
		lista.agregarNodo(35);
		System.out.println(lista);
		lista.recorrerDesdeInicio();
		System.out.println();
		lista.recorrerDesdeFinal();
	}
}
