package ejercicios;

import java.util.Scanner;

public class Ejercicios4 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int contador = 0;
    	System.out.print("Introduzca una palabra: ");
    	String nombre = sc.nextLine();
    	int length = nombre.length();
    	for(int i = length - 1; i >= 0; i--) {
        	System.out.print(nombre.charAt(i));
        }
    } 
}