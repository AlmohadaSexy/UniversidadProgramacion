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
public class Ejercicios2_72 {
    public static void main(String [] args ){
        for(int row = 0; row < 7; row++){
        	if((row % 2) == 0) {
        		System.out.print(" ");
        	}
            for(int col = 0; col < 7; col++){
                System.out.print("# ");
            } System.out.println();
        }
    }
}//checkers