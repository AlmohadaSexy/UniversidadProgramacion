package ejercicios3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios3_7 {
    public static void main(String[] args) {
    	Random rnd = new Random();
    	//defino un array de 100 enteros
        int arr[] = new int[100];
        int i = 0;
        int max = 1000;
        int min = 1;
        //minetras numero sea distinto de CERO y i sea menor que 100
        while(i < 100 ) {
            int numero = rnd.nextInt(max - min + 1) - min;
        	//asigna numero en arr[i] y luego incrementa el valor de i
            arr[i++] = numero;
            
            //añado el siguiente valor
            
        }System.out.print("Posición");
        System.out.print("\t");
        System.out.println("Número");
        System.out.println();
        //Recorro el array mostrando su contenido
        for( int j = 0; j < i; j++){
            
            	System.out.print(j);
                System.out.print("\t");
                System.out.print("\t");
                System.out.println(arr[j]);
            
        }
    } 
}