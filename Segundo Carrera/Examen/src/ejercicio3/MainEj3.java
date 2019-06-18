package ejercicio3;

public class MainEj3 {
	static int total = 0;
	static boolean solucion = false;
	public static void main(String[] args) {
		int[] vector = new int[3];
		vector[0] = (int) (Math.random() * 6) + 1;
		vector[1] = (int) (Math.random() * 6) + 1;
		vector[2] = (int) (Math.random() * 6) + 1;
		System.out.println("index 0 = " +vector[0]);
		System.out.println("index 1 = " +vector[1]);
		System.out.println("index 2 = " +vector[2]);
		System.out.println("tiene que dar 8");
		System.out.println();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				total = 0;
				buscarSubConjunto(8, vector, i, j);
			}
		}
		if(!solucion) {
			System.out.println("No hay solucion");
		}
		
		
		
		
	}

	public static int buscarSubConjunto(int sumaSubConjunto, int[] vector, int ii, int jj) {
		if(ii != vector.length) {
			if(jj != vector.length) {
				total = vector[ii] + vector[jj];
				if(sumaSubConjunto == total && ii != jj) {
					System.out.println("Primero: " + vector[ii] + "(index = " + ii + "), Segundo: " + vector[jj] + "(index = " + jj + ")");
					solucion = true;
					buscarSubConjunto(sumaSubConjunto, vector, ii + 1, jj);
					return total;
				} else {
					buscarSubConjunto(sumaSubConjunto, vector, ii + 1, jj + 1);
					return total;
				}
			} else {
			buscarSubConjunto(sumaSubConjunto, vector, ii + 1, ii + 2);
			}
		}
		return 0;
	}

}
