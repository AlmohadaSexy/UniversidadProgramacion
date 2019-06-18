package ejercicios;

import java.util.Scanner;

public class Ejercicios3 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	char resultao = ' ';
		char resultao1 = ' ';
    	int contador = 0;
    	System.out.print("Introduzca su nombre: ");
    	String nombre = sc.nextLine();
    	int length = nombre.length();
    	for(int i = 0; i < length; i++) {
         	if(i == 0) {
         		resultao = nombre.charAt(i);
         	}
         	if(nombre.charAt(i) == ' ') {
         		resultao1 = nombre.charAt(i+1);
         	}
    	}
		System.out.println(resultao + "" + resultao1);
    } 
}