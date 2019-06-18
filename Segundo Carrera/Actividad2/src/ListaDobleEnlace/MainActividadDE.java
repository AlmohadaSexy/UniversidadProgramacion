package ListaDobleEnlace;

public class MainActividadDE {

	public static void main(String[] args) {
		// creo la lista de Nodos de Doble enlace
		ListaDobleEnlace lista = new ListaDobleEnlace();

		// creamos los 7 nodos
		for (int i = 0; i < 7; i++) {
			lista.agregarNodo((int) (Math.random() * 100) + 1);

		}
		// Imprimimos la lista
		System.out.println(lista);

		// este contador lo usamos para contabilizar los fallos que hemos tenido
		int cont = 0;

		// Este while es el que usamos para mandar recorrer la lista desde los dos lados
		// con dos números aleatorios llamados con Math.random
		while (!lista.coinciden) {
			lista.coincidenNodos((int) (Math.random() * 9) + 1, (int) (Math.random() * 9) + 1, cont);
			cont++;
		}
		cont--;
		// Imprimimos los fallos que hemos tenido y volvemos a imprimir la lista
		System.out.println("Has tenido " + cont + " fallos.");
		System.out.println();
		System.out.println(lista);
	}
}
