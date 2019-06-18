package ejercicios3;

import java.util.Scanner;

public class Ejercicios3_4 {
    public static void main(String[] args) {
    	//defino un array de 10 participantes
        int arr[] = new int[10];
        
        //El escaner para leer el teclado
        Scanner scanner = new Scanner(System.in);
        
        //leo el primer valor
        //System.out.print("Adivine el número del 0 al 25 con 4 intentos: ");
        //int concursante = scanner.nextInt();
        int ganador = 0;
        int perdedor = 1000;
        int i = 0;
        while(i < 10) {
        	System.out.print("Inserte los caniches que se ha comido este concursante " + (i + 1) + ": ");
            int concursante = scanner.nextInt();
            arr[i++] = concursante;
        	if (concursante > ganador) {
        		ganador = concursante;
        	}if (concursante < perdedor) {
        		perdedor = concursante;
        	}
        	
        }System.out.println("El ganador se ha comido " + ganador + " caniches.");
        System.out.println("El perdedor se ha comido " + perdedor + " caniches.");
        
        
        
        //Recorro el array mostrando su contenido
        /*for( int j = 0; j < i; j++){
            System.out.println(arr[j]);
        }*/
    }
}