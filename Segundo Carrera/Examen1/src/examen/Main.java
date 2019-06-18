/**
 * 
 */
package examen;

/**
 * @author trigu
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lista lista = new Lista();
		// añade los 9 datos a int y ND a la zona del String
		for (int ii = 1; ii <= 9; ii++) {
			lista.agregarNodo(ii, "ND");
		}
		lista.recorrerLista();// recorre la lista antes de ser modificada
		System.out.println();
		System.out.println();
		lista.definirParOImpar();// añade si es par o impar

		lista.recorrerLista();// recorre la lista tras ser modificada
	}
}
