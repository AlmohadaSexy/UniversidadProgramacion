package mierda;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero;
		char letra;
		int ii = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Numero - ");
			numero = sc.nextInt();
			letra = (char) numero;
			System.out.println("Letra - " + letra);
		}
		//48-57; 65-90; 97-122
	}

}
