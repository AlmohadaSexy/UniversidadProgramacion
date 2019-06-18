import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el tamaño de las dos matrices: ");
		int size = sc.nextInt();
		// Pedimos el valor del tamaño de las matrices cuadradas y las inicializamos
		int[][] matrix1 = new int[size][size];
		int[][] matrix2 = new int[size][size];
		int[][] multiplicacion = new int[size][size];

		System.out.println("Introduce elementos de la primera matriz");

		for (int i = 0; i < matrix1.length; i++)
			for (int j = 0; j < matrix1[0].length; j++)
				matrix1[i][j] = sc.nextInt(); // introducimos todos los datos de la matriz primera con dos for

		System.out.println("Introduce elementos de la segunda matriz");

		for (int i = 0; i < matrix2.length; i++)
			for (int j = 0; j < matrix2[0].length; j++)
				matrix2[i][j] = sc.nextInt(); // introducimos todos los datos de la matriz segunda con dos for

		sc.close();
		// igualamos la matriz res[][] al metodo multiplicar matriz que devuelve la
		// multiplicacion de las dos matrices
		int[][] res = multiplicarMatriz(matrix1, matrix2, multiplicacion, 0, 0, 0);

		System.out.println("Producto de matrices");
		// imprimimos la matriz resultado
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				System.out.print(res[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static int[][] multiplicarMatriz(int[][] mat1, int[][] mat2, int[][] resultado, int i, int j, int k) {
		// Si j es maxima devolvemos resultado y se terminaria la recursividad
		if (j == resultado.length)
			return resultado;
		// si k es menor que el tamaño de la fila, hacemos la operacion del sumatorio de
		// los productos de fila*columna
		if (k < resultado.length) {
			resultado[i][j] += mat1[i][k] * mat2[k][j];
			return multiplicarMatriz(mat1, mat2, resultado, i, j, k + 1);
		} else {
			// si no es menor, vamos igual que con el de sumar matrices, como si fuera un
			// for doble con dos variables
			if (i < resultado.length - 1)
				return multiplicarMatriz(mat1, mat2, resultado, i + 1, j, 0);
			else
				return multiplicarMatriz(mat1, mat2, resultado, 0, j + 1, 0);
		}
	}

}
