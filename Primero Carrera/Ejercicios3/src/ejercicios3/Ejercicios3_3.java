package ejercicios3;

import java.util.Scanner;

public class Ejercicios3_3 {
    public static void main(String[] args) {
    	int arr[] = new int[4];
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Adivine el número del 0 al 25 con 4 intentos: ");
        int numero = scanner.nextInt();
        int adivinar = 19;
        int i = 0;
        while( numero != adivinar && i < 3 ) {
            arr[i++] = numero;
            System.out.print("Pruebe otra vez: ");
            numero = scanner.nextInt();
        }arr[i++] = numero;
        if ( numero == adivinar) {
        	System.out.print("Enhorabuena, has acertado el número!! ");
        	System.out.println("Sus intentos: ");
        } else {
        	System.out.print("Vaya, parece que no has acertado el número... ");
        	System.out.println("Sus intentos: ");
        }
        //Recorro el array mostrando su contenido
        for( int j = 0; j < i; j++){
            System.out.println(arr[j]);
        }
    }
}