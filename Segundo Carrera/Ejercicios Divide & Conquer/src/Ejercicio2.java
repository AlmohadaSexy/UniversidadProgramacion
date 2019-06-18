
public class Ejercicio2 {

	public static void main(String[] args) {
		int[] vector1 = {1,3,4,7,8,9,10,11};
		int[] vector2 = {1,2,4,4,5,6,7,9,12,13};
		System.out.print("Array 1 - ");
		toString(vector1);
		System.out.print("Array 2 - ");
		toString(vector2);
		int merged[] = merge(vector1, vector2);
		System.out.print("Array junto - ");
		toString(merged);
		getMediana(merged);
	}
	/**
	 * Este metodo fusiona comparando con dos punteros los dos arrays ya ordenados
	 * Al ser solo un while basado en el tamaño de los dos arrays, su complejidad es de O(n)
	 * 
	 * Complejidad O(n)
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static int[] merge(int[] v1, int[] v2) {
		int[] result = new int[v1.length + v2.length];
		int v1Pointer, v2Pointer, resPointer;
		v1Pointer = v2Pointer = resPointer = 0;
		
		while(v1Pointer < v1.length || v2Pointer < v2.length) {
			if(v1Pointer < v1.length && v2Pointer < v2.length) {
				if(v1[v1Pointer] < v2[v2Pointer]) {
					result[resPointer++] = v1[v1Pointer++];
				} else {
					result[resPointer++] = v2[v2Pointer++];
				}
			} else if(v1Pointer < v1.length) {
				result[resPointer++] = v1[v1Pointer++];
			} else if(v2Pointer < v2.length) {
				result[resPointer++] = v2[v2Pointer++];
			}
		}
		return result;
	}
	
	public static void getMediana(int[] merged) {
		double median;
		if (merged.length % 2 == 0)
		    median = ((double)merged[merged.length/2] + (double)merged[merged.length/2 - 1])/2;
		else
		    median = (double) merged[merged.length/2];
		System.out.println("Mediana = " + median);
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
