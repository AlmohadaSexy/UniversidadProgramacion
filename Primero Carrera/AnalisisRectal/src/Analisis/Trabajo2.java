package Analisis;
import javax.swing.*;
public class Trabajo2 {
    public static void main(String[] args) {
    	double i = 0;
        double E, Dh, Re, x, n, derecha, izquierda;
        
        //Pedimos los valores de E, Dh y Re
        String stringE = JOptionPane.showInputDialog(null,"Ingresa un valor de E","Valor para E",JOptionPane.QUESTION_MESSAGE);   
    	E = Double.parseDouble(stringE);
    	String stringDh = JOptionPane.showInputDialog(null,"Ingresa un valor de Dh","Valor para Dh",JOptionPane.QUESTION_MESSAGE);
    	Dh = Double.parseDouble(stringDh);
    	String stringRe = JOptionPane.showInputDialog(null,"Ingresa un valor de Re","Valor para Re",JOptionPane.QUESTION_MESSAGE);
    	Re = Double.parseDouble(stringRe);
        
    	//Realizamos las operaciones mediante métodos
    	double resul1 = Div1(Re);
        double resul2 = Div2(E, Dh);
        
        JOptionPane.showMessageDialog(null, "Calculating", "Warning!", JOptionPane.WARNING_MESSAGE);    	
        
        //En este for vamos acercándonos al valor exacto de X
        for(x = -100; i < 30000; i++) {
        	n = - x / 2;
        	izquierda = izquierda1(n);
        	derecha = derecha1(x, resul1, resul2);
            double precision = 0.001;
            int incrementosPrecision = 500;
            for (int j = 0; j < incrementosPrecision; j++) {
            	if (derecha - izquierda >= precision || izquierda - derecha >= precision) {
                	x = x + (precision*10);
                }
            	precision /= 100;
            }
        }
        double resulfin = thend(x);
        JOptionPane.showMessageDialog(null, "x es igual a " + x + "\nf es igual a " + resulfin, "Solución", JOptionPane.PLAIN_MESSAGE);
    }
    public static double Div1(double abajo) {
		return 2.51 / abajo;
	}
    public static double Div2(double arriba, double abajo) {
		return arriba / (3.71 * abajo);
    }
    public static double derecha1(double variable, double frac1, double frac2) {
    	return variable * frac1 + frac2;
    }
    public static double izquierda1(double variable) {
    	return Math.pow(10, variable);
    }
    public static double thend(double pexis) {
    	return 1 / (pexis * pexis);
    }
}