package ejercicio1;

public class Lista {
	Nodo fin, inicio;
	int dato, max;
	
	public Lista() {
		fin = inicio = null;
	}
	
	public void add(int dato) {
			fin = new Nodo(dato, fin);
			if(inicio == null) {
				inicio = fin;
			}
	}
	
	public void cuantosPares() {
		int auxpar = 0;
		int auximpar = 0;
		for(Nodo aux = fin; aux != null; aux = aux.punteroSiguiente) {
			if(aux.dato % 2 == 0) {
				auxpar++;
			} else {
				auximpar++;
			}
		}
		System.out.println("Hay " + auxpar + " pares y " + auximpar + " impares.");
	}
	
	public String toString() {
			for(Nodo aux = fin; aux != null; aux = aux.punteroSiguiente) {
				System.out.print("| " + aux.dato + " |");
			}
			return "";
	}
}
