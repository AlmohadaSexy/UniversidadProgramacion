package actividad;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca m -- ");
		int m = sc.nextInt();
		System.out.print("Introduzca n -- ");
		int n = sc.nextInt();
		System.out.println(combinatoria(m, n));

	}

	public static int combinatoria(int m, int n) {
		return factorial(m) / (factorial(n) * factorial(m - n));
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}