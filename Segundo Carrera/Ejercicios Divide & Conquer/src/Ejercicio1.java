
public class Ejercicio1 {
	public static void main(String[] args) {
		int[] vector1 = {1,3,4,7,8,9,10,11};
		int[] vector2 = {1,3,4,7,8,9,10,11};
		
		System.out.println(seeIfEqual(vector1, vector2));
	}
	/**
	 * En este metodo se ve si el array es igual al otro
	 *  
	 * Complejidad O(n)
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	private static boolean seeIfEqual(int[] v1, int[] v2) {
		if(v1.length != v2.length)
			return false;
		else
			for(int i = 0; i < v1.length - 1; i++) 
				if(v1[i] != v2[i])
					return false;
		return true;
	}
}
