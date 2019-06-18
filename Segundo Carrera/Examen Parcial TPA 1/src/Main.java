
public class Main {
	/**
	 * Complejidad del metodo mergeSort <b>O(n*log(n))</b>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {53, 571, 36, 22, 13, 84};
		mergeSort(arr, 0, arr.length - 1);
		toString(arr);
	}
	/**
	 * Va calculando las diferentes posiciones de punteros para que llame a la funcion merge con ellos
	 * @param arr
	 * @param ini
	 * @param fin
	 */
	public static void mergeSort(int[] arr, int ini, int fin) {
		if(ini < fin) {
			int mid = (ini + fin) / 2;
			mergeSort(arr, ini, mid);
			mergeSort(arr, mid + 1, fin);
			merge(arr, ini, mid, fin);
		}
	}
	/**
	 * le metemos el array entero con los punteros que dividen el array en tamaños mas pequeños
	 * 
	 * @param arr
	 * @param ini
	 * @param mid
	 * @param fin
	 */
	public static void merge(int[] arr, int ini, int mid, int fin) {
		int[] aux = new int[fin - ini + 1];
		//no divido el array en dos si no que uso el mismo array con dos contadores diferentes lo que ayuda en la complejidad
		int izqCont = ini, derCont = mid + 1, auxCont = 0;
		
		//comprobamos que los dos contadores hayan llegado a su tamaño máximo
		while(izqCont <= mid && derCont <= fin) {
			if(arr[izqCont] <= arr[derCont]) {
				aux[auxCont] = arr[izqCont];
				izqCont++;
				auxCont++;
			} else if(arr[izqCont] > arr[derCont]) {
				aux[auxCont] = arr[derCont];
				derCont++;
				auxCont++;
			}
		}
		//por si alguno no ha llegado al maximo
		while(izqCont <= mid) {
			aux[auxCont] = arr[izqCont];
			auxCont++;
			izqCont++;
		}
		while(derCont <= fin) {
			aux[auxCont] = arr[derCont];
			auxCont++;
			derCont++;
		}
		//Ahora hay que meter aux en arr de ini a fin, que son los dos contadores que limitan el tamaño que estamos ordenando en el array arr
		for(int i = ini; i <= fin; i++) {
			arr[i] = aux[i - ini];//restamos ini a i para hacerlo 0 y usarlo como contador			
		}
		
	}

	public static void toString(int[] arr) {
		if(arr.length == 0) {
			System.out.println("Vacío");
		} else if(arr.length == 1) {
			System.out.println("[" + arr[0] + "]");
		} else {
			for(int i = 0; i < arr.length; i++) {
				if(i == 0) {
					System.out.print("[" + arr[i] + ", ");
				} else if(i == arr.length-1) {
					System.out.println(arr[i] + "]");
				} else {
					System.out.print(arr[i] + ", ");
				}
			}
		}
		
	}
}
