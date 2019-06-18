package ejercicios3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios3_7b {
    public static void main(String[] args) {
    	Random rnd = new Random();
    	//defino un array de 100 enteros
        int arr[] = new int[100];
        int i = 0;
        int max = 1000;
        int min = 1;
        //mientras i sea menor que 100
        while(i < 100 ) {
            int numero = rnd.nextInt(max - min + 1) - min;
        	//asigna numero aleatorio en arr[i] y luego incrementa el valor de i
            arr[i++] = numero;
            }
        int par[] = new int[100];
        int impar[] = new int[100];
        int k = 0;
        int l = 0;
        System.out.print("Posición");
        System.out.print("\t");
        System.out.println("Número");
        System.out.println();
        //Recorro el array mostrando su contenido
        for( int j = 0; j < i; j++){
            
            	System.out.print(j);
                System.out.print("\t");
                System.out.print("\t");
                System.out.println(arr[j]);
            if(arr[j] % 2 == 0) {
            	par[k] = arr[j];
            	k++;
            } else {
            	impar[l] = arr[j];
            	l++;
            }
            
        }
        System.out.println();
        System.out.println();
        System.out.print("\t");
        System.out.print("Números pares");
        System.out.println("\t");
        System.out.println();
        //Recorro el array mostrando su contenido
        for(k = 0; k < i; k++){
                System.out.print("\t");
                System.out.println(par[k]);
        }
        System.out.println();
        System.out.println();
        System.out.print("\t");
        System.out.print("Números impares");
        System.out.println("\t");
        System.out.println();
        //Recorro el array mostrando su contenido
        for(l = 0; l < i; l++){
                System.out.print("\t");
                System.out.println(impar[l]);
        }
    }
}