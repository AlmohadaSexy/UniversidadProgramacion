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
public class Ejercicios2_7g {
    public static void main(String [] args ) {
    	int size = 9;
    	int col = 0;
    	int contador1 = 0;
    	int contador2 = 0;
    	for(int row = 1; row < (size - 1); row++) {
    		while (row == 1 && contador1 != size) {
    			System.out.print("# ");
    			contador1++;
    		}if(row == 1) {
    			System.out.println();
    		}
    		/*for(col = 0; col < row; col++) {
                System.out.print("  ");
            } System.out.print("# ");*/
            for(col = row; col < 8; col++){
                System.out.print("  ");
            }System.out.print("# ");
			for (col = 1; col < size - row; col++) {
				System.out.print("  ");
			}if(row == 7) {
    			System.out.println();
    		}while (row == 7 && contador2 != size) {
    			System.out.print("# ");
    			contador2++;
    		}
			System.out.println();
		}
	}
}//EL PUTO G!!