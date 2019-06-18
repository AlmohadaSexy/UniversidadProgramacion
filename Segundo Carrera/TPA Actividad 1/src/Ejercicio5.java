import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el tamaño de la matriz");
		int size = sc.nextInt();
		int[][] mat1 = new int[size][size]; // suponemos que la matriz es cuadrada por lo que usamos el mismo tamaño
		int[][] mat2 = new int[size][size]; // para todas las matrices
		int[][] resultado = new int[size][size];

		System.out.println("Introduce elementos de la primera matriz");

		for (int i = 0; i < mat1.length; i++)
			for (int j = 0; j < mat1[0].length; j++)
				mat1[i][j] = sc.nextInt(); // por cada iteracion introducimos un valor para cada casilla de la matriz1

		System.out.println("Introduce elementos de la segunda matriz");

		for (int i = 0; i < mat2.length; i++)
			for (int j = 0; j < mat2[0].length; j++)
				mat2[i][j] = sc.nextInt(); // por cada iteracion introducimos un valor para cada casilla de la matriz2

		sc.close();

		// aqui igualamos la matriz resultado con el metodo suma que es de tipo int[][],
		// quedando asi el array resultado como el resultado de la suma de las dos
		// matrices
		resultado = suma(mat1, mat2, resultado, 0, 0);

		// imprimimos la matriz resultado
		for (int i = 0; i < resultado.length; i++) {
			for (int j = 0; j < resultado[0].length; j++) {
				System.out.print(resultado[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static int[][] suma(int[][] matriz1, int[][] matriz2, int[][] resultado, int i, int j) {
		// Si j llega al maximo entonces devolvemos la matriz resultado
		if (j == resultado.length)
			return resultado;
		// sumamos las dos matrices con las coordenadas i j
		resultado[i][j] = matriz1[i][j] + matriz2[i][j];

		// si i es menor que el tamaño maximo menos 1, sumamos 1 a i recursivamente
		// si no, se llama recursivamente con i = 0 y j + 1, sumando una linea
		if (i < resultado.length - 1)
			return suma(matriz1, matriz2, resultado, i + 1, j);
		else
			return suma(matriz1, matriz2, resultado, 0, j + 1);
	}
}
