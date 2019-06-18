package ejercicios2;

import java.util.Scanner;

public class Ejercicios2_6 {
    public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);
    	double termino1;
        double termino2;
        double suma = 4;
        int suma1 = 1;
        int i = 3;
        int j = 5;
        System.out.println("CALCULANDO PI");
        System.out.println();
        System.out.print("Ingrese: ");
        int dig = scanner.nextInt();
        for(int k = 1; k <= dig; k++){
            termino1 = (double) 4/i;
            termino2 = (double) 4/j;
            if(termino2 < termino1){
                suma = suma - termino1;
                i+=4;
                if(suma > termino1){
                    suma = suma + termino2;
                    j+=4;
                }
            }
        }
        double diferencia = Math.PI - suma;
        System.out.println("PI calculado: " + suma);
        System.out.println("Diferencia de PI real: " + diferencia);
    } 
}
