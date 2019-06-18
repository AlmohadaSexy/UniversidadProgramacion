package actividad;

/**
 * 
 * @author Ignacio Triguero
 *
 */
public class MainPilas {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Pila pila = new Pila(10);
		pila.push(1);
		pila.push(11);
		pila.push(3);
		pila.push(8);
		pila.push(5);
		pila.toString();
		System.out.println("Cambio el numero 3 por el 9");
		pila.eliminarNumeroXPor(11, 20, pila.getSize());
		System.out.println();
		pila.toString();
	}
}