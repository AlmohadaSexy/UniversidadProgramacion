package ejercicio;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int suma = 0;
    	int i = 0;
    	int mayor = 0;
    	while(suma < 100) {
        	System.out.print("Inserte un numero: ");
            int numero = sc.nextInt();
        	if (numero > 0) {
        		suma = suma + numero;
        		if (numero > mayor) {
            		mayor = numero;
            	}
        	}else {
        		System.out.println("Su numero es negativo o 0.");
        	}
        }
    	System.out.println("El numero mas grande que ha introducido es " + mayor);
    }
}