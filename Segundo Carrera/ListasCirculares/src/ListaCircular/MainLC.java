package ListaCircular;

import java.util.Scanner;

public class MainLC {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int apuesta, maxMoney, intentos, sumApuesta, numApuesta, auxApuesta;
		boolean gana = false;
		ListaCircular lista = new ListaCircular();

		for (int i = 0; i < 10; i++) {
			lista.agregarNodoAListaCircular(i);
		}

		System.out.print("Lista Inicial: ");
		System.out.println(lista);
		System.out.println("Tamaño lista: " + lista.size());

		System.out.print("Introduzca su apuesta: ");
		apuesta = sc.nextInt();
		System.out.print("Introduzca su dinero máximo: ");
		maxMoney = sc.nextInt();
		intentos = 0;
		System.out.print("¿En qué número quieres apostar? (0-9): ");
		numApuesta = sc.nextInt();
		while (true) {
			auxApuesta = apuesta;
			if (gana) {
				maxMoney = (maxMoney + 2);
				System.out.print("¿Quieres seguir apostando? (1 == si, 0 == no): ");
				int seguir = sc.nextInt();
				if (seguir == 1) {
					System.out.println("¿En qué número quieres apostar? (0-9): ");
					numApuesta = sc.nextInt();
					gana = false;
				} else if (seguir == 0) {
					break;
				}
			}
			for (sumApuesta = auxApuesta; sumApuesta <= maxMoney; sumApuesta += auxApuesta) {
				intentos++;
				auxApuesta = auxApuesta * 2;
				if (lista.recorrerLista(
						(int) (Math.random() * (lista.size() * 10 - lista.size() * 2) + lista.size() * 2),
						numApuesta)) {

					System.out.println(
							"Has ganado 2€ tras apostar " + sumApuesta + "€ durante " + intentos + " intentos.");
					System.out.println(lista);
					gana = true;
					break;
				}
				System.out.println();
			}
			if (!gana) {
				System.out
						.println("Has perdido " + (sumApuesta - auxApuesta) + "€ tras apostar " + intentos + " veces.");
				break;
			}
		}
	}
}
