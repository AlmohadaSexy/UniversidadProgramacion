package Ejercicios1;
import java.util.Scanner;
public class Ejercicios1_5 {
    public static void main(String[] args) {
        //esta clase permite leer datos por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a calcular [f(x)=1/3x^2 + 2x + 15] para cualquier valor de X");
        System.out.println("");
        //mensaje para el usuario
        System.out.print("Ingrese un valor cualquiera de X: ");
        double x = scanner.nextDouble();
        
        //hacemos las operaciones
        double y = x * x /3 + 2 * x + 15;
        
        //imprimimos las operaciones
        System.out.println("El resultado de f(x) es igual a " + y);
    }
}
