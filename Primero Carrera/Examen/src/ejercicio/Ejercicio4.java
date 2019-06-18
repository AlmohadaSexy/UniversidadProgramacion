package ejercicio;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char [][] autobus = new char [25][4];
        char reserva = 'X';
        char libre = 'O';
        int fila = 0, columna = 0;
        boolean winner = false;
        int contador = 0;
        
        for(int ii = 0; ii < 25; ii++) {
        	for(int jj = 0; jj < 4; jj++) {
        		autobus[ii][jj] = libre;
        	}
        }
        
        
        System.out.println("En este programa tenemos 4 opciones: ");
    	System.out.println("La primera (1) consiste en facturar a alguien, reservar un asiento para vender un billete. ");
    	System.out.println("La segunda (2) consiste en visualizar el autobus y los asientos que quedan libres. ");
    	System.out.println("La tercera (3) es solamente para terminar el programa y ver en pantalla cuanto hemos ganado con este viaje. ");
    	System.out.println("La cuarta (4) opcion es un chuletario por si se te olvida que hacian las opciones.");
    	System.out.println();
    	
        int asientoslibre = 1;
        while (winner == false){
        	
        	System.out.println("¿Que quieres hacer?");
        	System.out.print("Opcion ");
        	int opcion = sc.nextInt();
        	
        	if (opcion == 1) {
        		System.out.println("¿Cuantos billetes va a comprar?");
        		int numbill = sc.nextInt();
	        	contador = contador + numbill;
	        	asientoslibre = 25 * 4 - contador;
	        	for(int kk = 1; kk<=numbill; kk++) {
		        	System.out.print("Escribe fila del 1 al 25:");
		        	fila = (sc.nextInt() - 1);
		        	while (fila >= 25 || fila < 0) {
		        		System.out.print("Introduzca una fila valida: ");
		        		fila = (sc.nextInt() - 1);
		        	} 
		        
		        	System.out.print("Escribe asiento del 1 al 4:");
		        	columna = (sc.nextInt() - 1);
		        	while (columna >= 4 || columna < 0) {
		        		System.out.print("Introduzca una columna valida: ");
		        		columna = (sc.nextInt() - 1);
		        	} 
	        	
		        	//comprobacion si el asiento esta disponible
		        	if (autobus[fila][columna] == 'X'){
		        		System.out.println("Este asiento ya esta ocupado... ¿Quiere ver el autobus?");
		        		continue;
		        	} else {
		        		autobus[fila][columna] = reserva;
		        	}
	        	}
        	}
          
        	//dibujar autobus
        	if (opcion == 2) {
        	for(int ii = 0; ii < 25; ii++) {
        		for(int jj = 0; jj < 4; jj++) {
        			System.out.print("[ " + autobus[ii][jj] + " ] ");
        		}
        		System.out.println();
        	}
        	asientoslibre = 25 * 4 - contador;
        	System.out.println("Quedan " + asientoslibre + " asientos libres.");
        	System.out.println();
        	System.out.println();
        	}
        	
        	
        	if(opcion == 3 || asientoslibre == 0) {
        		winner = true;
        		
        		double dineros = 25.5 * contador;
        		System.out.println("Hemos ganado " + dineros + "€");
        	}
        	if(opcion == 4) {
        		System.out.println("En este programa tenemos 4 opciones: ");
            	System.out.println("La primera (1) consiste en facturar a alguien, reservar un asiento para vender un billete. ");
            	System.out.println("La segunda (2) consiste en visualizar el autobus y los asientos que quedan libres. ");
            	System.out.println("La tercera (3) es solamente para terminar el programa y ver en pantalla cuanto hemos ganado con este viaje. ");
            	System.out.println("La cuarta (4) opcion es un chuletario por si se te olvida que hacian las opciones.");
            	System.out.println();
        	}
        } 
        
    }
}