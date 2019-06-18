package ejercicios3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios3_9 {
	public static void main(String[] args) {
		 int matriza[][] = new int [3][3];
         int matrizb[][] = new int [3][3];
         int matrizc[][] = new int [3][3];
         int i, j;
         
         Scanner dato = new Scanner (System.in);
         
         System.out.println("Datos de la Matriz 1 :");
         
         for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 System.out.print("Escribir valor " + i + ", " + j + " : ");
                 matriza [i][j]= dato.nextInt();
                }
            }
            
            System.out.println("Datos de la Matriz 2 :");
            
            for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 System.out.print("Escribir valor " + i + ", " + j + " : ");
                 matrizb [i][j]= dato.nextInt();
                }
            }
            
            for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 matrizc [i][j]= matriza[i][j]+matrizb[i][j];
                }
            }
            
            System.out.println("Matriz resultante de la suma :");
    for (i=0;i<=2;i++){
            for (j=0;j<=2;j++) {
                System.out.print("\t" + matrizc[i][j] + " ");
            }
            System.out.println("");
            
        }
    }
}