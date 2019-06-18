package ejercicios;

import java.util.Scanner;

public class Ejercicios1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int contador = 0;
    	System.out.print("Introduzca una palabra: ");
        String palabro = sc.nextLine();
        int length = palabro.length();
        System.out.print("Introduzca la letra que desea escanear: ");
        char letra = sc.nextLine().charAt(0);
        for(int i = 0; i < length; i++) {
        	char resultao = palabro.charAt(i);
        	if(resultao == letra) {
        		contador++;
        	}
        }System.out.println("Su palabra " + palabro + " incluye " + contador + " " + letra);
    } 
}