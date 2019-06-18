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
public class Ejercicios2_7e {
    public static void main(String [] args ) {
    	int size = 9;
    	int col = 1;
    	int row = 0;
    	int contador1 = 0;
    	int contador2 = 0;
    	for(row = 1; row <= size; row++) {
    		while (row == 1 && contador1 <= size) {
    			System.out.print("# ");
    			contador1++;
    		}if(row == 1) {
    			System.out.println();
    		}
    		for (col = 1; col <= size; col++) {
    		//while (col <= size) {
    			if (col == 1) {
    				System.out.print("# ");
    			}
    			if (col == size) {
    				System.out.print("# ");
    			} System.out.print("  ");
    			//col++;
    		}if(row == size) {
    			System.out.println();
    		}while (row == size && contador2 <= size) {
    			System.out.print("# ");
    			contador2++;
    		}System.out.println();
    	}
	}
}//EL PUTO E!!