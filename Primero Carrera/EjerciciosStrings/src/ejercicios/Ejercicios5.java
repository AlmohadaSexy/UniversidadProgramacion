package ejercicios;

import java.util.Scanner;

public class Ejercicios5 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int contador = 0;
    	System.out.print("Introduzca una palabra: ");
        String palabro = sc.nextLine();
        int length = palabro.length();
        for(int i = 0; i < length; i++) {
        	
        	if(palabro.charAt(i) >= 'f' && palabro.charAt(i) <= 't' || palabro.charAt(i) >= 'F' && palabro.charAt(i) <= 'T') {
        		System.out.print(palabro.charAt(i));
        	}
        }
    } 
}