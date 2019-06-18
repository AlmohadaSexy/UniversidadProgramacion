package ejercicios;

import java.util.Scanner;

public class Ejercicios2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	char letra1 = 'o';
    	char letra2 = 'n';
    	int contador = 0;
    	System.out.print("Introduzca una palabra: ");
        String palabro = sc.nextLine();
        int length = palabro.length();
        for(int i = 0; i < length - 1; i++) {
        	if(palabro.charAt(i) == letra1 && palabro.charAt(i + 1) == letra2) {
        		contador++;
        	}
        }System.out.println("Su palabra " + palabro + " incluye " + contador + " " + letra1 + letra2);
    } 
}