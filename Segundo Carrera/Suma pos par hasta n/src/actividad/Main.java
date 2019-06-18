package actividad;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca n -- ");
		int n = sc.nextInt();
		System.out.println(sumaHasta(n));
	}

	public static int sumaHasta(int n) {
		if (n < 2) {
			return 0;
		} else if (n == 2) {
			return 2;
		} else if (n % 2 == 1) {
			n = n - 1;
		}
		return n + sumaHasta(n - 1);
	}
}
