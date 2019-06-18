package ejercicio;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el valor de x: ");
        double x = sc.nextDouble();
        System.out.print("Introduzca el valor de y: ");
        double y = sc.nextDouble();
        System.out.println(Operacion(x,y));
    }

    public static double Operacion(double x, double y) {
    	return (1/2) * x * y + x * x + y * y;
    }
}