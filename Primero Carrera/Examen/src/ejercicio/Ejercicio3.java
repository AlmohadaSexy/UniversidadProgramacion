package ejercicio;

import java.util.Scanner;

public class Ejercicio3 {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	int contador = 0;
	    	System.out.print("Linea: ");
	        String oracion = sc.nextLine();
	        int length = oracion.length();
	        System.out.print("Caracter a reemplazar: ");
	        char letra = sc.nextLine().charAt(0);
	        System.out.print("Reemplazar por: ");
	        char reem = sc.nextLine().charAt(0);
	        System.out.print("Resultado: ");
	        for(int i = 0; i < length; i++) {
	        	char resultao = oracion.charAt(i);
	        	if(resultao == letra) {
	        		System.out.print("-" + reem + "-");
	        	}else {
	        		System.out.print(oracion.charAt(i));
        	}
        }
    } 
}