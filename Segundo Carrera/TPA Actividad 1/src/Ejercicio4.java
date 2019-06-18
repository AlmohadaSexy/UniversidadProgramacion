import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce String");
		String str = sc.nextLine();
		str = str.replaceAll("\\s", "");
		sc.close();

		if (esPalindromo(str))
			System.out.println("Es palindromo");
		else
			System.out.println("No es palindromo");

	}

	public static boolean esPalindromo(String str) {
		// si la longitud de la string es 0 o 1 es palindromo, por lo que devolvemos
		// true
		if (str.length() == 0 || str.length() == 1)
			return true;
		// si el valor de la string en las posiciones 0 y ultima(menos 1) , llamamos
		// recursivamente al metodo reduciendo la string por los extremos
		if (str.charAt(0) == str.charAt(str.length() - 1))
			return esPalindromo(str.substring(1, str.length() - 1));
		return false;
	}

}
