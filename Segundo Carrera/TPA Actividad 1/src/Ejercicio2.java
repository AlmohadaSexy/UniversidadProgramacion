import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero: ");
		int numero = sc.nextInt();
		sc.close();

		if (!esPrimo(numero, 2))
			System.out.println("No es numero primo");
		else
			System.out.println("Es numero primo");
	}

	public static boolean esPrimo(int numero, int aux) {
		// si el numero auxiliar llega al valor de numero devolvemos true, ya que es
		// primo
		if (numero == aux)
			return true;
		else {
			// si numero entre aux da un numero entero, el numero no es primo
			if (numero % aux == 0)
				return false;
			else
				// si da un numero decimal, llamamos recursivamente a es primo sumando
				// 1 a aux
				return esPrimo(numero, aux + 1);
		}
	}

}
