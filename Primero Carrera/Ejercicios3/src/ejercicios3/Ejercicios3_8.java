package ejercicios3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios3_8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[][] tablero = new char [3][3];
        char turno = 'X';
        int fila, columna;
        boolean winner = false;
        
        
        while (winner == false){
       
          System.out.println("Turno" + turno);
        
          System.out.println("Escribe fila del 1 al 3:");
          fila = (sc.nextInt() - 1);
        
          System.out.println("Escribe columna del 1 al 3:");
          columna = (sc.nextInt() -1);
          
          //comprobacion si la casilla esta disponible
          if (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O'){
              System.out.println("Esta casilla ya esta ocupada...");
              continue;
          } else {
              tablero[fila][columna] = turno;
          }
          
          //rellenado de espacios en el tablero para mantener forma
          for (int row = 0; row < 3; row++){
              for ( int col = 0; col < 3; col++){
                  if (tablero[row][col] == 'X' || tablero[row][col] == 'O'){
                      tablero[row][col] = tablero[row][col];
                  } else {
                      tablero[row][col] = ' ';
                  }
                
              }
          }
          
          //cambio de turno
          if(turno == 'X'){
              turno = 'O';
          } else {
              turno = 'X';
          }
          
          //dibujar tablero
          for (int row = 0; row < 3; row++){
              System.out.print("|");
              for (int col = 0; col < 3; col++){
                  System.out.print(tablero[row][col] + "|");
              }
              System.out.println();
          }
          
          //comprueba ganadores
          if((((tablero[0][0] & tablero[0][1] & tablero[0][2]) == 'X') ||
             ((tablero[1][0] & tablero[1][1] & tablero[1][2]) == 'X') ||
             ((tablero[2][0] & tablero[2][1] & tablero[2][2]) == 'X') ||
             ((tablero[0][0] & tablero[1][0] & tablero[2][0]) == 'X') ||
             ((tablero[0][1] & tablero[1][1] & tablero[2][1]) == 'X') ||
             ((tablero[0][2] & tablero[1][2] & tablero[2][2]) == 'X') ||
             ((tablero[0][0] & tablero[1][1] & tablero[2][2]) == 'X') ||
             ((tablero[0][2] & tablero[1][1] & tablero[2][0]) == 'X')) ||
             ((tablero[0][0] & tablero[0][1] & tablero[0][2]) == 'O') ||
             ((tablero[1][0] & tablero[1][1] & tablero[1][2]) == 'O') ||
             ((tablero[2][0] & tablero[2][1] & tablero[2][2]) == 'O') ||
             ((tablero[0][0] & tablero[1][0] & tablero[2][0]) == 'O') ||
             ((tablero[0][1] & tablero[1][1] & tablero[2][1]) == 'O') ||
             ((tablero[0][2] & tablero[1][2] & tablero[2][2]) == 'O') ||
             ((tablero[0][0] & tablero[1][1] & tablero[2][2]) == 'O') ||
             ((tablero[0][2] & tablero[1][1] & tablero[2][0]) == 'O')){
              winner = true;
              System.out.println("Ha ganado!!");
          }
            
          
        } 
    }
}