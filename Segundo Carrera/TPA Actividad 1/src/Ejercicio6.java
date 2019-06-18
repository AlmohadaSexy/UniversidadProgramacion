import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca cuantos numeros quieres introducir en el array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Introduzca un numero: ");
			arr[i] = sc.nextInt(); // introducimos todos los datos del array
		}
		sc.close();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// imprimimos el array
		for (Integer elem : arr)
			System.out.print(elem + ", ");
	}
}
