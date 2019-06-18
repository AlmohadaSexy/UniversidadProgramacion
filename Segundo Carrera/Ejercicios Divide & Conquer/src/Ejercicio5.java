
public class Ejercicio5 {
	public static void main(String[] args) {
		int[] arr = new int[20];
		//Rellenamos el array
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100);
		}
//		Llamamos al metodo de quickSort
		quickSort(arr, 0, arr.length - 1);
		toString(arr);
	}
	/**
	 * En este metodo vamos a llamar al metodo de particionar que se va a encargar de señalarnos donde quedaria el pivote tras meter a la izquierda los menores y a la derecha los mayores
	 * tras ello vamos llamando al metodo quicksort recursivamente con las respectivas particiones del array mas pequeñas ordenando primero todo por la izquierda y despues por la derecha
	 * 
	 * @param arr array que queremos ordenar
	 * @param ini inicio del array
	 * @param fin final del array
	 */
	public static void quickSort(int[] arr, int ini, int fin) {
		//cuando se llame a este metodo y las variables ini y fin sean iguales no se entrará por lo que ese lado del array ya estaría completamente ordenado dando paso a la parte de la derecha
		if(ini < fin) {
			toString(arr);
			//este partition index seria donde quedaria el pivote(cogemos siempre el ultimo numero del array para poner a la derecha y a la izquierda todos los numeros
			int partitionIndex = particion(arr, ini, fin);
			//aqui llamamos recursivamente al metodo quicksort con el tamaño del array de la izquierda sin contar el pivote, porque este ya está bien colocado
			quickSort(arr, ini, partitionIndex-1);
			//aqui lo mismo que arriba pero con el subarray de la derecha sin contar el pivote
			quickSort(arr, partitionIndex+1, fin);
		}
	}
	
	private static int particion(int[] arr, int ini, int fin) {
		//Cogemos como pivote el ultimo elemento del array
	    int pivot = arr[fin];
	    int i = (ini-1);
	    System.out.println();
	    System.out.println("Pivote - " + pivot);
	    for (int j = ini; j < fin; j++) {
	        if (arr[j] <= pivot) {
	            i++;
	 
	            int swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }
	 
	    int swapTemp = arr[i+1];
	    arr[i+1] = arr[fin];
	    arr[fin] = swapTemp;
	 
	    return i+1;
	}
	
	public static void toString(int[] arr) {
		int i;
		System.out.print("[");
		for(i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println(arr[i] + "]");
	}
}
