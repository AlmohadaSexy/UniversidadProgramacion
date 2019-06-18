package ejercicios3;

import java.util.Scanner;

public class Ejercicios3_1b {
    public static void main(String[] args) {
    	//defino un array de 100 enteros
        int arr[] = new int[100];
        int numero = 1;
        int i = 0;
       
        //minetras numero sea distinto de CERO y i sea menor que 100
        while( numero != 0 && i < 100 ) {
            //asigna numero en arr[i] y luego incrementa el valor de i
            arr[i++] = numero;
            
            //añado el siguiente valor
            numero = numero + 1;
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