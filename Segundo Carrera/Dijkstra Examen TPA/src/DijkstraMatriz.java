
public class DijkstraMatriz {
	
	/**
	 * Las Rozas = 0
	 * Moncloa = 1
	 * Madrid = 2
	 * Pinto = 3
	 * Valdemoro = 4
	 * Alcorcon = 5
	 * UEM Villa = 6
	 * UEM Alcobendas = 7
	 * San Sebastian de los Reyes = 8
	 */
	public static void main(String[] args) {
		Grafo g = new Grafo(9);
		g.addEdge(0,1,25);
		g.addEdge(0,3,50);
		g.addEdge(0,8,46);
		
		g.addEdge(1,2,18);
		g.addEdge(1,4,42);
		g.addEdge(1,7,49);
		
		g.addEdge(2,4,28);
		g.addEdge(2,5,50);
		g.addEdge(2,7,39);
		
		g.addEdge(3,4,20);
		g.addEdge(3,6,48);
		
		g.addEdge(4,5,55);
		
		g.addEdge(5,6,9);
		g.addEdge(5,7,37);
		
		g.addEdge(6,8,43);
		
		g.addEdge(7,8,20);
		
		g.paString();
		g.Dijkstra(0, 6);
	}
}

class Grafo {
	private static final int noParent = -1; 
	int numNodos;
	int[][] grafo;
	boolean[] cogidos;
	int[] distancias;
	int[] camino; //linea cambiada 1
	
	/**
	 * Constructor de la clase
	 * @param numNodos Numero de nodos
	 */
	public Grafo(int numNodos) {
		this.numNodos = numNodos;
		this.grafo = new int[numNodos][numNodos];
	}
	/**
	 * Añadir arista, al no ser dirigido pues se añaden las aristas para ambos lados. Help:
	 * 
	 * Las Rozas = 0,
	 * Moncloa = 1,
	 * Madrid = 2,
	 * Pinto = 3,
	 * Valdemoro = 4,
	 * Alcorcon = 5,
	 * UEM Villa = 6,
	 * UEM Alcobendas = 7,
	 * San Sebastian de los Reyes = 8.
	 * 
	 * @param inicio nodo inicio
	 * @param fin nodo final
	 * @param peso peso de la conexion
	 */
	public void addEdge(int inicio, int fin, int peso) {
		this.grafo[inicio][fin] = peso;
		this.grafo[fin][inicio] = peso;
	}	
	
	/**
	 * Algoritmo de Dijkstra
	 * @param inicio
	 * @param fin
	 */
	public void Dijkstra(int inicio, int fin) {
		this.distancias = new int[numNodos]; //inicializamos los arrays auxiliares
		this.cogidos = new boolean[numNodos]; 
		this.camino = new int[numNodos];//linea cambiada 2
		this.camino[inicio] = noParent; //linea cambiada 3
		
		for(int i = 0; i < this.numNodos;i++) { //rellenamos los arrays auxiliares
			this.distancias[i] = Integer.MAX_VALUE; // de valores superaltos
			this.cogidos[i] = false; // de false
		}
		
		this.distancias[inicio] = 0; //ponemos la posicion de inicio a 0
		
		for(int cont = 0; cont < this.numNodos - 1; cont++) { //empezamos un for que recorra desde 0 hasta numNodos
			int i = this.minimaDistancia(); //cogemos el indice de la distancia mas pequeña
			this.cogidos[i] = true; //cambiamos el valor de cogidos en ese valor por true para decir que ya esta cogido

			for(int j = 0; j < this.numNodos; j++) { // segundo for que suma la distancia
				/**
				 * condiciones:
				 * Que valor de cogidos j no este cogido == false
				 * Que el valor en [i][j] sea distinto de 0
				 * Que el valor de distancias [i] sea distinto que MAX_VALUE
				 * Que el valor de la suma de distancias[i] + el valor de grafo en los indices [i][j] sea menor que distancias [j]
				 */
				if(this.cogidos[j] == false && this.grafo[i][j] != 0 && this.distancias[i] != Integer.MAX_VALUE && this.distancias[i] + this.grafo[i][j] < this.distancias[j]) {
					camino[j] = i; //linea cambiada 4
					// sumamos distancias[i] + el valor de grafo [i][j] y lo metemos en el valor de [j] en distancias
					this.distancias[j] = this.distancias[i] + this.grafo[i][j];
				}
			}
		}
		// imprimimos el resultado
		imprimirResultado(inicio, fin);
	}
	
	public void paString() {
		for(int i = 0; i < this.numNodos; i++) {
			System.out.print("[\t");
			for(int j = 0; j < this.numNodos; j++) {
				System.out.print(this.grafo[i][j] + "\t");
			}
			System.out.println("]");
		}
		System.out.println();
	}
	
	private void imprimirResultado(int inicio, int fin) {
		int FIN = this.distancias[fin];
		System.out.println("Camino de " + inicio + " a " + fin + " es igual a: " + FIN);
		System.out.println();
		System.out.println("Camino: ");
		printCamino(fin);
	}
	
	//metodo para imprimir el camino.
	private void printCamino(int ind) {
		if(ind == noParent) {
			return;
		}
		printCamino(this.camino[ind]);
		
		switch(ind) {
		case 0: System.out.println("Las Rozas - 0");
	    break;

	    case 1: System.out.println("Moncloa - 1");
	    break;
	    
	    case 2: System.out.println("Madrid - 2");
	    break;
	    
	    case 3: System.out.println("Pinto - 3");
	    break;
	    
	    case 4: System.out.println("Valdemoro - 4");
	    break;
	    
	    case 5: System.out.println("Alcorcon - 5");
	    break;
	    
	    case 6: System.out.println("UEM Villa - 6");
	    break;
	    
	    case 7: System.out.println("UEM Alcobendas - 7");
	    break;

	    case 8: System.out.println("San Sebastián de los Reyes - 8");
	    break;
		}
	}
	
	/**
	 * Esta funcion returnea el indice de la minima distancia de los vertices que no esten cogidos
	 * @return
	 */
	private int minimaDistancia() {
		int minimo = Integer.MAX_VALUE;
		int minimoIndex = -1;
		for(int v = 0; v < this.numNodos; v++) { // recorremos todos los nodos
			if(this.cogidos[v] == false && this.distancias[v] <= minimo) { //vamos comparando todos las distancias de todos los nodos y devolvemos el indice que tiene menor distancia y que no este cogido
				minimo = this.distancias[v];
				minimoIndex = v;
			}
		}
		return minimoIndex;
	}
}
