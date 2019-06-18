/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios2;

/**
 *
 * @author Ignacio
 */
public class Ejercicios2_7c {
    public static void main(String [] args ){
    	int size = 9;
    	int row = 1;
    	int contador1 = 1;
    	for(row = 1; row <= size; row++){
        	for(int col = 1; col <= row; col++){
                System.out.print("  ");
            } System.out.print("# ");
    			for (int col = 1; col <= size - row; col++) {
    				System.out.print("# ");
    			} System.out.println();
    		}
    	}
	}//EL PUTO C!!