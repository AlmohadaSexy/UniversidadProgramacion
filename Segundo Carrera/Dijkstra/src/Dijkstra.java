
class Dijkstra { 
	static final int V=10;
	int minimaDistancia(int dist[], Boolean sptSet[]) { 
		int min = Integer.MAX_VALUE, min_index=-1; 

		for (int v = 0; v < V; v++) 
			if (sptSet[v] == false && dist[v] <= min) { 
				min = dist[v]; 
				min_index = v; 
			} 

		return min_index; 
	} 

	void imprimirDistancias(int dist[], int n) { 
		System.out.println("Distancia al vertice A al vertice G es de " + dist[8]); 
	} 

	void dijkstra(int graph[][], int src) { 
		int dist[] = new int[V];

		 
		Boolean sptSet[] = new Boolean[V];
		
		for (int i = 0; i < V; i++) { 
			dist[i] = Integer.MAX_VALUE; 
			sptSet[i] = false; 
		} 
 
		dist[src] = 0; 

		for (int count = 0; count < V-1; count++) { 
			int u = minimaDistancia(dist, sptSet);
			
			sptSet[u] = true;
			
			for (int v = 0; v < V; v++) 
				if (!sptSet[v] && graph[u][v]!=0 && 
						dist[u] != Integer.MAX_VALUE && 
						dist[u]+graph[u][v] < dist[v]) 
					dist[v] = dist[u] + graph[u][v]; 
		} 

		imprimirDistancias(dist, V); 
	} 

	
	public static void main (String[] args){ 
		int grafo[][] = new int[][]{{0, 4, 1, 0, 0, 0, 0, 0, 0, 0}, 
									{0, 0, 10, 1, 0, 0, 0, 0, 0, 0}, 
									{0, 0, 0, 5, 0, 0, 9, 0, 0, 0}, 
									{0, 0, 0, 0, 0, 3, 0, 0, 0, 0}, 
									{0, 0, 0, 0, 0, 0, 0, 2, 0, 0}, 
									{0, 0, 0, 0, 1, 0, 1, 3, 7, 0}, 
									{0, 0, 0, 0, 0, 0, 0, 0, 0, 2}, 
									{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
									{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0, 0, 0, 1, 0}
									}; 
		Dijkstra t = new Dijkstra(); 
		t.dijkstra(grafo, 1);
	} 
} 
